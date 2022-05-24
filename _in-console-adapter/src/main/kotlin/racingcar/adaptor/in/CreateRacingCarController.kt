package racingcar.adaptor.`in`

import racingcar.adaptor.`in`.view.ConsoleInput
import racingcar.port.`in`.CreateMultiRacingCarUseCase
import racingcar.port.`in`.CreateRacingCarUseCase

class CreateRacingCarController(
    private val createRacingCarUseCase: CreateRacingCarUseCase,
    private val createMultiRacingCarUseCase: CreateMultiRacingCarUseCase,
) {

    fun createSingleRacingCar() {
        val name = ConsoleInput.inputRacingCarName()
        createRacingCarUseCase.create(name)
    }

    fun createMultiRacingCar() {
        val names = ConsoleInput.inputRacingCarName()
        createMultiRacingCarUseCase.create(names.split(","))
    }
}