package racingcar.adaptor.`in`.console.view

import racingcar.application.port.`in`.dto.MovedRacingCarDto

object ConsoleOutput {

    fun output(dtos: List<MovedRacingCarDto>) {
        dtos.forEach { println("${it.name} : " + "-".repeat(it.position)) }
    }

    fun outputWinners(winner: List<String>) {
        println("우승자는 $winner 입니다.")
    }
}