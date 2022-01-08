package com.aiden.kotlininaction.ch2

import java.lang.IllegalArgumentException


/*
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

class RefactoringIf {
    fun eval(e: Expr) : Int =
        if(e is Num) {
            e.value
        }else if(e is Sum) {
            eval(e.right) + eval(e.left)
        }else {
            throw IllegalArgumentException("Unknown Exception");
        }

    fun main(args: Array<String>) {
        println(eval(Sum(Num(1), Num(2))))
    }
}*/
