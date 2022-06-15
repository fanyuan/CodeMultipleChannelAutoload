package com.sample.lib2

object Lib2UtilsStringGenerater {
    fun getName():String{
        return "Lib2Util stage  " + BuildConfig.BUILD_TYPE
    }
}