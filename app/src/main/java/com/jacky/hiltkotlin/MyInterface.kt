package com.jacky.hiltkotlin

import android.app.Application
import androidx.core.app.ActivityCompat
import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {
    fun myPrintFunction(): String
}

/*
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule {

    @ActivityScoped
    @Binds
    abstract fun  bindingFunction(myImplementor: InterfaceImplementor) : MyInterface
}
*/

@InstallIn(SingletonComponent::class)
@Module
class MyModule {
    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction() : MyInterface {
        return  InterfaceImplementor()
    }
    @SecondIpmlementor
    @Singleton
    @Provides
    fun secondProviderFunction() : MyInterface {
        return  SecondInterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gsonProvider() : Gson {
        return  Gson()
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondIpmlementor

