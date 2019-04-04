package com.kotlin

fun main(args:Array<String>){

    var str = "abba"

    str.reversed()

    var reverse = ""

    for (i in str.length-1 downTo 0 ){
        reverse += str[i]
    }
    println(reverse)

    if(reverse.equals(str)){
        println("string $str is palindrome: $reverse")
    }else{
        println("string is not palindrome")
    }

}
