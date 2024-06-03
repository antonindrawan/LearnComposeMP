import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import components.ButtonExamples
import dev.icerock.moko.resources.compose.painterResource
import dev.icerock.moko.resources.compose.stringResource
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import org.anton.learncmp.resources.MR

@Composable
fun Nav() {
    val navigator: Navigator = rememberNavigator()

    NavHost(
        // Assign the navigator to the NavHost
        navigator = navigator,
        // Navigation transition for the scenes in this NavHost, this is optional
        navTransition = NavTransition(),
        // The start destination
        initialRoute = "/home",
    ) {
        // Define a scene to the navigation graph
        scene(
            route = "/home",
            navTransition = NavTransition(),
        ) {
            Button(
                onClick = {
                    navigator.navigate("/show-button-example")
                },
            ) {
                Text(stringResource(resource = MR.strings.show_button_example))

                Image(
                    painter = painterResource(MR.images.sailboat_svgrepo_com),
                    contentDescription = null,
                    contentScale = ContentScale.Inside,
                    modifier =
                        Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(4.dp)),
                )
            }
        }

        scene(
            route = "/show-button-example",
        ) {
            Button(
                onClick = {
                    navigator.goBack()
                },
            ) {
                Text("Back")
            }
            ButtonExamples()
        }
    }
}