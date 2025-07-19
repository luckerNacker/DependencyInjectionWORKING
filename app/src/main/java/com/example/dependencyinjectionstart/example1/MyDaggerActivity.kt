package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class MyDaggerActivity {

    @Inject
    lateinit var keyboard : Keyboard
}