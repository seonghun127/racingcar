package racingcar.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import racingcar.adapter.out.RacingCarLoadAdapter
import racingcar.adapter.out.RacingCarPersistenceAdapter
import racingcar.port.`in`.CreateMultiRacingCarUseCase
import racingcar.port.`in`.CreateRacingCarUseCase
import racingcar.port.`in`.MoveRacingCarUseCase
import racingcar.port.`in`.WinnerRacingCarUseCase
import racingcar.service.CreateRacingCarService
import racingcar.service.MoveRacingCarService
import racingcar.service.WinnerRacingCarService

@Configuration
class DependencyConfig {

    @Bean
    fun createRacingCarUseCase(
        racingCarPersistenceAdapter: RacingCarPersistenceAdapter
    ): CreateRacingCarUseCase {
        return CreateRacingCarService(racingCarPersistenceAdapter);
    }

    @Bean
    fun createMultiRacingCarUseCase(
        racingCarPersistenceAdapter: RacingCarPersistenceAdapter
    ): CreateMultiRacingCarUseCase {
        return CreateRacingCarService(racingCarPersistenceAdapter);
    }

    @Bean
    fun moveRacingCarUseCase(
        racingCarLoadAdapter: RacingCarLoadAdapter,
        racingCarPersistenceAdapter: RacingCarPersistenceAdapter
    ): MoveRacingCarUseCase {
        return MoveRacingCarService(racingCarLoadAdapter, racingCarPersistenceAdapter)
    }

    @Bean
    fun winnerRacingCarUseCase(
        racingCarLoadAdapter: RacingCarLoadAdapter,
    ): WinnerRacingCarUseCase {
        return WinnerRacingCarService(racingCarLoadAdapter)
    }
}