package com.example.calculator

class AddOperation(_a: String, _b: String) {
    private var a:Int = _a.toInt()
    private var b:Int = _b.toInt()
    private var answer:Int = 0

//    init {
//        println("첫 번째 숫자를 입력해주세요.")
//    }

    fun add() {
        answer = a + b
        println("${a}와 ${b}의 덧셈 결과는")
        println("$answer 입니다.")
    }
}