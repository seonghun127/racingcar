package racingcar.adaptor.`in`.console.view

import java.util.*

class ConsoleInput {

    fun input(): String {
        println("자동차 이름을 입력해주세요.")
        val sc = Scanner(System.`in`)
        return sc.nextLine()
    }
}