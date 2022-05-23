import config.racingCar.DependencyConfig

fun main() {
    val dependencyConfig = DependencyConfig()
    val racingController = dependencyConfig.configureRacingController()

    racingController.createMultiRacingCar()
}