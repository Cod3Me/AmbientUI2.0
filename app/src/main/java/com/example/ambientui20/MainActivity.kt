@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.ambientui20

import android.content.Intent.ShortcutIconResource
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ambientui20.ui.theme.AmbientUI20Theme
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AmbientUI20Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }

    }
}

@Composable
fun App(modifier: Modifier = Modifier) {

    // Divide the screen into equal halves

    Row (
        modifier = Modifier,

        //verticalAlignment = Alignment.CenterVertically

    ) {

        // Left half

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 40.dp,
                    bottom = 40.dp
                )
                .fillMaxHeight(),

            //verticalArrangement = Arrangement.Center,
            //horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Text(text = "")
                ModeButton(name = "Ambient (Edges)", icon = com.google.android.material.R.drawable.ic_arrow_back_black_24)
                Text(text = "")
                ModeButton(name = "Ambilight", icon = com.google.android.material.R.drawable.ic_search_black_24)
                Text(text = "")
                ModeButton(name = "Rainbow", icon = androidx.core.R.drawable.ic_call_answer,)
                Text(text = "")
                ModeButton(name = "Boy", icon = androidx.core.R.drawable.ic_call_decline,)
            }

        }

        //Right half

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(
                    end = 20.dp,
                    bottom = 40.dp,
                    top = 40.dp
                )
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "This should be image X",
                modifier = Modifier
                    .weight(1f)
            )
            Text(
                text = "This should be info/drawer X",
                modifier = Modifier
                    .weight(1f)
            )


        }
    }
}

@Composable
fun ModeButton(
    name: String,
    icon: Int,
){
    Button(
        modifier = Modifier
            .height(60.dp)
            .width(400.dp)
            .padding(top = 0.dp),

        enabled = true,
        shape = RoundedCornerShape(20.dp),
        contentPadding = PaddingValues(0.dp),
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor =
            //MaterialTheme.colorScheme.primary,
            MaterialTheme.colorScheme.secondaryContainer
        )
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier
                .padding(start = 15.dp)
            )
        Text(
            text = name,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp),
            textAlign = TextAlign.Left
        )

    }
}


@Preview(showBackground = true,
    device = "spec:width=1080px,height=1920px,dpi=440,orientation=landscape",
    showSystemUi = true, name = "Odin 2", wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE
)
@Composable
fun AppPreview() {
    AmbientUI20Theme {
        App()
    }
}