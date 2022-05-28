package racingcar.adapter

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import racingcar.adapter.model.RoundCommand
import racingcar.port.`in`.MoveRacingCarUseCase
import racingcar.port.`in`.dto.MovedRacingCarDto
import racingcar.service.MOVE_RACING_CAR_SERVICE

@RestController
@RequestMapping("/v1/racing-car")
class RaceController(
    @Qualifier(value = MOVE_RACING_CAR_SERVICE) private val moveRacingCarUseCase: MoveRacingCarUseCase,
) {

    @PatchMapping("/race")
    fun race(@RequestBody command: RoundCommand): List<MovedRacingCarDto> {
        return moveRacingCarUseCase.move(command.round)
    }
}