fun sumOfDigits(num: Int, x:Long):Long = if(num!=0) {
    val sum = sumOfDigits(num / 10, x)
    sum + (num % 10)
} else x

fun main() {
    val n : Long = 0
    val num = 210100
    val result = sumOfDigits(num, n)
    println("The sum of the digits of the number $num is: $result")
}