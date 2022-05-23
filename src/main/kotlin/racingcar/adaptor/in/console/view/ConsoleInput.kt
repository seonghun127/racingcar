package racingcar.adaptor.`in`.console.view

import java.util.*

object ConsoleInput {

    fun inputRacingCarName(): String {
        println("자동차 이름을 입력해주세요.")
        val sc = Scanner(System.`in`)
        return sc.nextLine()
    }

    fun inputRound(): Int {
        println("라운드를 입력해주세요.")
        val sc = Scanner(System.`in`)
        return sc.nextLine().toInt()
    }
}