package dev.ezamora.cursokotlin.openwebinar.course01.retrofit.ws

import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.AppConstants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiUtils {

    companion object {
        private fun generateOkHttpBuilder(): OkHttpClient {
            return OkHttpClient().newBuilder().build()
        }

        fun generateRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(AppConstants.ENDPOINT)
                .client(generateOkHttpBuilder())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}