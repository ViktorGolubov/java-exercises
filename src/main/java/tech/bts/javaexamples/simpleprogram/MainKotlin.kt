package tech.bts.javaexamples.simpleprogram

fun main(args: Array<String>) {

    println("Hello, world!")


    // Declare a variable
    var age : Int
    var name : String

    // Assign a value
    age = 15

    // Declare and assign
    var weight : Double = 40.5

    // Type inferred from value (Double)
    var height = 150.0

    if (age >= 18) {
        print("adult")

    } else if (age >= 13) {
        print("teenager")
    } else {
        print("kid")
    }

    //for
    for (i in 1..10) {
        println(i)
    }

    //while
    var j = 1
    while (j <= 10) {
        println(j)
        j++
    }

    // Create an empty list an add values
    var names  = mutableListOf<String>()
    names.add("potato")
    names.add("carrot")
    println( names.get(0))

    // Create a list with some values
    var numbers = listOf(8, 4, 6, 5)
    // Cant do it: numbers.add(3);

    var ages = mutableMapOf<String, Int>()

    ages.put("John", 30)
    ages.put("Mary", 25)
    println(ages.get("John"))

    // Constant variables (cant change again)
    val price = 200
    val discount = 10
    val finalPrice = price - discount
    println("The final price is $finalPrice")
    // Cant do it: finalPrice = price

    printHello("Peter", 35)


    val p = power(2.0,10)
    println(" 2^10 $p")

}

fun power(base: Double, exponent: Int) : Double {

    var result = 1.0

    for (i in 1.. exponent) {

        result *= base
    }

    return result
}

fun printHello(name: String, age: Int) {
    println("Hello $name, you are  $age")
}