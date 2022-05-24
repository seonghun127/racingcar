package racingcar.adapter.out

import org.springframework.stereotype.Component
import racingcar.port.out.LoadAllRacingCarPort
import racingcar.domain.RacingCar
import racingcar.entity.RacingCarJpaRepository

@Component
class RacingCarLoadAdapter(
    private val racingCarJpaRepository: RacingCarJpaRepository
) : LoadAllRacingCarPort {

    override fun loadAll(): List<RacingCar> {
        return racingCarJpaRepository.findAll()
            .map { it.toDomain() }
    }
}