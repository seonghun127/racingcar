package racingcar.application.port.`in`

import racingcar.application.port.`in`.dto.MovedRacingCarDto

interface MoveRacingCarUseCase {

    fun move(round: Int): List<MovedRacingCarDto>
}