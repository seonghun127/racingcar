package racingcar.adapter

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import racingcar.adapter.model.CreateMultiRacingCarCommand
import racingcar.adapter.model.CreateRacingCarCommand
import racingcar.port.`in`.CreateMultiRacingCarUseCase
import racingcar.port.`in`.CreateRacingCarUseCase
import racingcar.service.CREATE_RACING_CAR_SERVICE

@RestController
@RequestMapping("/v1/racing-cars")
class CreateRacingCarController(
    @Qualifier(value = CREATE_RACING_CAR_SERVICE) private val createRacingCarUseCase: CreateRacingCarUseCase,
    @Qualifier(value = CREATE_RACING_CAR_SERVICE) private val createMultiRacingCarUseCase: CreateMultiRacingCarUseCase,
) {

    @PostMapping
    fun createSingleRacingCar(@RequestBody command: CreateRacingCarCommand) {
        createRacingCarUseCase.create(command.name)
    }

    @PostMapping("/multi")
    fun createMultiRacingCar(@RequestBody command: CreateMultiRacingCarCommand) {
        createMultiRacingCarUseCase.create(command.names)
    }
}