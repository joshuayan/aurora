/*
 * Copyright (c) 2020 Mosaic, Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.mosaic.colorscheme

import androidx.compose.ui.graphics.Color

open class BaseColorScheme(
    val displayName: String,
    val backgroundStart: Color,
    val backgroundEnd: Color,
    val foreground: Color
) : MosaicColorScheme {
    constructor(displayName: String, background: Color, foreground: Color) :
            this(displayName, background, background, foreground)

    override val backgroundColorEnd: Color
        get() = backgroundEnd
    override val backgroundColorStart: Color
        get() = backgroundStart
    override val foregroundColor: Color
        get() = foreground

    override fun getDisplayName(): String {
        return displayName
    }

    override fun shift(
        backgroundShiftColor: Color,
        backgroundShiftFactor: Float,
        foregroundShiftColor: Color,
        foregroundShiftFactor: Float
    ): MosaicColorScheme {
        return ShiftColorScheme(
            this, backgroundShiftColor,
            backgroundShiftFactor, foregroundShiftColor,
            foregroundShiftFactor, true
        )
    }

    override fun shade(shadeFactor: Float): MosaicColorScheme {
        return ShadeColorScheme(this, shadeFactor)
    }

    override fun tint(tintFactor: Float): MosaicColorScheme {
        return TintColorScheme(this, tintFactor)
    }

    override fun tone(toneFactor: Float): MosaicColorScheme {
        return ToneColorScheme(this, toneFactor)
    }

    override fun negate(): MosaicColorScheme {
        return NegatedColorScheme(this)
    }

    override fun invert(): MosaicColorScheme {
        return InvertedColorScheme(this)
    }

    override fun saturate(saturateFactor: Float): MosaicColorScheme {
        return SaturatedColorScheme(this, saturateFactor)
    }

    override fun hueShift(hueShiftFactor: Float): MosaicColorScheme {
        return HueShiftColorScheme(this, hueShiftFactor)
    }

    override fun blendWith(otherScheme: MosaicColorScheme, likenessToThisScheme: Float): MosaicColorScheme {
        return BlendBiColorScheme(this, otherScheme, likenessToThisScheme)
    }
}