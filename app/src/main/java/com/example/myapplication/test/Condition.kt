package com.example.myapplication.test

import kotlin.math.max

/**
 * 一些简单的练习
 */

fun main() {
    val a= 23
    val b=90
    val value = largeNum(a,b)
    System.out.println("Large num is "+value)
    System.out.println("large num is"+ largeNumCondition(a,b))
}

fun largeNum(num1:Int,num2:Int):Int {

    return max(num1, num2)
}

    fun largeNumCondition(num1: Int,num2: Int):Int{
        //传统写法
       /* var value = 0//涉及到重新赋值，所以用var

        if(num1>num2){
           value=num1
        }else{
            value=num2
        }
        return value
*/
       //相对简化的写法
       /* val value =if(num1>num2){
            num1
        }else{
            num2
        }
        return value*/

        return if(num1>num2){
            num1
        }else{
            num2
        }
    }
