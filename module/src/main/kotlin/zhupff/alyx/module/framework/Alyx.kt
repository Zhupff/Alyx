package zhupff.alyx.module.framework

import android.app.Application
import zhupff.alyx.module.api.Api

class Alyx : Application() {
    companion object {
        lateinit var application: Application; private set
    }

    init { application = this }

    override fun onCreate() {
        super.onCreate()
        Api.init()
    }
}