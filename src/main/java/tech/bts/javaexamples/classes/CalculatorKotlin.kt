package tech.bts.javaexamples.classes

// The constructor is right next to the class
class CalculatorKotlin ( value: Double) {

    // Fields
    var value: Double = value
        private set

    var operationCount: Int = 0
        private set


    // Method


    fun add(x: Double) {

        this.value += x
        this.operationCount++

    }

    fun divideBy(a: Double) {

        this.value /= a
        this.operationCount++

    }

    /** Reset the value to 0.
     * The operation count is not modified.
     */
    fun clear() {
        this.value = 0.0
    }

}