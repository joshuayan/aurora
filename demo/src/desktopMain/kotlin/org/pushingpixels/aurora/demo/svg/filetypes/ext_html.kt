package org.pushingpixels.aurora.demo.svg.filetypes

import androidx.compose.ui.geometry.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.painter.Painter
import java.lang.ref.WeakReference
import java.util.*
import kotlin.math.min

/**
 * This class has been automatically generated using
 * <a href="https://github.com/kirill-grouchnikov/aurora">Aurora SVG transcoder</a>.
 */
class ext_html : Painter() {
    @Suppress("UNUSED_VARIABLE") private var shape: Outline? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: Path? = null
    @Suppress("UNUSED_VARIABLE") private var brush: Brush? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var alpha = 1.0f
    private var blendMode = DrawScope.DefaultBlendMode
    private var alphaStack = mutableListOf(1.0f)
    private var blendModeStack = mutableListOf(DrawScope.DefaultBlendMode)

	private fun _paint0(drawScope : DrawScope) {
@Suppress("UNUSED_VARIABLE") var shapeText: Outline?
@Suppress("UNUSED_VARIABLE") var generalPathText: Path? = null
@Suppress("UNUSED_VARIABLE") var alphaText = 0.0f
@Suppress("UNUSED_VARIABLE") var blendModeText = DrawScope.DefaultBlendMode
with(drawScope) {
// 
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.009999999776482582f, 0.0f, 0.0f, 0.0f,
0.0f, 0.009999999776482582f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.13999999687075615f, -0.0f, 0.0f, 1.0f)
))}){
// _0
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(45.0f, 1.0f)
generalPath!!.lineTo(72.0f, 27.7f)
generalPath!!.lineTo(72.0f, 99.0f)
generalPath!!.lineTo(0.0f, 99.0f)
generalPath!!.lineTo(0.0f, 1.0f)
generalPath!!.lineTo(45.0f, 1.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(200, 212, 219, 255), 0.139f to Color(216, 225, 230, 255), 0.359f to Color(235, 240, 243, 255), 0.617f to Color(249, 250, 251, 255), 1.0f to Color(255, 255, 255, 255), start = Offset(36.0f, 99.0f), end = Offset(36.0f, 1.0f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_1
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(45.0f, 1.0f)
generalPath!!.lineTo(72.0f, 27.7f)
generalPath!!.lineTo(72.0f, 99.0f)
generalPath!!.lineTo(0.0f, 99.0f)
generalPath!!.lineTo(0.0f, 1.0f)
generalPath!!.lineTo(45.0f, 1.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 0))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
brush = SolidColor(Color(113, 145, 161, 255))
stroke = Stroke(width=2.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(45.0f, 1.0f)
generalPath!!.lineTo(72.0f, 27.7f)
generalPath!!.lineTo(72.0f, 99.0f)
generalPath!!.lineTo(0.0f, 99.0f)
generalPath!!.lineTo(0.0f, 1.0f)
generalPath!!.lineTo(45.0f, 1.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.9f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_2
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_2_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(12.0f, 44.7f)
generalPath!!.lineTo(26.0f, 32.6f)
generalPath!!.lineTo(26.0f, 38.699997f)
generalPath!!.lineTo(16.5f, 46.6f)
generalPath!!.lineTo(16.5f, 46.699997f)
generalPath!!.lineTo(26.0f, 54.6f)
generalPath!!.lineTo(26.0f, 60.699997f)
generalPath!!.lineTo(12.0f, 48.699997f)
generalPath!!.lineTo(12.0f, 44.699997f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(173, 204, 220, 255), 0.153f to Color(154, 185, 201, 255), 0.529f to Color(112, 143, 159, 255), 0.824f to Color(86, 118, 133, 255), 1.0f to Color(76, 108, 123, 255), start = Offset(19.014f, 60.793f), end = Offset(19.014f, 32.603f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
brush = Brush.linearGradient(0.0f to Color(173, 204, 220, 255), 0.153f to Color(154, 185, 201, 255), 0.529f to Color(112, 143, 159, 255), 0.824f to Color(86, 118, 133, 255), 1.0f to Color(76, 108, 123, 255), start = Offset(19.014f, 62.979f), end = Offset(19.014f, 30.418f), tileMode = TileMode.Clamp)
stroke = Stroke(width=2.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=10.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(12.0f, 44.7f)
generalPath!!.lineTo(26.0f, 32.6f)
generalPath!!.lineTo(26.0f, 38.699997f)
generalPath!!.lineTo(16.5f, 46.6f)
generalPath!!.lineTo(16.5f, 46.699997f)
generalPath!!.lineTo(26.0f, 54.6f)
generalPath!!.lineTo(26.0f, 60.699997f)
generalPath!!.lineTo(12.0f, 48.699997f)
generalPath!!.lineTo(12.0f, 44.699997f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_2_1
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(38.4f, 29.5f)
generalPath!!.lineTo(42.100002f, 29.5f)
generalPath!!.lineTo(34.9f, 64.5f)
generalPath!!.lineTo(31.300001f, 64.5f)
generalPath!!.lineTo(38.4f, 29.5f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(173, 204, 220, 255), 0.153f to Color(154, 185, 201, 255), 0.529f to Color(112, 143, 159, 255), 0.824f to Color(86, 118, 133, 255), 1.0f to Color(76, 108, 123, 255), start = Offset(36.686f, 64.5f), end = Offset(36.686f, 29.5f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
brush = Brush.linearGradient(0.0f to Color(173, 204, 220, 255), 0.153f to Color(154, 185, 201, 255), 0.529f to Color(112, 143, 159, 255), 0.824f to Color(86, 118, 133, 255), 1.0f to Color(76, 108, 123, 255), start = Offset(36.688f, 65.5f), end = Offset(36.688f, 28.5f), tileMode = TileMode.Clamp)
stroke = Stroke(width=2.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=10.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(38.4f, 29.5f)
generalPath!!.lineTo(42.100002f, 29.5f)
generalPath!!.lineTo(34.9f, 64.5f)
generalPath!!.lineTo(31.300001f, 64.5f)
generalPath!!.lineTo(38.4f, 29.5f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_2_2
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(47.2f, 54.8f)
generalPath!!.lineTo(56.7f, 46.899998f)
generalPath!!.lineTo(56.7f, 46.8f)
generalPath!!.lineTo(47.2f, 38.899998f)
generalPath!!.lineTo(47.2f, 32.8f)
generalPath!!.lineTo(61.2f, 44.9f)
generalPath!!.lineTo(61.2f, 49.0f)
generalPath!!.lineTo(47.2f, 61.1f)
generalPath!!.lineTo(47.2f, 54.8f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(173, 204, 220, 255), 0.153f to Color(154, 185, 201, 255), 0.529f to Color(112, 143, 159, 255), 0.824f to Color(86, 118, 133, 255), 1.0f to Color(76, 108, 123, 255), start = Offset(54.186f, 61.052f), end = Offset(54.186f, 32.69f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
brush = Brush.linearGradient(0.0f to Color(173, 204, 220, 255), 0.153f to Color(154, 185, 201, 255), 0.529f to Color(112, 143, 159, 255), 0.824f to Color(86, 118, 133, 255), 1.0f to Color(76, 108, 123, 255), start = Offset(54.186f, 63.238f), end = Offset(54.186f, 30.504f), tileMode = TileMode.Clamp)
stroke = Stroke(width=2.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=10.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(47.2f, 54.8f)
generalPath!!.lineTo(56.7f, 46.899998f)
generalPath!!.lineTo(56.7f, 46.8f)
generalPath!!.lineTo(47.2f, 38.899998f)
generalPath!!.lineTo(47.2f, 32.8f)
generalPath!!.lineTo(61.2f, 44.9f)
generalPath!!.lineTo(61.2f, 49.0f)
generalPath!!.lineTo(47.2f, 61.1f)
generalPath!!.lineTo(47.2f, 54.8f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_3
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(45.0f, 1.0f)
generalPath!!.lineTo(72.0f, 27.7f)
generalPath!!.lineTo(45.0f, 27.7f)
generalPath!!.lineTo(45.0f, 1.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(255, 255, 255, 255), 0.35f to Color(250, 251, 251, 255), 0.532f to Color(237, 241, 244, 255), 0.675f to Color(221, 229, 233, 255), 0.799f to Color(199, 211, 218, 255), 0.908f to Color(173, 189, 199, 255), 1.0f to Color(146, 165, 176, 255), start = Offset(45.037f, 27.813f), end = Offset(58.537f, 14.313f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_4
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(45.0f, 1.0f)
generalPath!!.lineTo(72.0f, 27.7f)
generalPath!!.lineTo(45.0f, 27.7f)
generalPath!!.lineTo(45.0f, 1.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 0))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
brush = SolidColor(Color(113, 145, 161, 255))
stroke = Stroke(width=2.0f, cap=StrokeCap.Butt, join=StrokeJoin.Bevel, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(45.0f, 1.0f)
generalPath!!.lineTo(72.0f, 27.7f)
generalPath!!.lineTo(45.0f, 27.7f)
generalPath!!.lineTo(45.0f, 1.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_5
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.0f, 91.5f)
generalPath!!.lineTo(7.0f, 75.8f)
generalPath!!.lineTo(10.2f, 75.8f)
generalPath!!.lineTo(10.2f, 82.0f)
generalPath!!.lineTo(16.5f, 82.0f)
generalPath!!.lineTo(16.5f, 75.8f)
generalPath!!.lineTo(19.7f, 75.8f)
generalPath!!.lineTo(19.7f, 91.5f)
generalPath!!.lineTo(16.5f, 91.5f)
generalPath!!.lineTo(16.5f, 84.6f)
generalPath!!.lineTo(10.2f, 84.6f)
generalPath!!.lineTo(10.2f, 91.5f)
generalPath!!.lineTo(7.0f, 91.5f)
generalPath!!.close()
generalPath!!.moveTo(26.6f, 91.5f)
generalPath!!.lineTo(26.6f, 78.5f)
generalPath!!.lineTo(21.900002f, 78.5f)
generalPath!!.lineTo(21.900002f, 75.8f)
generalPath!!.lineTo(34.5f, 75.8f)
generalPath!!.lineTo(34.5f, 78.5f)
generalPath!!.lineTo(29.8f, 78.5f)
generalPath!!.lineTo(29.8f, 91.6f)
generalPath!!.lineTo(26.599998f, 91.6f)
generalPath!!.close()
generalPath!!.moveTo(36.5f, 91.5f)
generalPath!!.lineTo(36.5f, 75.8f)
generalPath!!.lineTo(41.3f, 75.8f)
generalPath!!.lineTo(44.2f, 86.5f)
generalPath!!.lineTo(47.100002f, 75.8f)
generalPath!!.lineTo(51.9f, 75.8f)
generalPath!!.lineTo(51.9f, 91.5f)
generalPath!!.lineTo(48.9f, 91.5f)
generalPath!!.lineTo(48.9f, 79.1f)
generalPath!!.lineTo(45.7f, 91.5f)
generalPath!!.lineTo(42.600002f, 91.5f)
generalPath!!.lineTo(39.500004f, 79.1f)
generalPath!!.lineTo(39.500004f, 91.5f)
generalPath!!.lineTo(36.500004f, 91.5f)
generalPath!!.close()
generalPath!!.moveTo(55.2f, 91.5f)
generalPath!!.lineTo(55.2f, 75.9f)
generalPath!!.lineTo(58.4f, 75.9f)
generalPath!!.lineTo(58.4f, 88.9f)
generalPath!!.lineTo(66.4f, 88.9f)
generalPath!!.lineTo(66.4f, 91.6f)
generalPath!!.lineTo(55.2f, 91.6f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(76, 108, 123, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)

}
}



    private fun innerPaint(drawScope: DrawScope) {
	    _paint0(drawScope)


	    shape = null
	    generalPath = null
	    brush = null
	    stroke = null
	    clip = null
	    alpha = 1.0f
	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 0.12999999523162842
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.0
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 0.7400000095367432
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 1.0
        }

        
    }

    override val intrinsicSize: Size
        get() = Size.Unspecified

    override fun DrawScope.onDraw() {
        clipRect {
            // Use the original icon bounding box and the current icon dimension to compute
            // the scaling factor
            val fullOrigWidth = getOrigX() + getOrigWidth()
            val fullOrigHeight = getOrigY() + getOrigHeight()
            val coef1 = size.width / fullOrigWidth
            val coef2 = size.height / fullOrigHeight
            val coef = min(coef1, coef2).toFloat()

            // Use the original icon bounding box and the current icon dimension to compute
            // the offset pivot for the scaling
            var translateX = -getOrigX()
            var translateY = -getOrigY()
            if (coef1 != coef2) {
                if (coef1 < coef2) {
                    val extraDy = ((fullOrigWidth - fullOrigHeight) / 2.0f).toFloat()
                    translateY += extraDy
                } else {
                    val extraDx = ((fullOrigHeight - fullOrigWidth) / 2.0f).toFloat()
                    translateX += extraDx
                }
            }
            val translateXDp = translateX.toFloat().toDp().value
            val translateYDp = translateY.toFloat().toDp().value

            // Create a combined scale + translate + clip transform before calling the transcoded painting instructions
            withTransform({
                scale(scaleX = coef, scaleY = coef, pivot = Offset.Zero)
                translate(translateXDp, translateYDp)
                clipRect(left = 0.0f, top = 0.0f, right = fullOrigWidth.toFloat(), bottom = fullOrigHeight.toFloat(), clipOp = ClipOp.Intersect)
            }) {
                innerPaint(this)
            }
        }
    }
}

