package racingcar.port.`in`

import racingcar.port.`in`.dto.MovedRacingCarDto

interface MoveRacingCarUseCase {

    fun move(round: Int): List<MovedRacingCarDto>
}