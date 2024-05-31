import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import components.ButtonExamples
import dev.icerock.moko.resources.compose.stringResource
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition
import org.anton.learncmp.resources.MR
import org.jetbrains.compose.resources.ExperimentalResourceApi

// import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
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
//                Image(
//                    painter = painterResource(MR.images.sailboat),
//                    contentDescription = null,
//                )
                Text(stringResource(MR.strings.show_button_example))
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