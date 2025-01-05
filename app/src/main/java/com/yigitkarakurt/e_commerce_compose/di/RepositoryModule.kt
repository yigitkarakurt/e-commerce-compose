package com.yigitkarakurt.e_commerce_compose.di

import com.yigitkarakurt.e_commerce_compose.data.repository.MainRepositoryImpl
import com.yigitkarakurt.e_commerce_compose.domain.repository.MainRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindMainRepository(repositoryImpl: MainRepositoryImpl): MainRepository
}