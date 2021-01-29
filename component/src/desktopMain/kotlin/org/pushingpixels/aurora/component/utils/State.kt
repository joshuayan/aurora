/*
 * Copyright (c) 2020-2021 Aurora, Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.aurora.component.utils

import androidx.compose.animation.core.AnimatedFloat
import androidx.compose.animation.core.AnimationClockObservable
import androidx.compose.animation.core.AnimationEndReason
import androidx.compose.animation.core.FloatTweenSpec
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import org.pushingpixels.aurora.ComponentState
import org.pushingpixels.aurora.ComponentStateFacet
import org.pushingpixels.aurora.ModelStateInfoSnapshot

class StateContributionInfo(var start: Float, var end: Float) {
    var contribution: Float

    fun updateContribution(timelinePosition: Float) {
        contribution = start + timelinePosition * (end - start)
    }

    init {
        contribution = start
    }
}

class ModelStateInfo(var currModelState: ComponentState) {
    var stateContributionMap: MutableMap<ComponentState, StateContributionInfo>
    var activeStrength: Float

    init {
        activeStrength = 0.0f
        stateContributionMap = HashMap()
        stateContributionMap[currModelState] = StateContributionInfo(1.0f, 1.0f)
        sync()
    }

    fun sync() {
        activeStrength = 0.0f

//        activeStrength = stateContributionMap
//            .filter { (activeState, _) -> activeState.isActive }
//            .map { (_, value) -> value.contribution }
//            .fold(initial = 0.0f) { result, contribution -> result + contribution }

        for ((activeState, value) in stateContributionMap) {
            if (activeState.isActive) {
                activeStrength += value.contribution
            }
        }
    }

    fun strength(facet: ComponentStateFacet): Float {
        var result = 0.0f
        for ((activeState, value) in stateContributionMap) {
            if (activeState.isFacetActive(facet)) {
                result += value.contribution
            }
        }
        return result
    }

    fun clear() {
        stateContributionMap.clear()
        stateContributionMap[currModelState] = StateContributionInfo(1.0f, 1.0f)
        sync()
    }

    fun updateActiveStates(position: Float) {
        for (pair in stateContributionMap.values) {
            pair.updateContribution(position)
        }
        sync()
    }

    fun dumpState(stateTransitionPosition: Float) {
        println("######")
        println("Curr state ${currModelState}, position $stateTransitionPosition")
        for ((state, currRange) in stateContributionMap) {
            println("\t $state at ${currRange.contribution} [${currRange.start}-${currRange.end}]")
        }
        println("\tActive strength $activeStrength")
        println("######")
    }

    fun getSnapshot(): ModelStateInfoSnapshot {
        return ModelStateInfoSnapshot(
            currModelState = currModelState,
            stateContributionMap = stateContributionMap.map { (key, value) -> key to value.contribution }.toMap(),
            activeStrength = activeStrength
        )
    }
}

@Composable
fun StateTransitionTracker2(
    modelStateInfo: ModelStateInfo,
    currentState: MutableState<ComponentState>,
    enabled: Boolean,
    selected: Boolean,
    rollover: Boolean,
    pressed: Boolean,
    stateTransitionFloat: MutableState<AnimatedFloat>,
    clock: AnimationClockObservable,
    duration: Int
) {
    var tweakedDuration = duration
    currentState.value = ComponentState.getState(
        isEnabled = enabled,
        isRollover = rollover,
        isSelected = selected,
        isPressed = pressed
    )

    if (currentState.value != modelStateInfo.currModelState) {
        stateTransitionFloat.value = AnimatedFloat(0.0f, clock)
////        if (dump) {
//            println("******** Have new state to move to ${currentState.value} ********")
//            modelStateInfo.dumpState(stateTransitionFloat.value.value)
////        }
        // Need to transition to the new state
        if (modelStateInfo.stateContributionMap.containsKey(currentState.value)) {
            //println("Already has new state")
            // Going to a state that is already partially active
            val transitionPosition = modelStateInfo.stateContributionMap[currentState.value]!!.contribution
            tweakedDuration = (tweakedDuration * (1.0f - transitionPosition)).toInt()
            stateTransitionFloat.value.setBounds(transitionPosition, 1.0f)
            stateTransitionFloat.value.snapTo(transitionPosition)
        } else {
            //println("Does not have new state (curr state ${modelStateInfo.currModelState}) at ${stateTransitionFloat.value}")
            stateTransitionFloat.value.setBounds(0.0f, 1.0f)
            stateTransitionFloat.value.snapTo(0.0f)
            //println("\tat ${stateTransitionFloat.value}")
        }

        // Create a new contribution map
        val newContributionMap: MutableMap<ComponentState, StateContributionInfo> = HashMap()
        if (modelStateInfo.stateContributionMap.containsKey(currentState.value)) {
            // 1. the new state goes from current value to 1.0
            // 2. the rest go from current value to 0.0
            for ((contribState, currRange) in modelStateInfo.stateContributionMap.entries) {
                val newEnd = if (contribState == currentState.value) 1.0f else 0.0f
                newContributionMap[contribState] = StateContributionInfo(
                    currRange.contribution, newEnd
                )
            }
        } else {
            // 1. all existing states go from current value to 0.0
            // 2. the new state goes from 0.0 to 1.0
            for ((contribState, currRange) in modelStateInfo.stateContributionMap.entries) {
                newContributionMap[contribState] = StateContributionInfo(
                    currRange.contribution, 0.0f
                )
            }
            newContributionMap[currentState.value] = StateContributionInfo(0.0f, 1.0f)
        }
        modelStateInfo.stateContributionMap = newContributionMap
        modelStateInfo.sync()

        modelStateInfo.currModelState = currentState.value
//        if (dump) {
//            println("******** After moving to new state *****")
//            modelStateInfo.dumpState(stateTransitionFloat.value)
//        }

//        return TransitionInfo(from = stateTransitionFloat.value.value,
//        to = 1.0f,
//        duration = tweakedDuration)
//        println("Animating over $tweakedDuration from ${stateTransitionFloat.value.value} to 1.0f [${stateTransitionFloat.value.isRunning}]")
        stateTransitionFloat.value.animateTo(
            targetValue = 1.0f,
            anim = FloatTweenSpec(duration = tweakedDuration),
            onEnd = { endReason, _ ->
                //println("Ended with reason $endReason at ${stateTransitionFloat.value}")
                if (endReason == AnimationEndReason.TargetReached) {
                    modelStateInfo.updateActiveStates(1.0f)
                    modelStateInfo.clear()
                    //println("******** After clear (target reached) ********")
                    //modelStateInfo.dumpState(stateTransitionFloat.value)
                }
            }
        )

        //println()
    }

//    return null
    if (stateTransitionFloat.value.isRunning) {
        modelStateInfo.updateActiveStates(stateTransitionFloat.value.value)
//        if (dump) {
        //println("********* [${System.currentTimeMillis()}] During animation ${stateTransitionFloat.value.value} to ${stateTransitionFloat.value.targetValue} *******")
        //modelStateInfo.dumpState(stateTransitionFloat.value.value)
//        }
    }
}

