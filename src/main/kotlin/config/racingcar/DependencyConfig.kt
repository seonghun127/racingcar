package config.racingcar

import racingcar.adaptor.`in`.console.CreateRacingCarController
import racingcar.adaptor.`in`.console.RaceController
import racingcar.adaptor.`in`.console.WinnerRacingCarController
import racingcar.adaptor.out.RacingCarLoadAdaptor
import racingcar.adaptor.out.RacingCarPersistenceAdaptor
import racingcar.adaptor.out.RacingCarRepository
import racingcar.application.CreateRacingCarService
import racingcar.application.MoveRacingCarService
import racingcar.application.WinnerRacingCarService

object DependencyConfig {

    fun configureCreateRacingCarController(): CreateRacingCarController {
        val racingCarPersistenceAdaptor = RacingCarPersistenceAdaptor(RacingCarRepository)
        val createRacingCarService = CreateRacingCarService(racingCarPersistenceAdaptor)

        return CreateRacingCarController(
            createRacingCarUseCase = createRacingCarService,
            createMultiRacingCarUseCase = createRacingCarService,
        )
    }

    fun configureRaceController(): RaceController {
        val racingCarLoadAdaptor = RacingCarLoadAdaptor(RacingCarRepository)
        val racingCarPersistenceAdaptor = RacingCarPersistenceAdaptor(RacingCarRepository)
        val moveRacingCarService = MoveRacingCarService(racingCarLoadAdaptor, racingCarPersistenceAdaptor)

        return RaceController(moveRacingCarService)
    }

    fun configureWinnerRacingCarController(): WinnerRacingCarController {
        val racingCarLoadAdaptor = RacingCarLoadAdaptor(RacingCarRepository)
        val winnerRacingCarService = WinnerRacingCarService(racingCarLoadAdaptor)

        return WinnerRacingCarController(winnerRacingCarService)
    }
}