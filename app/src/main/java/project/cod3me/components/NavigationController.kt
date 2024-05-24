package project.cod3me.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.compose.rememberNavController
import com.example.ambientui20.ui.AmbDialog
import com.example.ambientui20.ui.App
import com.example.ambientui20.ui.SettingsScreen

/*@Composable
fun MainNavController(){
    val mainNavController = rememberNavController()
    NavHost(navController = mainNavController, startDestination = "home"){
        composable("settings"){ SettingsScreen(onNavigateToApp = {mainNavController.navigate("home")}) }
        composable("home"){ App(onNavigateToSettings = {mainNavController.navigate("settings")}) }
        dialog("help"){ AmbDialog() }
    }
}
*/