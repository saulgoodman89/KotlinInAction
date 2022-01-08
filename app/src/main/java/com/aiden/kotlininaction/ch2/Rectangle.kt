package com.aiden.kotlininaction.ch2

import java.util.*

class Rectangle(val height : Int , val width: Int) {
    /*
        Java에서는 , setIsSquared(boolean _isSquared) 를 해야만 했지만
        Kotlin에서는 실시간으로 체크 가능.
        get()을 추가해서 getter를 불러온다.

     */
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}