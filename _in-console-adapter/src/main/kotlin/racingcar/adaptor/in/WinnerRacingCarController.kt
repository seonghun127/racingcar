package racingcar.adaptor.`in`

import racingcar.adaptor.`in`.view.ConsoleOutput
import racingcar.port.`in`.WinnerRacingCarUseCase

class WinnerRacingCarController(
    private val winnerRacingCarUseCase: WinnerRacingCarUseCase
) {

    fun getWinners() {
        val winners = winnerRacingCarUseCase.getWinners()
        ConsoleOutput.outputWinners(winners)
    }
}