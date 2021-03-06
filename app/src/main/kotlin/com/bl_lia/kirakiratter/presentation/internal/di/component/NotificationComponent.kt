package com.bl_lia.kirakiratter.presentation.internal.di.component

import com.bl_lia.kirakiratter.presentation.fragment.NotificationFragment
import com.bl_lia.kirakiratter.presentation.internal.di.PerFragment
import com.bl_lia.kirakiratter.presentation.internal.di.module.FragmentModule
import com.bl_lia.kirakiratter.presentation.internal.di.module.NotificationModule
import com.bl_lia.kirakiratter.presentation.internal.di.module.StatusModule
import dagger.Component

@PerFragment
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(FragmentModule::class, NotificationModule::class, StatusModule::class))
interface NotificationComponent {
    fun inject(fragment: NotificationFragment)
}