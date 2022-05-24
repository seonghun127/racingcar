package racingcar.service

import racingcar.port.`in`.CreateMultiRacingCarUseCase
import racingcar.port.`in`.CreateRacingCarUseCase
import racingcar.port.out.CreateRacingCarPort
import racingcar.domain.RacingCar

class CreateRacingCarService(
    private val createRacingCarPort: CreateRacingCarPort
) : CreateRacingCarUseCase, CreateMultiRacingCarUseCase {

    override fun create(name: String) {
        createRacingCarPort.create(RacingCar(name))
    }

    override fun create(names: List<String>) {
        names.forEach(this::create)
    }
}