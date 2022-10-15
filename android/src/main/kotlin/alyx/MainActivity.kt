package alyx

import alyx.module.BaseActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import alyx.common.ui.Launcher

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Launcher()
        }
    }
}