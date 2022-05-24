package racingcar.entity

import org.springframework.data.jpa.repository.JpaRepository

interface RacingCarJpaRepository : JpaRepository<RacingCarJpaEntity, Long> {
}