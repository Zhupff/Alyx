package alyx.module

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    fun startActivity(target: Class<out Activity>, block: (Intent) -> Unit) = apply {
        startActivity(Intent(this, target).apply(block))
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    inline fun <reified T : Activity> startActivity(block: (Intent) -> Unit) = apply {
        startActivity(Intent(this, T::class.java).apply(block))
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}