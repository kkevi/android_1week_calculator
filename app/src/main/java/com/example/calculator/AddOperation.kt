package com.example.calculator

class AddOperation(_operation:String, _a: String, _b: String) : Calculator(_operation, _a, _b) {

    override fun doOperation() {
        answer = a.toInt() + b.toInt()
        println("$answer 입니다.")
    }
}