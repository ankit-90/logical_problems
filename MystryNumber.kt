package com.kotlin


fun main(args: Array<String>) {

    val number = 22

    val size = number / 2

    var isMystryNumber = false

    var firstNumber = 0

    var secondNumber = 0

    for (i in 0..size) {
        if ((i + reverseNumber(i)) == number) {
            isMystryNumber = true
            firstNumber = i
            secondNumber = reverseNumber(i)
            break
        } else {
            isMystryNumber = false
        }
    }

    printMystryNumber(isMystryNumber, firstNumber, secondNumber)

}


private fun printMystryNumber(isMystryNumber: Boolean, firstNumber: Int, secondNumber: Int) {
    if (isMystryNumber) {
        println("number is mystry number: $firstNumber, $secondNumber")
    } else {
        println("number is not mystry number")
    }
}


private fun reverseNumber(number: Int): Int {
    var n: Int
    var i: Int = number
    var reverseNumber = 0
    while (i > 0) {
        reverseNumber *= 10
        n = i % 10
        reverseNumber += n
        i = i / 10
    }
    return reverseNumber

}




