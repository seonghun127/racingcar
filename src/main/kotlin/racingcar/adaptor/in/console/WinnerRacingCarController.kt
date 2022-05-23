package racingcar.adaptor.`in`.console

import racingcar.adaptor.`in`.console.view.ConsoleOutput
import racingcar.application.port.`in`.WinnerRacingCarUseCase

class WinnerRacingCarController(
    private val winnerRacingCarUseCase: WinnerRacingCarUseCase
) {

    fun getWinners() {
        val winners = winnerRacingCarUseCase.getWinners()
        ConsoleOutput.outputWinners(winners)
    }
}