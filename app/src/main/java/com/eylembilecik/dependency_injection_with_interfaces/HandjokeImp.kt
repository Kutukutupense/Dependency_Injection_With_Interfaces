package com.eylembilecik.dependency_injection_with_interfaces

import javax.inject.Inject

class HandjokeImp @Inject constructor() :Handjoke{
    override fun doHandjoke() {
        println("Doing Handjoke")
    }


}