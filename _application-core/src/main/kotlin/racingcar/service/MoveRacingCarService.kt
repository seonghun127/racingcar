package racingcar.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import racingcar.port.`in`.dto.MovedRacingCarDto
import racingcar.port.`in`.MoveRacingCarUseCase
import racingcar.port.out.CreateMultiRacingCarPort
import racingcar.port.out.LoadAllRacingCarPort

const val MOVE_RACING_CAR_SERVICE = "MoveRacingCarService"

@Service(value = MOVE_RACING_CAR_SERVICE)
class MoveRacingCarService(
    private val loadAllRacingCarPort: LoadAllRacingCarPort,
    private val createMultiRacingCarPort: CreateMultiRacingCarPort,
) : MoveRacingCarUseCase {

    @Transactional
    override fun move(round: Int): List<MovedRacingCarDto> {
        val racingCars = loadAllRacingCarPort.loadAll()
        val movedRacingCars = generateSequence(racingCars) { racingCars ->
            racingCars.map {
                it.move { (Math.random() * 10).toInt() }
            }
        }
            .take(round)
            .last()
        createMultiRacingCarPort.create(movedRacingCars)

        return movedRacingCars.map { MovedRacingCarDto(it.name, it.position) }
    }
}