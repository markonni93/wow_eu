package com.example.wow.di.modules

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class NetworkModule {

    // TODO provide retrofit and everything else for api calls
}
