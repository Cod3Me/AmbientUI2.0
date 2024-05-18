package com.example.ambientui20.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Card
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = "back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer
                )
            )
        }
    ) { innerPadding ->
        SettingsScreenContent(Modifier.padding(innerPadding))

    }
}

@Composable
private fun SettingsScreenContent(modifier: Modifier){
var sliderValue by remember { mutableFloatStateOf(0f) }
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
                    Row (modifier = Modifier
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = "LED Max Brightness",
                            style = MaterialTheme.typography.headlineMedium,
                            modifier = Modifier
                                .padding( top = 10.dp)
                        )
                        Text(
                            text = sliderValue.toString(),
                            fontSize = 25.sp,
                            modifier = Modifier
                                .padding(start = 10.dp, top = 30.dp)
                                )
                            }
                    Text(
                        text = "Controls the max brightness of the LEDs",
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
                    Divider()

                }
                Column {
                    Text(
                        text = "LED Configs",
                        style = MaterialTheme.typography.headlineMedium
                    )
                    OptionWithSwitch(
                        title = "Auto-start on launch",
                        subtitle = "Turns on/off the ability to auto-start on app launch"
                    )
                    OptionWithSwitch(
                        title = "Auto-start on launch",
                        subtitle = "Turns on/off the ability to auto-start on app launch"
                    )
                    OptionWithSwitch(
                        title = "Auto-start on launch",
                        subtitle = "Turns on/off the ability to auto-start on app launch"
                    )
                    OptionWithSwitch(
                        title = "Auto-start on launch",
                        subtitle = "Turns on/off the ability to auto-start on app launch"
                    )
                }

            }
        }
        Card(
            modifier = Modifier
                .weight(1f)
                .padding(
                    start = 20.dp,
                    end = 40.dp,
                    bottom = 40.dp,
                    top = 20.dp
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
                fontSize = 20.sp

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