package tech.bts.javaexamples.classes

fun main(args: Array<String>) {

    var calc = CalculatorKotlin(0.0)

    calc.add(100.0)
    calc.clear()

    calc.add(7.0)
    calc.add(3.0)
    calc.add(5.0)
    calc.divideBy(3.0)


    println( "Value: " + calc.value )
    println( "Count: " + calc.operationCount )
}