package racingcar.service

import racingcar.port.`in`.dto.MovedRacingCarDto
import racingcar.port.`in`.MoveRacingCarUseCase
import racingcar.port.out.CreateMultiRacingCarPort
import racingcar.port.out.LoadAllRacingCarPort

class MoveRacingCarService(
    private val loadAllRacingCarPort: LoadAllRacingCarPort,
    private val createMultiRacingCarPort: CreateMultiRacingCarPort,
) : MoveRacingCarUseCase {

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