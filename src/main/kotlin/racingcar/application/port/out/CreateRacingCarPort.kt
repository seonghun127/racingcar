package racingcar.application.port.out

import racingcar.domain.RacingCar

interface CreateRacingCarPort {

    fun create(racingCar: RacingCar)
}