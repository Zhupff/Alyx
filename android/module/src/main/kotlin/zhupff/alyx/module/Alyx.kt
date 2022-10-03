package zhupff.alyx.module

import android.app.Application

class Alyx : Application() {
    companion object {
        lateinit var application: Alyx; private set
    }

    init {
        application = this
    }
}