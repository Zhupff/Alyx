import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import zhupff.alyx.common.applicationName
import zhupff.alyx.common.ui.Launcher

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        icon = painterResource("images/logo.png"),
        title = applicationName
    ) {
        Launcher()
    }
}