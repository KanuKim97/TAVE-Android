package com.example.data.di

import com.example.data.constants.Constants
import com.example.data.remote.TaveAPIService
import com.example.data.repositoryImpl.TaveAPIRepositoryImpl
import com.example.domain.repository.TaveAPIRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object TaveAPIModule {
    @Provides
    fun provideRetrofitClient(httpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl(Constants.TAVE_BASE_URL)
            .client(httpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun provideAPIService(retrofit: Retrofit): TaveAPIService =
        retrofit.create(TaveAPIService::class.java)

    @Provides
    fun provideTaveApiRepoImpl(taveAPIService: TaveAPIService): TaveAPIRepository =
        TaveAPIRepositoryImpl(taveAPIService)
}