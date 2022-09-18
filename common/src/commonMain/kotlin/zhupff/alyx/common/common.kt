package zhupff.alyx.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

const val applicationName: String = "Alyx"

@Composable
fun Launcher(painter: Painter) {
    Box (
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.Center)
                .wrapContentSize()
                .size(256.dp, 256.dp)
        )
    }
}