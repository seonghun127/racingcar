package racingcar.config

import racingcar.adapter.out.RacingCarInMemoryAdapter
import racingcar.adapter.out.RacingCarLoadAdapter
import racingcar.adapter.out.RacingCarRepository
import racingcar.adaptor.`in`.CreateRacingCarController
import racingcar.adaptor.`in`.RaceController
import racingcar.adaptor.`in`.WinnerRacingCarController
import racingcar.service.CreateRacingCarService
import racingcar.service.MoveRacingCarService
import racingcar.service.WinnerRacingCarService

object DependencyConfig {

    fun configureCreateRacingCarController(): CreateRacingCarController {
        val racingCarPersistenceAdaptor = RacingCarInMemoryAdapter()
        val createRacingCarService = CreateRacingCarService(racingCarPersistenceAdaptor)

        return CreateRacingCarController(
            createRacingCarUseCase = createRacingCarService,
            createMultiRacingCarUseCase = createRacingCarService,
        )
    }

    fun configureRaceController(): RaceController {
        val racingCarLoadAdaptor = RacingCarLoadAdapter()
        val racingCarPersistenceAdaptor = RacingCarInMemoryAdapter()
        val moveRacingCarService = MoveRacingCarService(racingCarLoadAdaptor, racingCarPersistenceAdaptor)

        return RaceController(moveRacingCarService)
    }

    fun configureWinnerRacingCarController(): WinnerRacingCarController {
        val racingCarLoadAdaptor = RacingCarLoadAdapter()
        val winnerRacingCarService = WinnerRacingCarService(racingCarLoadAdaptor)

        return WinnerRacingCarController(winnerRacingCarService)
    }
}