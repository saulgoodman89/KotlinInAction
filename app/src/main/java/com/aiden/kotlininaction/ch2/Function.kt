package com.aiden.kotlininaction.ch2

class Function {
    /*
        리턴하자고자 하는 형태 : Type
        Kotlin의 if는 문장이 아니라 식이다.
        루프를 제외한 대부분의 제어구조가 식이다.
     */
    fun max(a: Int, b: Int) : Int {
        return if(a>b) a else b;        //a가 b보다 크면 , a 아니면 b
    }

    /*
        식이 본문인 함수
        max를 더 간결하게 표현
        return을 제거하고 등호를 식 앞에 붙이면 더 간결하게 표현가능

        식이 본문인 함수의 경우 , 사용자가 리턴타입을 적지 않아도 컴파일러가 본문식을 분석해
        결과 타입을 함수 타입으로 정해준다.
     */
    fun convertMax(a: Int , b: Int) : Int = if(a>b) a else b

}