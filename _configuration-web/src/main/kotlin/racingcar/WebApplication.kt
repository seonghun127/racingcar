package racingcar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<WebApplication>(*args)
        }
    }
}