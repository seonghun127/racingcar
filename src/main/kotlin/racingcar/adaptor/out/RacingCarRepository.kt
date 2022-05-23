package racingcar.adaptor.out

import racingcar.domain.RacingCar

object RacingCarRepository {

    private val db = hashMapOf<String, RacingCar>()

    fun save(racingCar: RacingCar) {
        db[racingCar.name] = racingCar
    }

    fun save(racingCars: List<RacingCar>) {
        racingCars.forEach(this::save)
    }

    fun loadAll(): List<RacingCar> {
        return db.values.toList()
    }
}