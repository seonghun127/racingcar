package racingcar.adaptor.out

import racingcar.application.port.out.LoadAllRacingCarPort
import racingcar.domain.RacingCar

class RacingCarLoadAdaptor(
    private val racingCarRepository: RacingCarRepository
) : LoadAllRacingCarPort {

    override fun loadAll(): List<RacingCar> {
        return racingCarRepository.loadAll()
    }
}