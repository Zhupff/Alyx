package alyx

import android.app.Application

class Alyx : Application() {
    companion object {
        lateinit var application: Alyx; private set
    }

    init {
        application = this
    }
}