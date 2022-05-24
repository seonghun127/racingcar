package racingcar.adaptor.`in`

import racingcar.adaptor.`in`.view.ConsoleInput
import racingcar.adaptor.`in`.view.ConsoleOutput
import racingcar.port.`in`.MoveRacingCarUseCase

class RaceController(
    private val moveRacingCarUseCase: MoveRacingCarUseCase,
) {

    fun race() {
        val round = ConsoleInput.inputRound()
        val result = moveRacingCarUseCase.move(round)
        ConsoleOutput.output(result)
    }
}