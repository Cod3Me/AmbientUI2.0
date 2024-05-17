package project.cod3me.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Composable
fun rememberPauseCircle(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "pause_circle",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(16.708f, 26.542f)
                quadToRelative(0.584f, 0f, 0.959f, -0.375f)
                reflectiveQuadToRelative(0.375f, -0.917f)
                verticalLineTo(14.708f)
                quadToRelative(0f, -0.5f, -0.375f, -0.875f)
                reflectiveQuadToRelative(-0.959f, -0.375f)
                quadToRelative(-0.541f, 0f, -0.916f, 0.375f)
                reflectiveQuadToRelative(-0.375f, 0.917f)
                verticalLineToRelative(10.542f)
                quadToRelative(0f, 0.5f, 0.375f, 0.875f)
                reflectiveQuadToRelative(0.916f, 0.375f)
                close()
                moveToRelative(6.584f, 0f)
                quadToRelative(0.541f, 0f, 0.916f, -0.375f)
                reflectiveQuadToRelative(0.375f, -0.917f)
                verticalLineTo(14.708f)
                quadToRelative(0f, -0.5f, -0.375f, -0.875f)
                reflectiveQuadToRelative(-0.916f, -0.375f)
                quadToRelative(-0.584f, 0f, -0.959f, 0.375f)
                reflectiveQuadToRelative(-0.375f, 0.917f)
                verticalLineToRelative(10.542f)
                quadToRelative(0f, 0.5f, 0.375f, 0.875f)
                reflectiveQuadToRelative(0.959f, 0.375f)
                close()
                moveTo(20f, 36.375f)
                quadToRelative(-3.375f, 0f, -6.375f, -1.292f)
                quadToRelative(-3f, -1.291f, -5.208f, -3.521f)
                quadToRelative(-2.209f, -2.229f, -3.5f, -5.208f)
                quadTo(3.625f, 23.375f, 3.625f, 20f)
                reflectiveQuadToRelative(1.292f, -6.375f)
                quadToRelative(1.291f, -3f, 3.521f, -5.208f)
                quadToRelative(2.229f, -2.209f, 5.208f, -3.5f)
                quadTo(16.625f, 3.625f, 20f, 3.625f)
                reflectiveQuadToRelative(6.375f, 1.292f)
                quadToRelative(3f, 1.291f, 5.208f, 3.521f)
                quadToRelative(2.209f, 2.229f, 3.5f, 5.208f)
                quadToRelative(1.292f, 2.979f, 1.292f, 6.354f)
                reflectiveQuadToRelative(-1.292f, 6.375f)
                quadToRelative(-1.291f, 3f, -3.521f, 5.208f)
                quadToRelative(-2.229f, 2.209f, -5.208f, 3.5f)
                quadToRelative(-2.979f, 1.292f, -6.354f, 1.292f)
                close()
                moveTo(20f, 20f)
                close()
                moveToRelative(0f, 13.75f)
                quadToRelative(5.667f, 0f, 9.708f, -4.042f)
                quadTo(33.75f, 25.667f, 33.75f, 20f)
                reflectiveQuadToRelative(-4.042f, -9.708f)
                quadTo(25.667f, 6.25f, 20f, 6.25f)
                reflectiveQuadToRelative(-9.708f, 4.042f)
                quadTo(6.25f, 14.333f, 6.25f, 20f)
                reflectiveQuadToRelative(4.042f, 9.708f)
                quadTo(14.333f, 33.75f, 20f, 33.75f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberEdgesensorLow(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "edgesensor_low",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.833f, 36.375f)
                quadToRelative(-1.041f, 0f, -1.833f, -0.792f)
                quadToRelative(-0.792f, -0.791f, -0.792f, -1.833f)
                verticalLineTo(6.25f)
                quadToRelative(0f, -1.042f, 0.792f, -1.833f)
                quadToRelative(0.792f, -0.792f, 1.833f, -0.792f)
                horizontalLineToRelative(14.334f)
                quadToRelative(1.041f, 0f, 1.833f, 0.792f)
                quadToRelative(0.792f, 0.791f, 0.792f, 1.833f)
                verticalLineToRelative(27.5f)
                quadToRelative(0f, 1.042f, -0.792f, 1.833f)
                quadToRelative(-0.792f, 0.792f, -1.833f, 0.792f)
                close()
                moveToRelative(14.334f, -26.083f)
                horizontalLineTo(12.833f)
                verticalLineToRelative(19.416f)
                horizontalLineToRelative(14.334f)
                close()
                moveTo(12.833f, 7.667f)
                horizontalLineToRelative(14.334f)
                verticalLineTo(6.25f)
                horizontalLineTo(12.833f)
                close()
                moveToRelative(14.334f, 24.666f)
                horizontalLineTo(12.833f)
                verticalLineToRelative(1.417f)
                horizontalLineToRelative(14.334f)
                close()
                moveTo(5.125f, 23.25f)
                quadToRelative(-0.542f, 0f, -0.937f, -0.375f)
                quadToRelative(-0.396f, -0.375f, -0.396f, -0.958f)
                verticalLineToRelative(-8.792f)
                quadToRelative(0f, -0.542f, 0.396f, -0.937f)
                quadToRelative(0.395f, -0.396f, 0.937f, -0.396f)
                reflectiveQuadToRelative(0.937f, 0.396f)
                quadToRelative(0.396f, 0.395f, 0.396f, 0.937f)
                verticalLineToRelative(8.792f)
                quadToRelative(0f, 0.583f, -0.396f, 0.958f)
                quadToRelative(-0.395f, 0.375f, -0.937f, 0.375f)
                close()
                moveToRelative(29.75f, 4.917f)
                quadToRelative(-0.542f, 0f, -0.937f, -0.375f)
                quadToRelative(-0.396f, -0.375f, -0.396f, -0.959f)
                verticalLineToRelative(-8.791f)
                quadToRelative(0f, -0.5f, 0.396f, -0.896f)
                quadToRelative(0.395f, -0.396f, 0.937f, -0.396f)
                reflectiveQuadToRelative(0.937f, 0.396f)
                quadToRelative(0.396f, 0.396f, 0.396f, 0.896f)
                verticalLineToRelative(8.791f)
                quadToRelative(0f, 0.584f, -0.396f, 0.959f)
                quadToRelative(-0.395f, 0.375f, -0.937f, 0.375f)
                close()
                moveTo(12.833f, 6.25f)
                verticalLineToRelative(1.417f)
                verticalLineTo(6.25f)
                close()
                moveToRelative(0f, 27.5f)
                verticalLineToRelative(-1.417f)
                verticalLineToRelative(1.417f)
                close()
            }
        }.build()
    }
}

