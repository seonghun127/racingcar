package racingcar.adaptor.`in`.console

import racingcar.adaptor.`in`.console.view.ConsoleInput
import racingcar.application.port.`in`.CreateMultiRacingCarUseCase
import racingcar.application.port.`in`.CreateRacingCarUseCase

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