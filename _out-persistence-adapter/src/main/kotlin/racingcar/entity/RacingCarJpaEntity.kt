package racingcar.entity

import racingcar.domain.RacingCar
import javax.persistence.*

@Entity
@Table(name = "racing_car")
class RacingCarJpaEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "racing_car_id")
    var id: Long? = null,

    @Column(name = "car_name")
    var name: String,

    @Column(name = "car_position")
    var position: Int = 0,
) {

    fun toDomain(): RacingCar {
        return RacingCar(name, position)
    }
}