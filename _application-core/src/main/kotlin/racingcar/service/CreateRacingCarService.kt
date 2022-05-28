package racingcar.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import racingcar.domain.RacingCar
import racingcar.port.`in`.CreateMultiRacingCarUseCase
import racingcar.port.`in`.CreateRacingCarUseCase
import racingcar.port.out.CreateRacingCarPort

const val CREATE_RACING_CAR_SERVICE = "CreateRacingCarService"

@Service(value = CREATE_RACING_CAR_SERVICE)
class CreateRacingCarService(
    private val createRacingCarPort: CreateRacingCarPort
) : CreateRacingCarUseCase, CreateMultiRacingCarUseCase {

    @Transactional
    override fun create(name: String) {
        createRacingCarPort.create(RacingCar(name))
    }

    @Transactional
    override fun create(names: List<String>) {
        names.forEach(this::create)
    }
}