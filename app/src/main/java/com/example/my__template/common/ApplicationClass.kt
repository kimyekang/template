package com.example.my__template.common

import android.app.Application
import android.content.Context

//앱 시작될 때 첫번째로 실행될 부분
class ApplicationClass : Application() {

    init{
        instance = this
    }

    companion object {
        var instance: ApplicationClass? = null

        //mvvm context 가져오기 귀찮아서 만든거
        fun context() : Context {
            return instance!!.applicationContext
        }
    }
}