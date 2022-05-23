package racingcar.domain

class RacingCar(
    val name: String,
    var position: Int = 0,
) {

    fun move(func: () -> Int): RacingCar {
        return if(func() < 4) this else RacingCar(name, ++position)
    }
}