package racingcar.entity

import racingcar.domain.RacingCar
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class RacingCarJpaEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var name: String,

    var position: Int = 0,
) {

    fun toDomain(): RacingCar {
        return RacingCar(name, position)
    }
}