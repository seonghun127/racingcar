import config.racingcar.DependencyConfig

fun main() {
    val racingController = DependencyConfig.configureCreateRacingCarController()
    racingController.createMultiRacingCar()

    val raceController = DependencyConfig.configureRaceController()
    raceController.race()

    val winnerRacingCarController = DependencyConfig.configureWinnerRacingCarController()
    winnerRacingCarController.getWinners()
}