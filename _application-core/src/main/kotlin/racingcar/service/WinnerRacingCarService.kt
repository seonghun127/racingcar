package racingcar.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import racingcar.port.`in`.WinnerRacingCarUseCase
import racingcar.port.out.LoadAllRacingCarPort

const val WINNER_RACING_CAR_SERVICE = "WinnerRacingCarService"

@Service(value = WINNER_RACING_CAR_SERVICE)
class WinnerRacingCarService(
    private val loadAllRacingCarPort: LoadAllRacingCarPort
) : WinnerRacingCarUseCase {

    @Transactional(readOnly = true)
    override fun getWinners(): List<String> {
        val racingCars = loadAllRacingCarPort.loadAll()
        val maxPosition = racingCars.maxOf { it.position }
        return racingCars.filter { it.position == maxPosition }
            .map { it.name }
    }
}