package config.racingCar

import racingcar.adaptor.`in`.console.RacingCarController
import racingcar.adaptor.`in`.console.view.ConsoleInput
import racingcar.adaptor.`in`.console.view.ConsoleOutput
import racingcar.adaptor.out.RacingCarPersistenceAdaptor
import racingcar.adaptor.out.RacingCarRepository
import racingcar.application.CreateRacingCarService

class DependencyConfig {

    fun configureRacingController(): RacingCarController {
        val racingCarPersistenceAdaptor = RacingCarPersistenceAdaptor(RacingCarRepository())

        val createRacingCarService = CreateRacingCarService(racingCarPersistenceAdaptor)

        return RacingCarController(
            createRacingCarUseCase = createRacingCarService,
            createMultiRacingCarUseCase = createRacingCarService,
            consoleInput = ConsoleInput(),
            consoleOutput = ConsoleOutput(),
        )
    }
}