package com.example.calculator

fun main(){
    println("연산할 종류를 입력해주세요.")
    println("덧셈, 뺄셈, 곱셈, 나눗셈 직접 입력을 통해 가능합니다.")
    val operation = readln()



    when (operation) {
        "덧셈" -> {
            println("첫 번째 숫자를 입력해주세요.")
            val a = readln()
            println("두 번째 숫자를 입력해주세요.")
            val b = readln()
            val addOperation = AddOperation(a, b)
            addOperation.add()
        }
        "뺄셈" -> {
            println("첫 번째 숫자를 입력해주세요.")
            val a = readln()
            println("두 번째 숫자를 입력해주세요.")
            val b = readln()
            val substaractOperation = SubstractOperation(a, b)
            substaractOperation.substract()
        }
        "곱셈" -> {
            println("첫 번째 숫자를 입력해주세요.")
            val a = readln()
            println("두 번째 숫자를 입력해주세요.")
            val b = readln()
            val multiplyOperation = MultiplyOperation(a, b)
            multiplyOperation.multiply()
        }
        "나눗셈" -> {
            println("첫 번째 숫자를 입력해주세요.")
            val a = readln()
            println("두 번째 숫자를 입력해주세요.")
            val b = readln()
            val divideOperation = DivideOperation(a, b)
            divideOperation.divide()
        }
    }
}