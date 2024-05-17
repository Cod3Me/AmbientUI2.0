@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.ambientui20.ui

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ambientui20.R
import project.cod3me.components.*


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
fun App(){
    Scaffold(
        topBar = {
            AmbTopBar(
                title = stringResource(id = R.string.app_name),
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Rounded.PlayArrow, contentDescription = "Start")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Rounded.Favorite, contentDescription = "Buy Pro")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Rounded.Info, contentDescription = "Info")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Rounded.Settings, contentDescription = "Settings")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer
                )
            )
        }
    ) { innerPadding ->
        ScreenContent(modifier = Modifier.padding(innerPadding))
    }
}


@Composable
fun ScreenContent(modifier: Modifier = Modifier) {
    // Divide the screen into equal halves
    Row (
        modifier = Modifier
            .padding(top = 25.dp),

        verticalAlignment = Alignment.CenterVertically

    ) {

        // Left half

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 40.dp,
                    bottom = 20.dp
                )
                .fillMaxHeight(),

            //verticalArrangement = Arrangement.Center,
            //horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Text(text = "")
                ModeButton("Ambient (Edges)", rememberEdgesensorLow())
                Text(text = "")
                ModeButton("Ambilight", rememberSurroundSound())
                Text(text = "")
                ModeButton("Rainbow", Icons.Rounded.Call)
                Text(text = "")
                ModeButton("Reverse Rainbow",Icons.Rounded.LocationOn)
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
    icon: ImageVector,
    contentDescription: String = ""
){
    Button(
        modifier = Modifier
            .height(50.dp)
            .width(400.dp)
            .padding(top = 0.dp),

        enabled = true,
        shape = RoundedCornerShape(20.dp),
        contentPadding = PaddingValues(0.dp),
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
        //    containerColor =
            //MaterialTheme.colorScheme.primary,
          //  MaterialTheme.colorScheme.secondaryContainer
        )
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
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