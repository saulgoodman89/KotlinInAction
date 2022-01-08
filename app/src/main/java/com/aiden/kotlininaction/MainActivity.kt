package com.aiden.kotlininaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.aiden.kotlininaction.ch2.*
import com.aiden.kotlininaction.ch2.Color.*;
import com.aiden.kotlininaction.ch2.Function

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        functionNotReturn()

        /*
            그냥 함수인데 왜 import 하면 호출이 되는거지 ??

        createRandomRectangle();
         */
        rectangle()
        Log.e("KEG","Color : "+Color.BLUE.rgb());

        val importEnum = ImportEnum();
        Log.e("KEG","EE : " + importEnum.getWarmth(Color.RED));

        val  ob = WhenObject();
        Log.e("KEG","WhenObject : "+ ob.mixOptimized(RED,YELLOW));

        val cast = SmartCast();
        Log.e("KEG","Smar Cast : "+ cast.eval(SmartCast.Sum(SmartCast.Sum(SmartCast.Num(1), SmartCast.Num(2)),
            SmartCast.Num(4)
        )));

       // IfToWhen()

        callWhenObject()

        callComplicatedWhen()

    }

    fun functionNotReturn() {
        val function = Function()
        var a = function.max(3,5)
        Log.e("KEG"," function : "+ a)
    }

    fun mainProperties1() {
        val person = Person("Bob",true)
        println(person.name)
        println(person.isMarried)
    }

    fun callWhenObject() {
        val whenObject = WhenObject()
        Log.e("KEG","whenObject : "+ whenObject.mixOptimized(YELLOW,RED))
    }


    fun IfToWhen() {
        val iftowhen = IfToWhen();
    //    Log.e("KEG","iftoWhen : "+ iftowhen.eval(Sum(Num(1),Num(2))))
    }

    fun rectangle() {
        val rectangle = Rectangle(3,3)
        Log.e("KEG","rectangle.isSquare : "  + rectangle.isSquare);
    }

    fun callComplicatedWhen() {
        val complicatedWhen = ComplicatedWhen()
        val num = ComplicatedWhen.Num(6)
        Log.e("KEG","complicatedWhen : "+ complicatedWhen.evalWithLogging(num))
    }
}