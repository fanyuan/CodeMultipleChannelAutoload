package com.sample.lib2

object Lib2UtilsStringGenerater {
    fun getName():String{
        return "Lib2Util prod  " + BuildConfig.BUILD_TYPE
    }
}