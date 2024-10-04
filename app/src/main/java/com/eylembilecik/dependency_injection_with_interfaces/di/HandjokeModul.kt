package com.eylembilecik.dependency_injection_with_interfaces.di

import com.eylembilecik.dependency_injection_with_interfaces.Handjoke
import com.eylembilecik.dependency_injection_with_interfaces.HandjokeImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class HandjokeModul {
    @Binds
    abstract fun bindHandjoke(handjokeımp:HandjokeImp):Handjoke
}