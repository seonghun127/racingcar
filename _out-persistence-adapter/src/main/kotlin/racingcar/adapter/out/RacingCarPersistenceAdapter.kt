package racingcar.adapter.out

import org.springframework.stereotype.Component
import racingcar.port.out.CreateMultiRacingCarPort
import racingcar.port.out.CreateRacingCarPort
import racingcar.domain.RacingCar
import racingcar.entity.RacingCarJpaEntity
import racingcar.entity.RacingCarJpaRepository

@Component
class RacingCarPersistenceAdapter(
    private val racingCarJpaRepository: RacingCarJpaRepository
) : CreateRacingCarPort, CreateMultiRacingCarPort {

    override fun create(racingCar: RacingCar) {
        racingCarJpaRepository.save(RacingCarJpaEntity(name = racingCar.name, position = racingCar.position))
    }

    override fun create(racingCars: List<RacingCar>) {
        val racingCarJpaEntities = racingCars.map { RacingCarJpaEntity(name = it.name, position = it.position) }
        racingCarJpaRepository.saveAll(racingCarJpaEntities)
    }
}