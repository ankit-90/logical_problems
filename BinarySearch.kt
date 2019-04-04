package com.kotlin

fun main(args:Array<String>){

    val intArrayOf = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    val noTobeSeareched = 12

    binarySearch(intArrayOf,noTobeSeareched)

}

fun binarySearch(array: IntArray,noTobeSeareched:Int){

    val start = array[0]
    val end = array[array.size - 1]
    val mid = array.size / 2

    if(noTobeSeareched == mid) {
        println("noTobeSeareched found at $mid, ${array[mid]}")
    }else if(noTobeSeareched < mid){
        for (i in 0..mid){
            if(noTobeSeareched == array[i]){
                println("noTobeSeareched found at $i, ${array[i]}")
                break
            }
        }
    }else if (noTobeSeareched > mid){
        for (i in mid..end){
            if(noTobeSeareched == array[i]){
                println("noTobeSeareched found at $i, ${array[i]}")
                break
            }
        }
    }else{
        println("$noTobeSeareched not in array")
    }

}

