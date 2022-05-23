package racingcar.adaptor.`in`.console

import racingcar.adaptor.`in`.console.view.ConsoleInput
import racingcar.adaptor.`in`.console.view.ConsoleOutput
import racingcar.application.port.`in`.CreateMultiRacingCarUseCase
import racingcar.application.port.`in`.CreateRacingCarUseCase

class RacingCarController(
    private val createRacingCarUseCase: CreateRacingCarUseCase,
    private val createMultiRacingCarUseCase: CreateMultiRacingCarUseCase,
    private val consoleInput: ConsoleInput,
    private val consoleOutput: ConsoleOutput,
) {

    fun createSingleRacingCar() {
        val name = consoleInput.input()
        createRacingCarUseCase.create(name)
    }

    fun createMultiRacingCar() {
        val names = consoleInput.input()
        createMultiRacingCarUseCase.create(names.split(","))
    }
}