package racingcar.application.port.out

import racingcar.domain.RacingCar

interface CreateMultiRacingCarPort {

    fun create(racingCars: List<RacingCar>)
}