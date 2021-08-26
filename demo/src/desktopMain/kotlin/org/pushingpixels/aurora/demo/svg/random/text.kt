package org.pushingpixels.aurora.demo.svg.random

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.pushingpixels.aurora.icon.AuroraIcon
import org.pushingpixels.aurora.utils.toComposeBitmap
import java.io.ByteArrayInputStream
import java.io.IOException
import java.lang.ref.WeakReference
import java.util.*
import javax.imageio.ImageIO
import kotlin.math.min

/**
 * This class has been automatically generated using
 * <a href="https://github.com/kirill-grouchnikov/aurora">Aurora SVG transcoder</a>.
 */
class text private constructor(var _width: Dp, var _height: Dp) : AuroraIcon() {
    @Suppress("UNUSED_VARIABLE") private var shape: Outline? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: Path? = null
    @Suppress("UNUSED_VARIABLE") private var brush: Brush? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var alpha = 1.0f
    private var alphaStack = mutableListOf(1.0f)
    private var colorFilter: ((Color) -> Color)? = null

	private fun _paint0(drawScope : DrawScope) {
with(drawScope) {
// 
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
0.004166666883975267f, 0.0f, 0.0f, 0.0f,
0.0f, 0.004166666883975267f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-0.0f, 0.3333333507180214f, 0.0f, 1.0f)
))}){
// _0
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0
            var shapeText: Outline?
            var generalPathText: Path? = null
            var alphaText = alpha
alphaText = alpha * 1.0f
alphaText = alpha * 1.0f
alphaText = alpha * 1.0f
brush = SolidColor(colorFilter?.invoke(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255))
if (generalPathText == null) {
   generalPathText = Path()
} else {
   generalPathText!!.reset()
}
generalPathText!!.moveTo(21.212402f, 35.0f)
generalPathText!!.lineTo(23.091309f, 25.605469f)
generalPathText!!.lineTo(24.938477f, 25.605469f)
generalPathText!!.lineTo(26.087402f, 32.873535f)
generalPathText!!.lineTo(30.219727f, 25.605469f)
generalPathText!!.lineTo(31.870117f, 25.605469f)
generalPathText!!.lineTo(29.99121f, 35.0f)
generalPathText!!.lineTo(28.74707f, 35.0f)
generalPathText!!.lineTo(30.275585f, 27.357422f)
generalPathText!!.lineTo(26.28291f, 34.371582f)
generalPathText!!.lineTo(24.994335f, 34.371582f)
generalPathText!!.lineTo(23.887304f, 27.338379f)
generalPathText!!.lineTo(22.35498f, 35.0f)
generalPathText!!.close()
generalPathText!!.moveTo(32.34619f, 37.507324f)
generalPathText!!.lineTo(33.964844f, 35.0f)
generalPathText!!.lineTo(32.67754f, 28.106445f)
generalPathText!!.lineTo(34.02959f, 28.106445f)
generalPathText!!.lineTo(34.965233f, 33.29883f)
generalPathText!!.lineTo(38.111134f, 28.106445f)
generalPathText!!.lineTo(39.291798f, 28.106445f)
generalPathText!!.lineTo(33.64746f, 37.507324f)
generalPathText!!.close()
shapeText = Outline.Generic(generalPathText!!)
drawOutline(outline = shapeText!!, style = Fill, brush=brush!!, alpha = alphaText)
alphaText = alpha * 1.0f
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_1
            var shapeText: Outline?
            var generalPathText: Path? = null
            var alphaText = alpha
alphaText = alpha * 1.0f
alphaText = alpha * 1.0f
alphaText = alpha * 1.0f
brush = SolidColor(colorFilter?.invoke(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255))
if (generalPathText == null) {
   generalPathText = Path()
} else {
   generalPathText!!.reset()
}
generalPathText!!.moveTo(54.575195f, 34.648438f)
generalPathText!!.quadraticBezierTo(51.879883f, 35.36621f, 49.58008f, 35.36621f)
generalPathText!!.quadraticBezierTo(45.72754f, 35.36621f, 43.493652f, 33.103027f)
generalPathText!!.quadraticBezierTo(41.259766f, 30.839844f, 41.259766f, 26.94336f)
generalPathText!!.quadraticBezierTo(41.259766f, 23.00293f, 43.55957f, 20.776367f)
generalPathText!!.quadraticBezierTo(45.859375f, 18.549805f, 49.916992f, 18.549805f)
generalPathText!!.quadraticBezierTo(51.879883f, 18.549805f, 54.44336f, 19.179688f)
generalPathText!!.lineTo(54.44336f, 22.314453f)
generalPathText!!.quadraticBezierTo(51.777344f, 21.450195f, 50.180664f, 21.450195f)
generalPathText!!.quadraticBezierTo(48.23242f, 21.450195f, 47.0459f, 22.944336f)
generalPathText!!.quadraticBezierTo(45.859375f, 24.438477f, 45.859375f, 26.914062f)
generalPathText!!.quadraticBezierTo(45.859375f, 29.448242f, 47.141113f, 30.97168f)
generalPathText!!.quadraticBezierTo(48.42285f, 32.495117f, 50.561523f, 32.495117f)
generalPathText!!.quadraticBezierTo(52.509766f, 32.495117f, 54.575195f, 31.645508f)
generalPathText!!.close()
generalPathText!!.moveTo(66.55762f, 33.271484f)
generalPathText!!.quadraticBezierTo(64.38965f, 35.36621f, 61.914062f, 35.36621f)
generalPathText!!.quadraticBezierTo(59.804688f, 35.36621f, 58.48633f, 34.07715f)
generalPathText!!.quadraticBezierTo(57.16797f, 32.788086f, 57.16797f, 30.737305f)
generalPathText!!.quadraticBezierTo(57.16797f, 28.07129f, 59.299316f, 26.628418f)
generalPathText!!.quadraticBezierTo(61.430664f, 25.185547f, 65.40039f, 25.185547f)
generalPathText!!.lineTo(66.55762f, 25.185547f)
generalPathText!!.lineTo(66.55762f, 23.720703f)
generalPathText!!.quadraticBezierTo(66.55762f, 21.21582f, 63.70117f, 21.21582f)
generalPathText!!.quadraticBezierTo(61.166992f, 21.21582f, 58.57422f, 22.651367f)
generalPathText!!.lineTo(58.57422f, 19.663086f)
generalPathText!!.quadraticBezierTo(61.518555f, 18.549805f, 64.4043f, 18.549805f)
generalPathText!!.quadraticBezierTo(70.71777f, 18.549805f, 70.71777f, 23.574219f)
generalPathText!!.lineTo(70.71777f, 30.69336f)
generalPathText!!.quadraticBezierTo(70.71777f, 32.583008f, 71.93359f, 32.583008f)
generalPathText!!.quadraticBezierTo(72.15332f, 32.583008f, 72.50488f, 32.524414f)
generalPathText!!.lineTo(72.60742f, 34.956055f)
generalPathText!!.quadraticBezierTo(71.23047f, 35.36621f, 70.17578f, 35.36621f)
generalPathText!!.quadraticBezierTo(67.509766f, 35.36621f, 66.74805f, 33.271484f)
generalPathText!!.close()
generalPathText!!.moveTo(66.55762f, 30.942383f)
generalPathText!!.lineTo(66.55762f, 27.675781f)
generalPathText!!.lineTo(65.53223f, 27.675781f)
generalPathText!!.quadraticBezierTo(61.328125f, 27.675781f, 61.328125f, 30.3125f)
generalPathText!!.quadraticBezierTo(61.328125f, 31.206055f, 61.936035f, 31.813965f)
generalPathText!!.quadraticBezierTo(62.543945f, 32.421875f, 63.4375f, 32.421875f)
generalPathText!!.quadraticBezierTo(64.96094f, 32.421875f, 66.55762f, 30.942383f)
generalPathText!!.close()
generalPathText!!.moveTo(84.60449f, 34.91211f)
generalPathText!!.quadraticBezierTo(83.05176f, 35.36621f, 82.1582f, 35.36621f)
generalPathText!!.quadraticBezierTo(76.518555f, 35.36621f, 76.518555f, 30.092773f)
generalPathText!!.lineTo(76.518555f, 21.625977f)
generalPathText!!.lineTo(74.7168f, 21.625977f)
generalPathText!!.lineTo(74.7168f, 18.916016f)
generalPathText!!.lineTo(76.518555f, 18.916016f)
generalPathText!!.lineTo(76.518555f, 16.206055f)
generalPathText!!.lineTo(80.85449f, 15.708008f)
generalPathText!!.lineTo(80.85449f, 18.916016f)
generalPathText!!.lineTo(84.296875f, 18.916016f)
generalPathText!!.lineTo(84.296875f, 21.625977f)
generalPathText!!.lineTo(80.85449f, 21.625977f)
generalPathText!!.lineTo(80.85449f, 29.521484f)
generalPathText!!.quadraticBezierTo(80.85449f, 32.48047f, 83.271484f, 32.48047f)
generalPathText!!.quadraticBezierTo(83.828125f, 32.48047f, 84.60449f, 32.27539f)
generalPathText!!.close()
shapeText = Outline.Generic(generalPathText!!)
drawOutline(outline = shapeText!!, style = Fill, brush=brush!!, alpha = alphaText)
alphaText = alpha * 1.0f
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_2
            var shapeText: Outline?
            var generalPathText: Path? = null
            var alphaText = alpha
alphaText = alpha * 1.0f
alphaText = alpha * 1.0f
alphaText = alpha * 1.0f
brush = SolidColor(colorFilter?.invoke(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255))
if (generalPathText == null) {
   generalPathText = Path()
} else {
   generalPathText!!.reset()
}
generalPathText!!.moveTo(56.25049f, 55.0f)
generalPathText!!.lineTo(57.6292f, 48.106445f)
generalPathText!!.lineTo(58.87969f, 48.106445f)
generalPathText!!.lineTo(57.500977f, 55.0f)
generalPathText!!.close()
generalPathText!!.moveTo(57.879295f, 46.855957f)
generalPathText!!.lineTo(58.129395f, 45.60547f)
generalPathText!!.lineTo(59.379883f, 45.60547f)
generalPathText!!.lineTo(59.129784f, 46.855957f)
generalPathText!!.close()
generalPathText!!.moveTo(61.804688f, 55.15869f)
generalPathText!!.quadraticBezierTo(60.947754f, 55.15869f, 59.802635f, 54.75879f)
generalPathText!!.lineTo(60.03242f, 53.609863f)
generalPathText!!.quadraticBezierTo(61.135643f, 54.21924f, 62.043358f, 54.21924f)
generalPathText!!.quadraticBezierTo(62.58291f, 54.21924f, 62.996777f, 53.927246f)
generalPathText!!.quadraticBezierTo(63.410645f, 53.635254f, 63.49824f, 53.197266f)
generalPathText!!.quadraticBezierTo(63.626465f, 52.556152f, 62.713673f, 52.137207f)
generalPathText!!.lineTo(62.0459f, 51.82617f)
generalPathText!!.quadraticBezierTo(60.561817f, 51.15332f, 60.814453f, 49.890137f)
generalPathText!!.quadraticBezierTo(60.994728f, 48.98877f, 61.736134f, 48.471436f)
generalPathText!!.quadraticBezierTo(62.47754f, 47.9541f, 63.58838f, 47.9541f)
generalPathText!!.quadraticBezierTo(64.166016f, 47.9541f, 64.98486f, 48.112793f)
generalPathText!!.lineTo(65.23496f, 48.163574f)
generalPathText!!.lineTo(65.02676f, 49.20459f)
generalPathText!!.quadraticBezierTo(64.0416f, 48.893555f, 63.42588f, 48.893555f)
generalPathText!!.quadraticBezierTo(62.219826f, 48.893555f, 62.04463f, 49.76953f)
generalPathText!!.quadraticBezierTo(61.93164f, 50.334473f, 62.76826f, 50.72168f)
generalPathText!!.lineTo(63.320507f, 50.975586f)
generalPathText!!.quadraticBezierTo(64.25615f, 51.407227f, 64.585594f, 51.886475f)
generalPathText!!.quadraticBezierTo(64.91504f, 52.365723f, 64.77158f, 53.083008f)
generalPathText!!.quadraticBezierTo(64.59004f, 53.990723f, 63.75596f, 54.574707f)
generalPathText!!.quadraticBezierTo(62.921875f, 55.15869f, 61.804688f, 55.15869f)
generalPathText!!.close()
shapeText = Outline.Generic(generalPathText!!)
drawOutline(outline = shapeText!!, style = Fill, brush=brush!!, alpha = alphaText)
alphaText = alpha * 1.0f
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_3
            var shapeText: Outline?
            var generalPathText: Path? = null
            var alphaText = alpha
alphaText = alpha * 1.0f
alphaText = alpha * 1.0f
alphaText = alpha * 1.0f
brush = SolidColor(colorFilter?.invoke(Color(255, 0, 0, 255)) ?: Color(255, 0, 0, 255))
if (generalPathText == null) {
   generalPathText = Path()
} else {
   generalPathText!!.reset()
}
generalPathText!!.moveTo(83.515625f, 28.339844f)
generalPathText!!.quadraticBezierTo(84.41406f, 28.339844f, 85.56641f, 28.515625f)
generalPathText!!.quadraticBezierTo(86.71875f, 28.691406f, 88.08594f, 29.179688f)
generalPathText!!.quadraticBezierTo(89.12109f, 29.53125f, 89.50195f, 29.628906f)
generalPathText!!.quadraticBezierTo(89.88281f, 29.726562f, 90.27344f, 29.726562f)
generalPathText!!.quadraticBezierTo(91.25f, 29.726562f, 91.75781f, 29.375f)
generalPathText!!.quadraticBezierTo(92.265625f, 29.023438f, 92.71484f, 28.398438f)
generalPathText!!.lineTo(93.32031f, 28.535156f)
generalPathText!!.lineTo(91.328125f, 36.40625f)
generalPathText!!.lineTo(90.64453f, 36.308594f)
generalPathText!!.quadraticBezierTo(90.33203f, 33.90625f, 89.35547f, 32.441406f)
generalPathText!!.quadraticBezierTo(87.51953f, 29.726562f, 83.41797f, 29.726562f)
generalPathText!!.quadraticBezierTo(77.77344f, 29.726562f, 74.296875f, 35.722656f)
generalPathText!!.quadraticBezierTo(71.46484f, 40.625f, 71.46484f, 45.95703f)
generalPathText!!.quadraticBezierTo(71.46484f, 49.6875f, 73.48633f, 51.972656f)
generalPathText!!.quadraticBezierTo(75.50781f, 54.257812f, 79.25781f, 54.257812f)
generalPathText!!.quadraticBezierTo(80.56641f, 54.257812f, 82.109375f, 53.79883f)
generalPathText!!.quadraticBezierTo(83.65234f, 53.339844f, 84.19922f, 52.421875f)
generalPathText!!.quadraticBezierTo(84.55078f, 51.835938f, 85.03906f, 50.078125f)
generalPathText!!.quadraticBezierTo(85.35156f, 48.964844f, 85.82031f, 46.953125f)
generalPathText!!.lineTo(86.25f, 45.15625f)
generalPathText!!.quadraticBezierTo(86.28906f, 45.0f, 86.30859f, 44.833984f)
generalPathText!!.quadraticBezierTo(86.328125f, 44.66797f, 86.328125f, 44.492188f)
generalPathText!!.quadraticBezierTo(86.328125f, 43.61328f, 85.791016f, 43.36914f)
generalPathText!!.quadraticBezierTo(85.25391f, 43.125f, 83.22266f, 42.871094f)
generalPathText!!.lineTo(83.22266f, 42.226562f)
generalPathText!!.lineTo(93.88672f, 42.226562f)
generalPathText!!.lineTo(93.88672f, 42.871094f)
generalPathText!!.quadraticBezierTo(91.85547f, 43.066406f, 91.14258f, 43.57422f)
generalPathText!!.quadraticBezierTo(90.42969f, 44.08203f, 90.0f, 45.742188f)
generalPathText!!.lineTo(88.046875f, 53.242188f)
generalPathText!!.quadraticBezierTo(86.50391f, 54.257812f, 84.0625f, 55.0f)
generalPathText!!.quadraticBezierTo(81.62109f, 55.742188f, 78.76953f, 55.742188f)
generalPathText!!.quadraticBezierTo(73.046875f, 55.742188f, 69.84375f, 52.304688f)
generalPathText!!.quadraticBezierTo(67.03125f, 49.277344f, 67.03125f, 44.82422f)
generalPathText!!.quadraticBezierTo(67.03125f, 38.964844f, 71.46484f, 33.92578f)
generalPathText!!.quadraticBezierTo(76.40625f, 28.339844f, 83.515625f, 28.339844f)
generalPathText!!.close()
generalPathText!!.moveTo(102.03125f, 37.226562f)
generalPathText!!.quadraticBezierTo(102.20703f, 37.226562f, 102.27539f, 37.333984f)
generalPathText!!.quadraticBezierTo(102.34375f, 37.441406f, 102.34375f, 37.578125f)
generalPathText!!.quadraticBezierTo(102.32422f, 37.773438f, 102.30469f, 37.871094f)
generalPathText!!.lineTo(100.35156f, 45.429688f)
generalPathText!!.lineTo(100.78125f, 44.589844f)
generalPathText!!.quadraticBezierTo(102.1875f, 41.835938f, 104.072266f, 39.560547f)
generalPathText!!.quadraticBezierTo(105.95703f, 37.285156f, 107.65625f, 37.285156f)
generalPathText!!.quadraticBezierTo(108.57422f, 37.285156f, 109.072266f, 37.890625f)
generalPathText!!.quadraticBezierTo(109.57031f, 38.496094f, 109.57031f, 39.277344f)
generalPathText!!.quadraticBezierTo(109.57031f, 40.15625f, 109.072266f, 40.73242f)
generalPathText!!.quadraticBezierTo(108.57422f, 41.308594f, 107.69531f, 41.308594f)
generalPathText!!.quadraticBezierTo(107.08984f, 41.308594f, 106.77734f, 41.07422f)
generalPathText!!.quadraticBezierTo(106.46484f, 40.839844f, 106.28906f, 40.527344f)
generalPathText!!.lineTo(106.05469f, 40.097656f)
generalPathText!!.quadraticBezierTo(105.97656f, 39.98047f, 105.86914f, 39.91211f)
generalPathText!!.quadraticBezierTo(105.76172f, 39.84375f, 105.60547f, 39.84375f)
generalPathText!!.quadraticBezierTo(104.84375f, 39.84375f, 103.4082f, 41.972656f)
generalPathText!!.quadraticBezierTo(101.97266f, 44.101562f, 100.83984f, 46.58203f)
generalPathText!!.quadraticBezierTo(100.15625f, 48.085938f, 99.31641f, 50.566406f)
generalPathText!!.quadraticBezierTo(98.78906f, 52.128906f, 97.91016f, 55.0f)
generalPathText!!.lineTo(94.90234f, 55.0f)
generalPathText!!.lineTo(98.14453f, 43.242188f)
generalPathText!!.quadraticBezierTo(98.41797f, 42.226562f, 98.583984f, 41.42578f)
generalPathText!!.quadraticBezierTo(98.75f, 40.625f, 98.75f, 40.117188f)
generalPathText!!.quadraticBezierTo(98.75f, 39.53125f, 98.45703f, 39.21875f)
generalPathText!!.quadraticBezierTo(98.16406f, 38.90625f, 97.44141f, 38.90625f)
generalPathText!!.quadraticBezierTo(97.20703f, 38.90625f, 96.85547f, 38.945312f)
generalPathText!!.quadraticBezierTo(96.50391f, 38.984375f, 96.015625f, 39.04297f)
generalPathText!!.lineTo(96.015625f, 38.398438f)
generalPathText!!.lineTo(96.796875f, 38.242188f)
generalPathText!!.quadraticBezierTo(98.32031f, 37.929688f, 100.12695f, 37.578125f)
generalPathText!!.quadraticBezierTo(101.93359f, 37.226562f, 102.03125f, 37.226562f)
generalPathText!!.close()
generalPathText!!.moveTo(114.02344f, 40.898438f)
generalPathText!!.quadraticBezierTo(114.0625f, 40.703125f, 114.0918f, 40.53711f)
generalPathText!!.quadraticBezierTo(114.12109f, 40.371094f, 114.12109f, 40.195312f)
generalPathText!!.quadraticBezierTo(114.12109f, 39.35547f, 113.62305f, 39.16992f)
generalPathText!!.quadraticBezierTo(113.125f, 38.984375f, 111.75781f, 38.984375f)
generalPathText!!.lineTo(111.75781f, 38.4375f)
generalPathText!!.lineTo(114.62891f, 37.871094f)
generalPathText!!.lineTo(117.734375f, 37.285156f)
generalPathText!!.quadraticBezierTo(117.83203f, 37.265625f, 117.91016f, 37.36328f)
generalPathText!!.quadraticBezierTo(117.98828f, 37.460938f, 117.96875f, 37.558594f)
generalPathText!!.lineTo(117.91016f, 37.83203f)
generalPathText!!.lineTo(114.453125f, 51.11328f)
generalPathText!!.quadraticBezierTo(114.31641f, 51.601562f, 114.25781f, 51.875f)
generalPathText!!.quadraticBezierTo(114.19922f, 52.148438f, 114.19922f, 52.265625f)
generalPathText!!.quadraticBezierTo(114.19922f, 52.714844f, 114.453125f, 52.96875f)
generalPathText!!.quadraticBezierTo(114.70703f, 53.222656f, 115.11719f, 53.222656f)
generalPathText!!.quadraticBezierTo(116.26953f, 53.222656f, 117.99805f, 51.171875f)
generalPathText!!.quadraticBezierTo(119.72656f, 49.121094f, 121.07422f, 46.914062f)
generalPathText!!.quadraticBezierTo(122.28516f, 44.941406f, 123.30078f, 42.51953f)
generalPathText!!.quadraticBezierTo(123.92578f, 41.015625f, 125.09766f, 37.734375f)
generalPathText!!.lineTo(128.04688f, 37.734375f)
generalPathText!!.lineTo(124.35547f, 51.58203f)
generalPathText!!.quadraticBezierTo(124.25781f, 51.972656f, 124.17969f, 52.304688f)
generalPathText!!.quadraticBezierTo(124.10156f, 52.63672f, 124.10156f, 52.851562f)
generalPathText!!.quadraticBezierTo(124.10156f, 53.10547f, 124.21875f, 53.291016f)
generalPathText!!.quadraticBezierTo(124.33594f, 53.476562f, 124.62891f, 53.476562f)
generalPathText!!.quadraticBezierTo(124.921875f, 53.476562f, 125.234375f, 53.251953f)
generalPathText!!.quadraticBezierTo(125.546875f, 53.027344f, 126.015625f, 52.558594f)
generalPathText!!.quadraticBezierTo(126.23047f, 52.34375f, 126.796875f, 51.640625f)
generalPathText!!.quadraticBezierTo(127.14844f, 51.210938f, 127.87109f, 50.33203f)
generalPathText!!.lineTo(128.41797f, 50.703125f)
generalPathText!!.quadraticBezierTo(127.51953f, 52.1875f, 126.54297f, 53.26172f)
generalPathText!!.quadraticBezierTo(124.609375f, 55.429688f, 122.94922f, 55.429688f)
generalPathText!!.quadraticBezierTo(122.08984f, 55.429688f, 121.54297f, 54.960938f)
generalPathText!!.quadraticBezierTo(120.99609f, 54.492188f, 120.99609f, 53.496094f)
generalPathText!!.quadraticBezierTo(120.99609f, 52.98828f, 121.09375f, 52.382812f)
generalPathText!!.quadraticBezierTo(121.19141f, 51.777344f, 121.40625f, 51.015625f)
generalPathText!!.quadraticBezierTo(121.75781f, 49.648438f, 122.30469f, 47.597656f)
generalPathText!!.lineTo(122.734375f, 45.9375f)
generalPathText!!.lineTo(122.59766f, 45.9375f)
generalPathText!!.quadraticBezierTo(119.90234f, 50.410156f, 118.359375f, 52.265625f)
generalPathText!!.quadraticBezierTo(115.68359f, 55.44922f, 113.30078f, 55.44922f)
generalPathText!!.quadraticBezierTo(112.65625f, 55.44922f, 112.12891f, 55.17578f)
generalPathText!!.quadraticBezierTo(111.11328f, 54.628906f, 111.11328f, 53.222656f)
generalPathText!!.quadraticBezierTo(111.11328f, 52.8125f, 111.15234f, 52.558594f)
generalPathText!!.quadraticBezierTo(111.19141f, 52.304688f, 111.28906f, 51.85547f)
generalPathText!!.close()
generalPathText!!.moveTo(144.33594f, 37.32422f)
generalPathText!!.quadraticBezierTo(145.11719f, 37.32422f, 145.72266f, 37.753906f)
generalPathText!!.quadraticBezierTo(146.66016f, 38.398438f, 146.66016f, 39.882812f)
generalPathText!!.quadraticBezierTo(146.66016f, 40.546875f, 146.33789f, 41.728516f)
generalPathText!!.quadraticBezierTo(146.01562f, 42.910156f, 145.17578f, 45.527344f)
generalPathText!!.quadraticBezierTo(147.34375f, 42.20703f, 148.90625f, 40.46875f)
generalPathText!!.quadraticBezierTo(151.73828f, 37.32422f, 153.90625f, 37.32422f)
generalPathText!!.quadraticBezierTo(154.82422f, 37.32422f, 155.58594f, 37.94922f)
generalPathText!!.quadraticBezierTo(156.34766f, 38.57422f, 156.34766f, 39.960938f)
generalPathText!!.quadraticBezierTo(156.34766f, 40.390625f, 155.97656f, 42.05078f)
generalPathText!!.lineTo(153.10547f, 52.695312f)
generalPathText!!.quadraticBezierTo(153.02734f, 52.94922f, 153.16406f, 53.21289f)
generalPathText!!.quadraticBezierTo(153.30078f, 53.476562f, 153.67188f, 53.476562f)
generalPathText!!.quadraticBezierTo(154.02344f, 53.476562f, 154.28711f, 53.30078f)
generalPathText!!.quadraticBezierTo(154.55078f, 53.125f, 154.96094f, 52.714844f)
generalPathText!!.quadraticBezierTo(155.35156f, 52.32422f, 155.5957f, 52.03125f)
generalPathText!!.quadraticBezierTo(155.83984f, 51.73828f, 156.99219f, 50.33203f)
generalPathText!!.lineTo(157.59766f, 50.80078f)
generalPathText!!.lineTo(157.40234f, 51.07422f)
generalPathText!!.quadraticBezierTo(155.9961f, 53.066406f, 154.57031f, 54.248047f)
generalPathText!!.quadraticBezierTo(153.14453f, 55.429688f, 151.75781f, 55.429688f)
generalPathText!!.quadraticBezierTo(151.13281f, 55.429688f, 150.70312f, 55.117188f)
generalPathText!!.quadraticBezierTo(150.03906f, 54.609375f, 150.03906f, 53.41797f)
generalPathText!!.quadraticBezierTo(150.03906f, 53.125f, 150.08789f, 52.79297f)
generalPathText!!.quadraticBezierTo(150.13672f, 52.460938f, 150.23438f, 52.05078f)
generalPathText!!.lineTo(153.04688f, 41.11328f)
generalPathText!!.quadraticBezierTo(153.10547f, 40.878906f, 153.13477f, 40.722656f)
generalPathText!!.quadraticBezierTo(153.16406f, 40.566406f, 153.16406f, 40.410156f)
generalPathText!!.quadraticBezierTo(153.16406f, 39.941406f, 152.91992f, 39.6875f)
generalPathText!!.quadraticBezierTo(152.67578f, 39.433594f, 152.30469f, 39.433594f)
generalPathText!!.quadraticBezierTo(150.9961f, 39.433594f, 149.25781f, 41.40625f)
generalPathText!!.quadraticBezierTo(147.51953f, 43.378906f, 146.23047f, 45.410156f)
generalPathText!!.quadraticBezierTo(145.0586f, 47.48047f, 144.58008f, 48.876953f)
generalPathText!!.quadraticBezierTo(144.10156f, 50.273438f, 142.83203f, 55.0f)
generalPathText!!.lineTo(139.80469f, 55.0f)
generalPathText!!.lineTo(143.51562f, 41.11328f)
generalPathText!!.quadraticBezierTo(143.55469f, 40.9375f, 143.58398f, 40.771484f)
generalPathText!!.quadraticBezierTo(143.61328f, 40.60547f, 143.61328f, 40.429688f)
generalPathText!!.quadraticBezierTo(143.61328f, 39.960938f, 143.4082f, 39.697266f)
generalPathText!!.quadraticBezierTo(143.20312f, 39.433594f, 142.73438f, 39.433594f)
generalPathText!!.quadraticBezierTo(141.5039f, 39.433594f, 139.69727f, 41.484375f)
generalPathText!!.quadraticBezierTo(137.89062f, 43.535156f, 136.73828f, 45.3125f)
generalPathText!!.quadraticBezierTo(135.60547f, 47.05078f, 134.57031f, 49.941406f)
generalPathText!!.quadraticBezierTo(133.94531f, 51.69922f, 132.91016f, 55.0f)
generalPathText!!.lineTo(129.90234f, 55.0f)
generalPathText!!.lineTo(133.71094f, 41.11328f)
generalPathText!!.quadraticBezierTo(133.76953f, 40.898438f, 133.8086f, 40.703125f)
generalPathText!!.quadraticBezierTo(133.84766f, 40.507812f, 133.84766f, 40.29297f)
generalPathText!!.quadraticBezierTo(133.84766f, 39.53125f, 133.32031f, 39.375f)
generalPathText!!.quadraticBezierTo(132.79297f, 39.21875f, 131.28906f, 39.277344f)
generalPathText!!.lineTo(131.28906f, 38.61328f)
generalPathText!!.quadraticBezierTo(133.26172f, 38.30078f, 137.67578f, 37.32422f)
generalPathText!!.lineTo(137.83203f, 37.460938f)
generalPathText!!.lineTo(135.54688f, 45.527344f)
generalPathText!!.quadraticBezierTo(137.71484f, 42.32422f, 139.64844f, 40.17578f)
generalPathText!!.quadraticBezierTo(142.30469f, 37.32422f, 144.33594f, 37.32422f)
generalPathText!!.close()
generalPathText!!.moveTo(155.27344f, 62.597656f)
generalPathText!!.quadraticBezierTo(156.44531f, 62.597656f, 157.04102f, 62.158203f)
generalPathText!!.quadraticBezierTo(157.63672f, 61.71875f, 157.91016f, 60.664062f)
generalPathText!!.lineTo(162.8711f, 41.621094f)
generalPathText!!.quadraticBezierTo(163.0664f, 40.91797f, 163.11523f, 40.60547f)
generalPathText!!.quadraticBezierTo(163.16406f, 40.29297f, 163.16406f, 40.117188f)
generalPathText!!.quadraticBezierTo(163.16406f, 39.472656f, 162.68555f, 39.160156f)
generalPathText!!.quadraticBezierTo(162.20703f, 38.847656f, 161.28906f, 38.847656f)
generalPathText!!.quadraticBezierTo(161.09375f, 38.847656f, 160.91797f, 38.85742f)
generalPathText!!.quadraticBezierTo(160.74219f, 38.867188f, 160.54688f, 38.90625f)
generalPathText!!.lineTo(160.50781f, 38.242188f)
generalPathText!!.lineTo(166.71875f, 37.32422f)
generalPathText!!.quadraticBezierTo(166.83594f, 37.304688f, 166.89453f, 37.460938f)
generalPathText!!.quadraticBezierTo(166.83594f, 37.734375f, 166.79688f, 37.871094f)
generalPathText!!.lineTo(165.74219f, 41.679688f)
generalPathText!!.quadraticBezierTo(167.07031f, 39.921875f, 168.1836f, 39.003906f)
generalPathText!!.quadraticBezierTo(170.19531f, 37.32422f, 172.36328f, 37.32422f)
generalPathText!!.quadraticBezierTo(174.57031f, 37.32422f, 175.83008f, 38.623047f)
generalPathText!!.quadraticBezierTo(177.08984f, 39.921875f, 177.08984f, 42.597656f)
generalPathText!!.quadraticBezierTo(177.08984f, 47.1875f, 173.20312f, 51.347656f)
generalPathText!!.quadraticBezierTo(169.35547f, 55.46875f, 165.21484f, 55.46875f)
generalPathText!!.quadraticBezierTo(164.39453f, 55.46875f, 163.82812f, 55.3125f)
generalPathText!!.quadraticBezierTo(163.26172f, 55.15625f, 162.4414f, 54.785156f)
generalPathText!!.lineTo(162.16797f, 55.9375f)
generalPathText!!.quadraticBezierTo(161.69922f, 57.94922f, 161.5039f, 58.808594f)
generalPathText!!.quadraticBezierTo(160.9961f, 61.054688f, 160.9961f, 61.347656f)
generalPathText!!.quadraticBezierTo(160.9961f, 62.148438f, 161.5039f, 62.36328f)
generalPathText!!.quadraticBezierTo(162.01172f, 62.578125f, 163.51562f, 62.65625f)
generalPathText!!.lineTo(163.51562f, 63.242188f)
generalPathText!!.lineTo(155.27344f, 63.242188f)
generalPathText!!.close()
generalPathText!!.moveTo(173.4961f, 42.51953f)
generalPathText!!.quadraticBezierTo(173.4961f, 41.25f, 173.1836f, 40.507812f)
generalPathText!!.quadraticBezierTo(172.57812f, 39.08203f, 170.91797f, 39.08203f)
generalPathText!!.quadraticBezierTo(169.49219f, 39.08203f, 167.8125f, 40.429688f)
generalPathText!!.quadraticBezierTo(166.13281f, 41.777344f, 165.15625f, 44.804688f)
generalPathText!!.quadraticBezierTo(164.375f, 47.265625f, 163.6914f, 49.95117f)
generalPathText!!.quadraticBezierTo(163.00781f, 52.63672f, 163.00781f, 53.10547f)
generalPathText!!.quadraticBezierTo(163.00781f, 53.867188f, 163.62305f, 54.228516f)
generalPathText!!.quadraticBezierTo(164.23828f, 54.589844f, 165.09766f, 54.589844f)
generalPathText!!.quadraticBezierTo(168.53516f, 54.589844f, 171.15234f, 50.234375f)
generalPathText!!.quadraticBezierTo(173.4961f, 46.347656f, 173.4961f, 42.51953f)
generalPathText!!.close()
generalPathText!!.moveTo(177.30469f, 61.484375f)
generalPathText!!.quadraticBezierTo(177.30469f, 60.859375f, 177.69531f, 60.410156f)
generalPathText!!.quadraticBezierTo(178.08594f, 59.960938f, 178.82812f, 59.960938f)
generalPathText!!.quadraticBezierTo(179.3164f, 59.960938f, 179.6875f, 60.146484f)
generalPathText!!.quadraticBezierTo(180.0586f, 60.33203f, 180.46875f, 60.683594f)
generalPathText!!.lineTo(180.74219f, 60.878906f)
generalPathText!!.quadraticBezierTo(180.85938f, 60.976562f, 181.00586f, 61.02539f)
generalPathText!!.quadraticBezierTo(181.15234f, 61.07422f, 181.32812f, 61.07422f)
generalPathText!!.quadraticBezierTo(182.28516f, 61.07422f, 184.4043f, 58.54492f)
generalPathText!!.quadraticBezierTo(186.52344f, 56.015625f, 186.52344f, 54.86328f)
generalPathText!!.quadraticBezierTo(186.52344f, 53.76953f, 185.79102f, 50.566406f)
generalPathText!!.quadraticBezierTo(185.0586f, 47.36328f, 184.375f, 44.86328f)
generalPathText!!.quadraticBezierTo(183.41797f, 41.347656f, 182.62695f, 40.097656f)
generalPathText!!.quadraticBezierTo(181.83594f, 38.847656f, 180.29297f, 38.847656f)
generalPathText!!.quadraticBezierTo(180.17578f, 38.847656f, 179.89258f, 38.876953f)
generalPathText!!.quadraticBezierTo(179.60938f, 38.90625f, 178.92578f, 38.984375f)
generalPathText!!.lineTo(178.92578f, 38.339844f)
generalPathText!!.lineTo(184.25781f, 37.32422f)
generalPathText!!.lineTo(184.66797f, 37.285156f)
generalPathText!!.quadraticBezierTo(185.15625f, 37.226562f, 186.54297f, 41.679688f)
generalPathText!!.quadraticBezierTo(187.79297f, 45.683594f, 188.10547f, 47.5f)
generalPathText!!.lineTo(188.88672f, 52.148438f)
generalPathText!!.quadraticBezierTo(190.9375f, 48.710938f, 191.89453f, 46.875f)
generalPathText!!.quadraticBezierTo(193.76953f, 43.26172f, 193.76953f, 41.816406f)
generalPathText!!.quadraticBezierTo(193.76953f, 41.484375f, 193.65234f, 41.16211f)
generalPathText!!.quadraticBezierTo(193.53516f, 40.839844f, 193.10547f, 40.60547f)
generalPathText!!.lineTo(192.77344f, 40.429688f)
generalPathText!!.quadraticBezierTo(192.46094f, 40.273438f, 192.04102f, 39.84375f)
generalPathText!!.quadraticBezierTo(191.6211f, 39.414062f, 191.6211f, 38.691406f)
generalPathText!!.quadraticBezierTo(191.6211f, 38.085938f, 192.01172f, 37.67578f)
generalPathText!!.quadraticBezierTo(192.40234f, 37.265625f, 193.1836f, 37.265625f)
generalPathText!!.quadraticBezierTo(194.16016f, 37.265625f, 194.76562f, 37.841797f)
generalPathText!!.quadraticBezierTo(195.3711f, 38.41797f, 195.3711f, 39.804688f)
generalPathText!!.quadraticBezierTo(195.3711f, 41.89453f, 193.08594f, 46.523438f)
generalPathText!!.quadraticBezierTo(191.32812f, 50.058594f, 189.16016f, 53.378906f)
generalPathText!!.quadraticBezierTo(186.44531f, 57.51953f, 184.49219f, 59.765625f)
generalPathText!!.quadraticBezierTo(181.38672f, 63.30078f, 179.33594f, 63.30078f)
generalPathText!!.quadraticBezierTo(178.53516f, 63.30078f, 177.91992f, 62.8125f)
generalPathText!!.quadraticBezierTo(177.30469f, 62.32422f, 177.30469f, 61.484375f)
generalPathText!!.close()
generalPathText!!.moveTo(197.65625f, 53.242188f)
generalPathText!!.quadraticBezierTo(197.65625f, 52.51953f, 198.25195f, 51.884766f)
generalPathText!!.quadraticBezierTo(198.84766f, 51.25f, 199.76562f, 51.25f)
generalPathText!!.quadraticBezierTo(200.5664f, 51.25f, 201.24023f, 51.835938f)
generalPathText!!.quadraticBezierTo(201.91406f, 52.421875f, 201.91406f, 53.320312f)
generalPathText!!.quadraticBezierTo(201.91406f, 54.179688f, 201.2793f, 54.82422f)
generalPathText!!.quadraticBezierTo(200.64453f, 55.46875f, 199.7461f, 55.46875f)
generalPathText!!.quadraticBezierTo(198.94531f, 55.46875f, 198.30078f, 54.89258f)
generalPathText!!.quadraticBezierTo(197.65625f, 54.316406f, 197.65625f, 53.242188f)
generalPathText!!.close()
generalPathText!!.moveTo(208.22266f, 30.253906f)
generalPathText!!.quadraticBezierTo(208.22266f, 31.171875f, 207.85156f, 32.246094f)
generalPathText!!.quadraticBezierTo(207.48047f, 33.320312f, 205.29297f, 38.359375f)
generalPathText!!.quadraticBezierTo(204.92188f, 39.21875f, 203.65234f, 42.470703f)
generalPathText!!.quadraticBezierTo(202.38281f, 45.722656f, 201.54297f, 47.929688f)
generalPathText!!.lineTo(200.89844f, 47.79297f)
generalPathText!!.quadraticBezierTo(201.5039f, 44.86328f, 202.10938f, 41.875f)
generalPathText!!.quadraticBezierTo(203.08594f, 37.089844f, 203.16406f, 36.58203f)
generalPathText!!.lineTo(203.76953f, 32.96875f)
generalPathText!!.quadraticBezierTo(204.17969f, 30.449219f, 204.83398f, 29.384766f)
generalPathText!!.quadraticBezierTo(205.48828f, 28.320312f, 206.52344f, 28.320312f)
generalPathText!!.quadraticBezierTo(207.28516f, 28.320312f, 207.7539f, 28.896484f)
generalPathText!!.quadraticBezierTo(208.22266f, 29.472656f, 208.22266f, 30.253906f)
generalPathText!!.close()
shapeText = Outline.Generic(generalPathText!!)
drawOutline(outline = shapeText!!, style = Fill, brush=brush!!, alpha = alphaText)
alphaText = alpha * 1.0f
}
alpha = alphaStack.removeAt(0)
}
alpha = alphaStack.removeAt(0)

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
            return 0.08838501572608948
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.3987833857536316
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 0.7792094349861145
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 0.1983032375574112
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        @Composable
        fun of(width: Dp, height: Dp): AuroraIcon {
            return text(_width = width, _height = height)
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): AuroraIcon.Factory {
            return object : AuroraIcon.Factory {
                override fun createNewIcon(): AuroraIcon {
                    return text(getOrigWidth().dp, getOrigHeight().dp)
                }
            }
        }

        
    }

    override val intrinsicSize: Size
        get() = Size.Unspecified

    override fun getWidth(): Dp {
        return _width
    }

    override fun getHeight(): Dp {
        return _height
    }

    override fun setColorFilter(colorFilter: ((Color) -> Color)?) {
        this.colorFilter = colorFilter
    }

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

