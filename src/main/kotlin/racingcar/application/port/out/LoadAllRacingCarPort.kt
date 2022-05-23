package racingcar.application.port.out

import racingcar.domain.RacingCar

interface LoadAllRacingCarPort {

    fun loadAll(): List<RacingCar>
}