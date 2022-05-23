package racingcar.adaptor.out

import racingcar.application.port.out.CreateMultiRacingCarPort
import racingcar.application.port.out.CreateRacingCarPort
import racingcar.domain.RacingCar

class RacingCarPersistenceAdaptor(
    private val racingCarRepository: RacingCarRepository
) : CreateRacingCarPort, CreateMultiRacingCarPort {

    override fun create(racingCar: RacingCar) {
        racingCarRepository.save(racingCar)
    }

    override fun create(racingCars: List<RacingCar>) {
        racingCarRepository.save(racingCars)
    }
}