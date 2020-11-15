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
package org.pushingpixels.mosaic.painter.border

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import org.pushingpixels.mosaic.colorscheme.MosaicColorScheme
import org.pushingpixels.mosaic.utils.getInterpolatedColor

open class StandardBorderPainter : MosaicBorderPainter {
    override val displayName: String
        get() = "Standard"
    override val isPaintingInnerOutline: Boolean
        get() = false

    override fun paintBorder(
        drawScope: DrawScope,
        size: Size,
        outline: Outline,
        outlineInner: Outline?,
        borderScheme: MosaicColorScheme
    ) {
        with(drawScope) {
            drawOutline(
                outline = outline,
                style = Stroke(width = 1.0f),
                brush = LinearGradient(
                    0.0f to getTopBorderColor(borderScheme),
                    0.5f to getMidBorderColor(borderScheme),
                    1.0f to getBottomBorderColor(borderScheme),
                    startX = 0.0f,
                    startY = 0.0f,
                    endX = 0.0f,
                    endY = size.height,
                    tileMode = TileMode.Repeated
                )
            )
        }
    }

    /**
     * Computes the color of the top portion of the border. Override to provide different visual.
     *
     * @param borderScheme
     * The border color scheme.
     * @return The color of the top portion of the border.
     */
    open fun getTopBorderColor(borderScheme: MosaicColorScheme): Color {
        return borderScheme.ultraDarkColor
    }

    /**
     * Computes the color of the middle portion of the border. Override to provide different visual.
     *
     * @param borderScheme
     * The border color scheme.
     * @return The color of the middle portion of the border.
     */
    open fun getMidBorderColor(borderScheme: MosaicColorScheme): Color {
        return borderScheme.darkColor
    }

    /**
     * Computes the color of the bottom portion of the border. Override to provide different visual.
     *
     * @param borderScheme
     * The border color scheme.
     * @return The color of the bottom portion of the border.
     */
    open fun getBottomBorderColor(borderScheme: MosaicColorScheme): Color {
        return getInterpolatedColor(borderScheme.darkColor, borderScheme.midColor, 0.5f)
    }
}