/*
 * Copyright 2020-2023 Aurora, Kirill Grouchnikov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pushingpixels.aurora.component

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFontFamilyResolver
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.resolveDefaults
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import org.pushingpixels.aurora.common.AuroraInternalApi
import org.pushingpixels.aurora.component.model.*
import org.pushingpixels.aurora.component.utils.AuroraThemedIcon
import org.pushingpixels.aurora.component.utils.getLabelPreferredHeight
import org.pushingpixels.aurora.component.utils.getLabelPreferredSingleLineWidth
import org.pushingpixels.aurora.theming.*

@Composable
internal fun iconIntrinsicSize(
    contentModel: IconContentModel,
    presentationModel: IconPresentationModel
): Size {
    val density = LocalDensity.current
    val iconDimension = presentationModel.iconDimension
    return Size(
        iconDimension.width.value * density.density,
        iconDimension.height.value * density.density
    )
}

@OptIn(AuroraInternalApi::class)
@Composable
internal fun AuroraIcon(
    modifier: Modifier,
    contentModel: IconContentModel,
    presentationModel: IconPresentationModel
) {
    val state =
        if (contentModel.enabled) ComponentState.Enabled else ComponentState.DisabledUnselected

    Box(modifier = modifier) {
        if (presentationModel.inheritStateFromParent) {
            CompositionLocalProvider(
                LocalColorSchemeBundle provides presentationModel.colorSchemeBundle
            ) {
                AuroraThemedIcon(
                    icon = contentModel.icon,
                    size = presentationModel.iconDimension,
                    disabledFilterStrategy = presentationModel.iconDisabledFilterStrategy,
                    enabledFilterStrategy = presentationModel.iconEnabledFilterStrategy,
                    activeFilterStrategy = presentationModel.iconEnabledFilterStrategy
                )
            }
        } else if (presentationModel.iconColorFilter != null) {
            Box(
                modifier.size(presentationModel.iconDimension)
                    .paint(painter = contentModel.icon, colorFilter = presentationModel.iconColorFilter)
            )
        } else {
            val decorationAreaType = AuroraSkin.decorationAreaType
            val skinColors = AuroraSkin.colors

            val textColor = skinColors.getColorScheme(decorationAreaType, state).foregroundColor

            // Pass our text color and synthesized model state snapshot to the children
            CompositionLocalProvider(
                LocalTextColor provides textColor,
                LocalModelStateInfoSnapshot provides ModelStateInfoSnapshot(
                    currModelState = state,
                    stateContributionMap = mapOf(state to 1.0f),
                    activeStrength = 1.0f
                ),
                LocalColorSchemeBundle provides presentationModel.colorSchemeBundle
            ) {
                AuroraThemedIcon(
                    icon = contentModel.icon,
                    size = presentationModel.iconDimension,
                    disabledFilterStrategy = presentationModel.iconDisabledFilterStrategy,
                    enabledFilterStrategy = presentationModel.iconEnabledFilterStrategy,
                    activeFilterStrategy = presentationModel.iconEnabledFilterStrategy
                )
            }
        }
    }
}
