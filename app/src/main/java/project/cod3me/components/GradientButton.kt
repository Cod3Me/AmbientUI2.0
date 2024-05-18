package project.cod3me.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AmbGradientButton(){
    Button(
        modifier = Modifier
            .height(40.dp)
            .width(100.dp)
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0x4B0082),
                        Color(0x8A2BE2),
                        Color(0x0000FF)
                    )
                )
            ),
        shape = RoundedCornerShape(12.dp),
        contentPadding = PaddingValues(0.dp),
        onClick = { /*TODO*/ }
    ) {
        Icon(
            imageVector = rememberDiamond(),
            contentDescription = "Buy Pro",
            modifier = Modifier
                .size(30.dp)
                .padding(start = 5.dp)
        )
        Text(
            text = "Buy Pro",
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 5.dp,
                ),
            textAlign = TextAlign.Left
        )


    }
}