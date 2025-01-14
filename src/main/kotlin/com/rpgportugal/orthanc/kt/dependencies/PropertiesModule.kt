package com.rpgportugal.orthanc.kt.dependencies

import com.rpgportugal.orthanc.kt.configuration.PropertiesLoader
import com.rpgportugal.orthanc.kt.configuration.ResourcePropertiesLoader
import org.koin.dsl.bind
import org.koin.dsl.module


object PropertiesModule : DepModule {
    override val module = module {
        single { ResourcePropertiesLoader(PropertiesModule.javaClass.classLoader) }.bind(PropertiesLoader::class)
    }
}