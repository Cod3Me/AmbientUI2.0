package com.example.ambientui20.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ambientui20.R
import project.cod3me.components.AmbTopBar
import kotlin.math.roundToInt

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    onNavigateToApp: () -> Unit
) {
    Scaffold(
        topBar = {
            AmbTopBar(
                title = "Settings",
                navigationIcon = {
                    IconButton(onClick = {onNavigateToApp()}) {
                        Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = "back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer
                ),

            )
        }
    ) { innerPadding ->
        SettingsScreenContent(Modifier.padding(innerPadding))

    }
}

@Composable
private fun SettingsScreenContent(modifier: Modifier){

    Row (
        modifier = Modifier
            .padding(top = 60.dp)
            .fillMaxHeight()
    ){
        LazyColumn(
            modifier = Modifier
                .padding(20.dp)
                .weight(1f)
                .fillMaxHeight()
        ){
            item {
                Column (
                    modifier = Modifier
                        .padding(top = 0.dp)
                ){
                    Text(
                        text = "General",
                        style = MaterialTheme.typography.headlineMedium
                        )
                    OptionWithSwitch(
                        title = "Auto-start on launch",
                        subtitle = "Turns on/off the ability to auto-start on app launch"
                    )
                    Divider()
                }

                Column {
                    Text(
                        text = "LED Configs",
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = Modifier
                            .padding(top = 10.dp)
                    )

                    SliderWithDescription(
                        title = "LED Max Brightness",
                        subtitle = "Controls the max brightness of the LEDs"
                        )

                    OptionWithSwitch(
                        title = "Left Stick LED",
                        subtitle = "Controls the left stick LED."
                    )
                    OptionWithSwitch(
                        title = "Right Stick LED",
                        subtitle = "Controls the right stick LED."
                    )
                    OptionWithSwitch(
                        title = "Left Side LED",
                        subtitle = "Controls the left side LED."
                    )
                    OptionWithSwitch(
                        title = "Right Side LED",
                        subtitle = "Controls the right stick LED."
                    )
                }

            }
        }
        Card(
            modifier = Modifier
                .weight(0.5f)
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    bottom = 20.dp,
                    top = 25.dp
                )
                //.fillMaxHeight()
                .size(width = 30.dp, height = 260.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            )



        ) {
            Text(
                text = "About",
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 5.dp),
                fontSize = 20.sp
                )
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(96.dp)

            )
            Text(
                text = "Designed by Cod3Me",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),

            )
            Text(
                text = "Special Thanks",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Lucas \nJade \nTimothy",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Text(text = "Github")
                Text(text = "", modifier = Modifier.padding(start = 5.dp, ))
                Text(text = "Twitter")
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Text(text = "Discord")
                Text(text = "", modifier = Modifier.padding(start = 5.dp, ))
                Text(text = "Feedback")
            }



        }
    }

}

@Composable
fun SliderWithDescription(

    title: String = "Stop forgetting texts!!",
    subtitle: String = "Bruh 😭😭😭"

){
    var sliderValue by remember { mutableFloatStateOf(0f) }

    Column {
        Row (modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = title,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(0.dp)
                    .weight(1f)
            )
            Text(
                text = sliderValue.toString(),
                fontSize = 25.sp,
                textAlign = TextAlign.Right,
                modifier = Modifier
                    .padding(start = 10.dp, top = 20.dp)
                    .weight(1f)
            )
        }
        Text(
            text = subtitle,
            fontSize = 16.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(bottom= 10.dp)
        )
        Slider(value = sliderValue,
            onValueChange = {sliderValue = it.roundToInt().toFloat()},
            valueRange = 0f..100f,
            enabled = true
        )


    }
}


@Composable
fun OptionWithSwitch(
    title: String = "You forgot text bruh",
    subtitle: String = "this too!!!"
)
{var checked by remember{ mutableStateOf(false) }
    Column {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Text(
                modifier = Modifier
                    .padding(end = 40.dp),
                text = title,
                fontSize = 18.sp

            )
            Switch(
                checked = checked, onCheckedChange = {checked = it},
            )
        }
        Text(
            text = subtitle,
            fontSize = 16.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(bottom= 10.dp)
        )


    }
}



@Preview(device = "spec:width=1080px,height=1920px,dpi=440,orientation=landscape", name = "Odin 2")
@Composable
fun SettingsScreenPrev(){
    //SettingsScreen()
}