package com.example.my__template.common

import android.app.Application
import android.content.Context
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

//앱 시작될 때 첫번째로 실행될 부분
class ApplicationClass : Application() {
    val BASE_URL = "" //서버 BASE_URL 들어갈곳


    init{
        instance = this
    }

    companion object {
        var instance: ApplicationClass? = null

        //mvvm context 가져오기 귀찮아서 만든거
        fun context() : Context {
            return instance!!.applicationContext
        }

        lateinit var sRetrofit: Retrofit
    }

    override fun onCreate() {
        super.onCreate()

        // 레트로핏 인스턴스 생성
        initRetrofitInstance()
    }

    private fun initRetrofitInstance() {

        //인터셉터는 나중에 만들예정
//        val client: OkHttpClient = OkHttpClient.Builder()
//            .readTimeout(5000, TimeUnit.MILLISECONDS)
//            .connectTimeout(5000, TimeUnit.MILLISECONDS)
//            // 로그캣에 okhttp.OkHttpClient로 검색하면 http 통신 내용을 보여줍니다.
//            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
//            .addNetworkInterceptor(XAccessTokenInterceptor()) // JWT 자동 헤더 전송
//            .build()

        // sRetrofit 이라는 전역변수에 API url, 인터셉터, Gson을 넣어주고 빌드해주는 코드
        // 이 전역변수로 http 요청을 서버로 보내면 됩니다.
        sRetrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}