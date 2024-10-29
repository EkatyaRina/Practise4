import java.io.Serializable

//ex 1
fun printFullName (firstName:String, lastName:String) {
    println("EX 1 :my name is $firstName $lastName")

//fun calculateFullName (myName:String): String {
// return myName
//}
}

// part of 5 ex
fun isNumSimple (number:Int) {
    if (number/2 == 0) println("EX 5 :Number is simple")
    else println("EX 5 :Number is NOT simple")
}
//part of 6 ex
fun fibonacci(n: Int): Pair<Int, Int> {
    if (n <= 1) {
        return Pair(1,1)
    }
    var prev = 1
    var current = 1
    for (i in 2..n) {
        val next = prev + current
        prev = current
        current = next
    }
    return Pair(current, n)
}


fun main() {
//ex 2
    printFullName("Katerina", "Kashminova")

//ex 3
    val myOwnName = calculateFullName("Kate")
    print("EX 3 :Name change in Val: ")
    println(myOwnName)

//ex 4
    val (firstName1, lastName2) = printFullName1("Katerina", "Kashminova")
    val nameLength = (firstName1 + lastName2).length
    println("EX 4 :My name's length: $nameLength")

//ex 5
    val tryNum = 9
    isNumSimple(tryNum)

//ex 6
    val (ifFib, position) = fibonacci(7)
    println("EX 6: num $ifFib is $position's in a table")

}

//part of ex 3
fun calculateFullName (myName:String): String {
    return myName
}

//part of ex 4
fun printFullName1 (firstName1:String, lastName2:String): Pair<String,String>{
    return Pair(firstName1,lastName2)

}
