package com.sample.lib2

object Lib2Utils {
    @JvmStatic
    fun getName():String{
        BuildConfig.BUILD_TYPE
        return Lib2UtilsStringGenerater.getName()//"Lib2Util default"
    }
}