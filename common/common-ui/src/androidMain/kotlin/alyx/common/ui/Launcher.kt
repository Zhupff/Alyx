@file:JvmName("Android_Launcher")
package alyx.common.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

@Composable
actual fun LauncherPainter(): Painter = painterResource(R.drawable.logo)