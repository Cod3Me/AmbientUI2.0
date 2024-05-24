@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

package com.example.ambientui20.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.compose.rememberNavController
import com.example.ambientui20.R
import com.example.ambientui20.ui.theme.AmbientUI20Theme
import project.cod3me.components.AmbGradientButton
import project.cod3me.components.AmbTopBar



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
                    //App()
                    val mainNavController = rememberNavController()
                    NavHost(navController = mainNavController, startDestination = "home"){
                        composable("settings"){ SettingsScreen(onNavigateToApp = {mainNavController.navigate("home")})}
                        composable("home"){ App(onNavigateToSettings = {mainNavController.navigate("settings")}, onNavigateToDialog = {mainNavController.navigate("help")})}
                        dialog("help"){ AmbDialog(onDismissRequest = {mainNavController.popBackStack()})}
                    }
                }
            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(
    onNavigateToSettings: () -> Unit,
    onNavigateToDialog: () -> Unit


){
    Scaffold(
        topBar = {
            AmbTopBar(
                title = stringResource(id = R.string.app_name),
                actions = {

                    AmbGradientButton()

                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Rounded.PlayArrow, contentDescription = "Start")
                    }

                    IconButton(onClick = {onNavigateToDialog()}) {
                        Icon(imageVector = Icons.Rounded.Info, contentDescription = "Info")
                    }
                    IconButton(onClick ={onNavigateToSettings()} ) {
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
private fun ScreenContent(modifier: Modifier = Modifier) {
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
                ModeButton("Ambient (Edges)", Icons.Rounded.Favorite)
                Text(text = "")
                ModeButton("Ambilight", Icons.Rounded.Home)
                Text(text = "")
                ModeButton("Rainbow", Icons.Rounded.Call)
                Text(text = "")
                ModeButton("Reverse Rainbow",Icons.Rounded.LocationOn)
            }

        }

        //Right half

        Card(
            modifier = Modifier
                .weight(1f)
                .padding(
                    end = 20.dp,
                    start = 20.dp,
                    bottom = 20.dp,
                    top = 60.dp
                )
                .fillMaxHeight(),
            //horizontalAlignment = Alignment.CenterHorizontally
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
            .height(70.dp)
            .width(400.dp)
            .padding(top = 0.dp),

        enabled = true,
        shape = RoundedCornerShape(20.dp),
        contentPadding = PaddingValues(0.dp),
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            //containerColor =
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


@Composable
fun AmbDialog(
onDismissRequest: () -> Unit
){ AlertDialog(
    onDismissRequest = {onDismissRequest()},
    title = { Text(text = "Rant") },
    text = { Text(text = "istg idfk wth i'm doing as sh** i'm just effing going w the flow") },
    confirmButton = {
        TextButton(onClick = {onDismissRequest()}) {
            Text(
                text = "Hope"
            )

        }
                    },
    dismissButton = {
        TextButton(onClick = {onDismissRequest()}) {
            Text(text = "Cope")
                     }
                 }
             )


}


@Preview(showBackground = true,
    device = "spec:width=1080px,height=1920px,dpi=440,orientation=landscape",
    showSystemUi = true, name = "Odin 2", wallpaper = Wallpapers.NONE,
    group = "Odin"
)
@Composable
fun AppPreview() {
    AmbientUI20Theme {
        //AmbDialog()
    }
}