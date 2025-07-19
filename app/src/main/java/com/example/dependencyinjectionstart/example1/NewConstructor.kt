package com.example.dependencyinjectionstart.example1

import dagger.Component

@Component
interface NewConstructor {

    fun inject(myDaggerActivity: MyDaggerActivity)
}