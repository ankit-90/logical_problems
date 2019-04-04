package com.kotlin

fun main(args: Array<String>) {

    val intArrayOf = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    val noTobeSeareched = 34

    ternarySearch(intArrayOf, noTobeSeareched)

}

fun ternarySearch(intArrayOf: IntArray, noTobeSeareched: Int) {

    if (intArrayOf.size > 0) {

        val start = intArrayOf[0]
        val end = intArrayOf[intArrayOf.size - 1]
        val mid1 = start + (end - start) / 3
        val mid2 = end - (end - start) / 3

        println("mid1=  $mid1, mid2 = $mid2")


        if (noTobeSeareched <= mid1) {
            //start loop from 0 to mid1-1
            for (i in 0..mid1 ) {
                if (noTobeSeareched == intArrayOf[i]) {
                    println("no found at index: $i, ${intArrayOf[i]}")
                    break
                }
            }
        } else if (noTobeSeareched >= mid1 && noTobeSeareched <= mid2) {
            //start loop from mid1 to mid2
            for (i in mid1 + 1..mid2 ) {
                if (noTobeSeareched == intArrayOf[i]) {
                    println("no found at index: $i, ${intArrayOf[i]}")
                    break
                }
            }
        } else if (noTobeSeareched >= mid2 && noTobeSeareched <= end) {
            //start loop from mid2 to end of array
            for (i in mid2 + 1..end) {
                if (noTobeSeareched == intArrayOf[i]) {
                    println("no found at index: $i, ${intArrayOf[i]}")
                    break
                }
            }
        } else {
            println("element not found in the array")
        }
    }

}

