package com.aiden.kotlininaction.ch2

import com.aiden.kotlininaction.ch2.Color.*
class ImportEnum {
    fun getWarmth(color : Color) =when(color) {
        RED,ORANGE,YELLOW -> "warm"
        GREEN ->"neutral"
        BLUE,INDIGO,VIOLET ->"cold"
    }
}