package racingcar.adapter.out

import racingcar.domain.RacingCar
import racingcar.port.out.LoadAllRacingCarPort

class RacingCarLoadAdapter : LoadAllRacingCarPort {

    override fun loadAll(): List<RacingCar> {
        return RacingCarRepository.loadAll()
    }
}