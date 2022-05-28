package racingcar.adapter

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import racingcar.port.`in`.WinnerRacingCarUseCase
import racingcar.service.WINNER_RACING_CAR_SERVICE

@RestController
@RequestMapping("/v1/racing-car")
class WinningRacingCarController(
    @Qualifier(value = WINNER_RACING_CAR_SERVICE) private val winnerRacingCarUseCase: WinnerRacingCarUseCase
) {

    @GetMapping("/winner")
    fun getWinners(): List<String> {
        return winnerRacingCarUseCase.getWinners()
    }
}