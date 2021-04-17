fun sumOfDigitsUp(num: Int, x: Long): Long =
    if(num!=0) {
    val sum = sumOfDigitsUp(num / 10, x)
    sum + (num % 10)
} else x

fun sumOfDigitsDown(num: Int, x: Long): Long =
    if(num == 0) x else sumOfDigitsTail(num/10, x + num % 10)

tailrec fun sumOfDigitsTail(num: Int, x: Long): Long =
    if(num == 0) x else sumOfDigitsTail(num/10, x + num % 10)

fun main() {
    val n : Long = 0
    val num = 2101001637
    val resultUp = sumOfDigitsUp(num, n)
    val resultDown = sumOfDigitsDown(num, n)
    val resultTail = sumOfDigitsTail(num, n)
    println("The sum of the digitsUP of the number $num is: $resultUp")
    println("The sum of the digitsDOWN of the number $num is: $resultDown")
    println("The sum of the digitsTail of the number $num is: $resultTail")
}