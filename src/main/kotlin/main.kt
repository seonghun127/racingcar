import config.racingcar.DependencyConfig

fun main() {
    val dependencyConfig = DependencyConfig()
    val racingController = dependencyConfig.configureRacingController()

    racingController.createMultiRacingCar()
}