package com.example.calculator

open class Calculator(_operation: String, _a: String, _b: String) {
    private var operation = _operation
    var a:String = _a
    var b:String = _b
    var answer:Int = 0

    open fun doOperation() {
        println("${a}와 ${b}의 ${operation} 결과는")
        when (operation) {
            "덧셈" -> {
                val addOperation = AddOperation(operation, a, b)
                addOperation.doOperation()
            }
            "뺄셈" -> {
                val substaractOperation = SubstractOperation(operation, a, b)
                substaractOperation.doOperation()
            }
            "곱셈" -> {
                val multiplyOperation = MultiplyOperation(operation, a, b)
                multiplyOperation.doOperation()
            }
            "나눗셈" -> {
                val divideOperation = DivideOperation(operation, a, b)
                divideOperation.doOperation()
            }
        }
    }
}