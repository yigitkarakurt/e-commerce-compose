package com.yigitkarakurt.e_commerce_compose.di

import com.yigitkarakurt.e_commerce_compose.data.source.remote.MainService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideMainService(): MainService = MainService()
}