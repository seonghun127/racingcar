package racingcar.adapter.out

import racingcar.domain.RacingCar
import racingcar.port.out.CreateMultiRacingCarPort
import racingcar.port.out.CreateRacingCarPort

class RacingCarInMemoryAdapter : CreateRacingCarPort, CreateMultiRacingCarPort {

    override fun create(racingCar: RacingCar) {
        RacingCarRepository.save(racingCar)
    }

    override fun create(racingCars: List<RacingCar>) {
        RacingCarRepository.save(racingCars)
    }
}