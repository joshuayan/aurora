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
package org.pushingpixels.aurora.skin

import org.pushingpixels.aurora.skin.colorscheme.AquaColorScheme
import org.pushingpixels.aurora.skin.colorscheme.AuroraColorSchemeBundle
import org.pushingpixels.aurora.skin.colorscheme.AuroraSkinColors
import org.pushingpixels.aurora.skin.painter.border.ClassicBorderPainter
import org.pushingpixels.aurora.skin.painter.decoration.MatteDecorationPainter
import org.pushingpixels.aurora.skin.painter.fill.MatteFillPainter
import org.pushingpixels.aurora.skin.shaper.PillButtonShaper
import org.pushingpixels.aurora.skin.utils.getColorSchemes

private fun mistBaseSkinColors(accentBuilder: AccentBuilder): AuroraSkinColors {
    val result = AuroraSkinColors()
    val schemes = getColorSchemes(
        AuroraSkin::class.java.getResourceAsStream(
            "/org/pushingpixels/aurora/skins/mist.colorschemes"
        )
    )

    val enabledScheme = schemes["Mist Enabled"]
    val disabledScheme = schemes["Mist Disabled"]

    val defaultSchemeBundle = AuroraColorSchemeBundle(
        accentBuilder.activeControlsAccent!!, enabledScheme, disabledScheme
    )
    defaultSchemeBundle.registerColorScheme(
        accentBuilder.highlightsAccent!!,
        ColorSchemeAssociationKind.HighlightText,
        ComponentState.Selected, ComponentState.RolloverSelected
    )
    defaultSchemeBundle.registerColorScheme(
        accentBuilder.highlightsAccent!!,
        ColorSchemeAssociationKind.Fill,
        ComponentState.Selected
    )
    defaultSchemeBundle.registerColorScheme(
        enabledScheme,
        ColorSchemeAssociationKind.Border, ComponentState.Selected
    )

    defaultSchemeBundle.registerColorScheme(
        accentBuilder.activeControlsAccent!!,
        ColorSchemeAssociationKind.Tab,
        ComponentState.Selected, ComponentState.RolloverSelected
    )

    result.registerDecorationAreaSchemeBundle(
        defaultSchemeBundle,
        DecorationAreaType.None
    )

    val controlPaneBackgroundScheme = schemes["Mist Control Pane Background"]
    result.registerDecorationAreaSchemeBundle(
        AuroraColorSchemeBundle(
            accentBuilder.activeControlsAccent!!, enabledScheme, disabledScheme
        ),
        controlPaneBackgroundScheme,
        DecorationAreaType.ControlPane
    )

    result.registerAsDecorationArea(
        enabledScheme,
        DecorationAreaType.TitlePane,
        DecorationAreaType.Header, DecorationAreaType.Footer,
        DecorationAreaType.Toolbar
    )

    return result
}

private fun mistBasePainters(): AuroraPainters {
    return AuroraPainters(
        fillPainter = MatteFillPainter(),
        borderPainter = ClassicBorderPainter(),
        decorationPainter = MatteDecorationPainter()
    )
}

fun mistSilverSkin(): AuroraSkinDefinition {
    return AuroraSkinDefinition(
        displayName = "Mist Silver",
        colors = mistBaseSkinColors(
            AccentBuilder()
                .withAccentResource("/org/pushingpixels/aurora/skins/mist.colorschemes")
                .withActiveControlsAccent("Mist Silver Light Blue")
                .withHighlightsAccent("Mist Silver Light Blue")
        ),
        painters = mistBasePainters(),
        buttonShaper = PillButtonShaper()
    )
}

fun mistAquaSkin(): AuroraSkinDefinition {
    return AuroraSkinDefinition(
        displayName = "Mist Aqua",
        colors = mistBaseSkinColors(
            AccentBuilder()
                .withActiveControlsAccent(AquaColorScheme())
                .withHighlightsAccent(AquaColorScheme())
        ),
        painters = mistBasePainters(),
        buttonShaper = PillButtonShaper()
    )
}

