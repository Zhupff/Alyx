package zhupff.alyx.module.framework

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import zhupff.alyx.module.api.logD

abstract class BaseActivity : AppCompatActivity() {

    fun startActivity(target: Class<out Activity>, block: (Intent) -> Unit) = apply {
        logD("startActivity")
        startActivity(Intent(this, target).apply(block))
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    inline fun <reified T : Activity> startActivity(block: (Intent) -> Unit) = apply {
        logD("startActivity")
        startActivity(Intent(this, T::class.java).apply(block))
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logD("onCreate")
    }

    override fun onResume() {
        super.onResume()
        logD("onResume")
    }

    override fun onStart() {
        super.onStart()
        logD("onStart")
    }

    override fun onRestart() {
        super.onRestart()
        logD("onRestart")
    }

    override fun onStop() {
        super.onStop()
        logD("onStop")
    }

    override fun onPause() {
        super.onPause()
        logD("onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        logD("onDestroy")
    }

    override fun finish() {
        super.finish()
        logD("finish")
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}