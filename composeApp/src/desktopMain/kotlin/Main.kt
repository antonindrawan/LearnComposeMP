import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import dev.icerock.moko.resources.compose.painterResource
import org.anton.learncmp.resources.MR

fun main() =
    application {
        Window(onCloseRequest = ::exitApplication, title = "LearnComposeMP") {
            Row(verticalAlignment = Alignment.CenterVertically) {
                MainView() // adding a picture on jvm
                App()
            }
        }
    }

@Composable
fun MainView() {

    Image(
        painter = painterResource(MR.images.sailboat_svgrepo_com),
        contentDescription = "Just an image from JVM",
        modifier = Modifier
            .size(50.dp)
            .clip(RoundedCornerShape(4.dp)),
    )
}

@Preview
@Composable
fun AppDesktopPreview() {
    App()
}