@Composable
fun rememberSurroundSound(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "surround_sound",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20.083f, 24.625f)
                quadToRelative(1.917f, 0f, 3.271f, -1.333f)
                quadToRelative(1.354f, -1.334f, 1.354f, -3.25f)
                quadToRelative(0f, -1.917f, -1.354f, -3.271f)
                quadToRelative(-1.354f, -1.354f, -3.271f, -1.354f)
                quadToRelative(-1.916f, 0f, -3.271f, 1.333f)
                quadToRelative(-1.354f, 1.333f, -1.354f, 3.25f)
                quadToRelative(0f, 1.958f, 1.354f, 3.292f)
                quadToRelative(1.355f, 1.333f, 3.271f, 1.333f)
                close()
                moveToRelative(9.5f, 2.208f)
                quadToRelative(1.042f, -1.5f, 1.584f, -3.271f)
                quadToRelative(0.541f, -1.77f, 0.541f, -3.604f)
                quadToRelative(0f, -1.833f, -0.541f, -3.604f)
                quadToRelative(-0.542f, -1.771f, -1.584f, -3.271f)
                quadToRelative(-0.375f, -0.458f, -1f, -0.5f)
                quadToRelative(-0.625f, -0.041f, -1.041f, 0.417f)
                quadToRelative(-0.334f, 0.375f, -0.375f, 0.833f)
                quadToRelative(-0.042f, 0.459f, 0.25f, 0.834f)
                quadToRelative(0.791f, 1.166f, 1.229f, 2.521f)
                quadToRelative(0.437f, 1.354f, 0.437f, 2.77f)
                quadToRelative(0f, 1.459f, -0.437f, 2.792f)
                quadToRelative(-0.438f, 1.333f, -1.229f, 2.5f)
                quadToRelative(-0.292f, 0.417f, -0.25f, 0.875f)
                quadToRelative(0.041f, 0.458f, 0.375f, 0.792f)
                quadToRelative(0.458f, 0.458f, 1.062f, 0.437f)
                quadToRelative(0.604f, -0.021f, 0.979f, -0.521f)
                close()
                moveToRelative(-16.916f, 0.084f)
                quadToRelative(0.333f, -0.334f, 0.354f, -0.792f)
                quadToRelative(0.021f, -0.458f, -0.271f, -0.875f)
                quadToRelative(-0.792f, -1.167f, -1.229f, -2.521f)
                quadToRelative(-0.438f, -1.354f, -0.438f, -2.771f)
                quadToRelative(0f, -1.458f, 0.438f, -2.77f)
                quadToRelative(0.437f, -1.313f, 1.271f, -2.521f)
                quadToRelative(0.25f, -0.375f, 0.229f, -0.834f)
                quadToRelative(-0.021f, -0.458f, -0.354f, -0.833f)
                quadToRelative(-0.459f, -0.458f, -1.063f, -0.417f)
                quadToRelative(-0.604f, 0.042f, -0.979f, 0.5f)
                quadToRelative(-1.083f, 1.5f, -1.625f, 3.271f)
                reflectiveQuadToRelative(-0.542f, 3.604f)
                quadToRelative(0f, 1.834f, 0.542f, 3.604f)
                quadToRelative(0.542f, 1.771f, 1.625f, 3.271f)
                quadToRelative(0.375f, 0.5f, 0.979f, 0.521f)
                quadToRelative(0.604f, 0.021f, 1.063f, -0.437f)
                close()
                moveTo(6.25f, 33.083f)
                quadToRelative(-1.083f, 0f, -1.854f, -0.791f)
                quadToRelative(-0.771f, -0.792f, -0.771f, -1.834f)
                verticalLineTo(9.542f)
                quadToRelative(0f, -1.042f, 0.771f, -1.834f)
                quadToRelative(0.771f, -0.791f, 1.854f, -0.791f)
                horizontalLineToRelative(27.5f)
                quadToRelative(1.083f, 0f, 1.854f, 0.791f)
                quadToRelative(0.771f, 0.792f, 0.771f, 1.834f)
                verticalLineToRelative(20.916f)
                quadToRelative(0f, 1.042f, -0.771f, 1.834f)
                quadToRelative(-0.771f, 0.791f, -1.854f, 0.791f)
                close()
                moveToRelative(0f, -2.625f)
                verticalLineTo(9.542f)
                verticalLineToRelative(20.916f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(27.5f)
                verticalLineTo(9.542f)
                horizontalLineTo(6.25f)
                verticalLineToRelative(20.916f)
                close()
            }
        }.build()
    }
}