package racingcar.adaptor.`in`.console

import racingcar.adaptor.`in`.console.view.ConsoleInput
import racingcar.adaptor.`in`.console.view.ConsoleOutput
import racingcar.application.port.`in`.MoveRacingCarUseCase

class RaceController(
    private val moveRacingCarUseCase: MoveRacingCarUseCase,
) {

    fun race() {
        val round = ConsoleInput.inputRound()
        val result = moveRacingCarUseCase.move(round)
        ConsoleOutput.output(result)
    }
}