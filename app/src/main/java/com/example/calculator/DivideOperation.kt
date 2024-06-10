package com.example.calculator

class DivideOperation(_operation:String, _a: String, _b: String) : Calculator(_operation, _a, _b) {

    override fun doOperation() {
        answer = a.toInt() / b.toInt()
        println("${a}와 ${b}의 나눗셈 결과는")
        println("$answer 입니다.")
    }
}