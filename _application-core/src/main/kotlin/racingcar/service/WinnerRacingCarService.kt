package racingcar.service

import racingcar.port.`in`.WinnerRacingCarUseCase
import racingcar.port.out.LoadAllRacingCarPort

class WinnerRacingCarService(
    private val loadAllRacingCarPort: LoadAllRacingCarPort
) : WinnerRacingCarUseCase {

    override fun getWinners(): List<String> {
        val racingCars = loadAllRacingCarPort.loadAll()
        val maxPosition = racingCars.maxOf { it.position }
        return racingCars.filter { it.position == maxPosition }
            .map { it.name }
    }
}