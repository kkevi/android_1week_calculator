package com.example.calculator

fun main(){
    println("연산할 종류를 입력해주세요.")
    println("덧셈, 뺄셈, 곱셈, 나눗셈 직접 입력을 통해 가능합니다.")
    val operation = readln()
    println("첫 번째 숫자를 입력해주세요.")
    val a = readln()
    println("두 번째 숫자를 입력해주세요.")
    val b = readln()
    val calculate = Calculator(operation, a, b)
    calculate.doOperation()
}