package racingcar.adapter.out

import racingcar.port.out.LoadAllRacingCarPort
import racingcar.domain.RacingCar
import racingcar.entity.RacingCarJpaRepository

class RacingCarLoadAdapter(
    private val racingCarJpaRepository: RacingCarJpaRepository
) : LoadAllRacingCarPort {

    override fun loadAll(): List<RacingCar> {
        return racingCarJpaRepository.findAll()
            .map { it.toDomain() }
    }
}