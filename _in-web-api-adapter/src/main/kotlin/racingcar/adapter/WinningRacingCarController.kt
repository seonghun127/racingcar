package racingcar.adapter

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import racingcar.port.`in`.WinnerRacingCarUseCase

@RestController
@RequestMapping("/v1/racing-car")
class WinningRacingCarController(
    private val winnerRacingCarUseCase: WinnerRacingCarUseCase
) {

    @GetMapping("/winner")
    fun getWinners(): List<String> {
        return winnerRacingCarUseCase.getWinners()
    }
}