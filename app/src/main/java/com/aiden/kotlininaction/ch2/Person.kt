package com.aiden.kotlininaction.ch2


/*
    코틀린은 변수들을 직접 사용해도 자동으로 getter를 호출해준다.

    코틀린에서는 자바 클래스의 게터를 val 프로퍼티 처럼 사용 할 수 있다.
*/

class Person (
    val name: String,
    var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person("Bob",true)
    println(person.name)
    println(person.isMarried)
}