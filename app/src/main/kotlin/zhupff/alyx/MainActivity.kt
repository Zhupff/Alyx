package zhupff.alyx

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import zhupff.alyx.module.common.LaunchTask
import zhupff.alyx.module.common.instanceLoader
import zhupff.alyx.module.framework.BaseActivity
import zhupff.instances.load

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (intent.flags and Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT != 0) {
            finish()
            return
        }
        lifecycleScope.launch {
            LaunchTask.launch()
            delay(1000)
            instanceLoader.load<BaseActivity>().firstOrNull()
                ?.let { startActivity(it) {}.finish() }
        }
        setContent {
            Box (
                modifier = Modifier
                    .background(Color.Black)
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(zhupff.alyx.module.R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .wrapContentSize()
                        .size(256.dp, 256.dp)
                )
            }
        }
    }
}