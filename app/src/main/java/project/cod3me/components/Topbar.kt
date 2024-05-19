package project.cod3me.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ambientui20.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun AmbTopBar(
    modifier: Modifier = Modifier,
    title: String,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(),
    scrollBehavior: TopAppBarScrollBehavior? = null,

    ) {
    TopAppBar(
        title = { Text(
            text = title,
            textAlign = TextAlign.Left,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .padding(0.dp)
                .fillMaxWidth(),

        ) },
        navigationIcon = navigationIcon,
        actions = actions,
        colors = colors,
        scrollBehavior = scrollBehavior,
        modifier = Modifier
            .fillMaxWidth(),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, showBackground = true,
    device = "spec:width=1080px,height=1920px,dpi=440,orientation=landscape"
)
@Composable
fun AmbTopBarPrev(){
    AmbTopBar(
        title = stringResource(id = R.string.app_name),
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.Home, contentDescription = "Home")
            }
        },
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
        }


        
    )
}