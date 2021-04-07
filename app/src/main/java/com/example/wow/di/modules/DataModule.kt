package com.example.wow.di.modules

import android.content.SharedPreferences
import com.example.wow.data.AppSharedPref
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class DataModule {

    @Binds
    abstract fun provideSharedPref(sharedPref: AppSharedPref): SharedPreferences
}
