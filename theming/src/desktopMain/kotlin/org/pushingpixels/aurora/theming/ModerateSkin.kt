/*
 * Copyright 2020-2022 Aurora, Kirill Grouchnikov
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
package org.pushingpixels.aurora.theming

import org.pushingpixels.aurora.theming.colorscheme.AuroraColorSchemeBundle
import org.pushingpixels.aurora.theming.colorscheme.AuroraSkinColors
import org.pushingpixels.aurora.theming.colorscheme.MetallicColorScheme
import org.pushingpixels.aurora.theming.colorscheme.SteelBlueColorScheme
import org.pushingpixels.aurora.theming.painter.border.ClassicBorderPainter
import org.pushingpixels.aurora.theming.painter.decoration.MatteDecorationPainter
import org.pushingpixels.aurora.theming.painter.fill.GlassFillPainter
import org.pushingpixels.aurora.theming.painter.fill.SpecularRectangularFillPainter
import org.pushingpixels.aurora.theming.painter.overlay.BottomLineOverlayPainter
import org.pushingpixels.aurora.theming.painter.overlay.TopShadowOverlayPainter
import org.pushingpixels.aurora.theming.shaper.ClassicButtonShaper
import org.pushingpixels.aurora.theming.utils.getColorSchemes

private fun moderateSkinColors(): AuroraSkinColors {
    val result = AuroraSkinColors()

    val kitchenSinkSchemes = getColorSchemes(
        AuroraSkin::class.java.getResourceAsStream(
            "/org/pushingpixels/aurora/theming/kitchen-sink.colorschemes"
        )
    )
    val activeScheme = SteelBlueColorScheme()
    val enabledScheme = MetallicColorScheme()
    val defaultSchemeBundle = AuroraColorSchemeBundle(
        activeScheme, enabledScheme, kitchenSinkSchemes["Gray Disabled"]
    )
    val highlightColorScheme = kitchenSinkSchemes["Moderate Highlight"]
    defaultSchemeBundle.registerHighlightColorScheme(highlightColorScheme)

    result.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.None)

    val headerSchemeBundle = AuroraColorSchemeBundle(
        activeScheme.saturate(0.2f), activeScheme, kitchenSinkSchemes["Gray Disabled"]
    )
    result.registerDecorationAreaSchemeBundle(
        headerSchemeBundle,
        DecorationAreaType.TitlePane, DecorationAreaType.Header
    )

    result.registerAsDecorationArea(
        kitchenSinkSchemes["LightGray Control Pane Background"],
        DecorationAreaType.ControlPane
    )

    return result
}

fun moderateSkin(): AuroraSkinDefinition {
    val painters = AuroraPainters(
        fillPainter = SpecularRectangularFillPainter(GlassFillPainter(), 0.5f),
        borderPainter = ClassicBorderPainter(),
        decorationPainter = MatteDecorationPainter()
    )
    // add an overlay painter to paint a drop shadow along the top
    // edge of toolbars
    painters.addOverlayPainter(TopShadowOverlayPainter.getInstance(100), DecorationAreaType.Toolbar)
    // add an overlay painter to paint separator lines along the bottom
    // edges of menu bars
    painters.addOverlayPainter(
        BottomLineOverlayPainter(colorSchemeQuery = { it.midColor }),
        DecorationAreaType.Header
    )

    return AuroraSkinDefinition(
        displayName = "Moderate",
        colors = moderateSkinColors(),
        painters = painters,
        buttonShaper = ClassicButtonShaper()
    )
}

