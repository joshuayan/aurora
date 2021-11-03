/*
 * Copyright 2020-2021 Aurora, Kirill Grouchnikov
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
package org.pushingpixels.aurora.tools.screenshot.theming.schemes

import org.pushingpixels.aurora.theming.*
import org.pushingpixels.aurora.theming.colorscheme.*
import org.pushingpixels.aurora.theming.painter.border.ClassicBorderPainter
import org.pushingpixels.aurora.theming.painter.decoration.ArcDecorationPainter
import org.pushingpixels.aurora.theming.painter.decoration.MarbleNoiseDecorationPainter
import org.pushingpixels.aurora.theming.painter.fill.ClassicFillPainter
import org.pushingpixels.aurora.theming.painter.overlay.BottomLineOverlayPainter
import org.pushingpixels.aurora.theming.shaper.ClassicButtonShaper

fun robotDefaultDarkSkin(accentColorScheme: AuroraColorScheme): AuroraSkinDefinition {
    val displayName = "Robot Default Dark accent ${accentColorScheme.displayName}"
    val buttonShaper = ClassicButtonShaper()
    val painters = AuroraPainters(
        fillPainter = ClassicFillPainter(),
        borderPainter = ClassicBorderPainter(),
        decorationPainter = MarbleNoiseDecorationPainter(
            textureAlpha = 0.3f,
            baseDecorationPainter = ArcDecorationPainter()
        )
    )
    painters.addOverlayPainter(
        BottomLineOverlayPainter(colorSchemeQuery = { it.midColor }),
        DecorationAreaType.TitlePane,
        DecorationAreaType.Header
    )

    val skinColors = AuroraSkinColors()

    val inactiveScheme = accentColorScheme.blendWith(DarkMetallicColorScheme(), 0.6f)
    val defaultSchemeBundle = AuroraColorSchemeBundle(
        accentColorScheme, inactiveScheme, inactiveScheme
    )
    defaultSchemeBundle.registerAlpha(
        0.5f,
        ComponentState.DisabledUnselected,
        ComponentState.DisabledSelected
    )
    defaultSchemeBundle.registerColorScheme(
        inactiveScheme,
        ColorSchemeAssociationKind.Fill,
        ComponentState.DisabledUnselected, ComponentState.DisabledSelected
    )
    skinColors.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.None)
    skinColors.registerAsDecorationArea(
        accentColorScheme,
        DecorationAreaType.TitlePane,
        DecorationAreaType.Header
    )

    return AuroraSkinDefinition(
        displayName = displayName,
        colors = skinColors,
        painters = painters,
        buttonShaper = buttonShaper,
    )
}
