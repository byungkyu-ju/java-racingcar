package racingCar;

import java.util.Arrays;

/**
 * @author : byungkyu
 * @date : 2020/12/07
 * @description :
 **/
public class Game {
	private static int carCount;
	private static int matchCount;

	public Game(int carCount, int matchCount) {
		validateCarCount(carCount);
		validateMatchCount(matchCount);
		this.carCount = carCount;
		this.matchCount = matchCount;
	}

	public Game(String userInputCarNames, int matchCount) {
		String[] carNames = splitCarNames(userInputCarNames);
		validateCarCount(carNames.length);
		validateMatchCount(matchCount);
		this.carCount = carNames.length;
		this.matchCount = matchCount;
	}

	private String[] splitCarNames(String userInputCarNames) {
		return userInputCarNames.split(",");
	}

	private void validateCarCount(int carCount) {
		if (carCount < 1)
			throw new IllegalArgumentException("자동차 수는 1보다 작을 수 없습니다.");
	}

	private void validateMatchCount(int matchCount) {
		if (matchCount < 1)
			throw new IllegalArgumentException("경기수는 1보다 작을 수 없습니다.");
	}

	public int getCarCount() {
		return carCount;
	}

	public int getMatchCount() {
		return matchCount;
	}

	public Cars start() {
		Cars cars = new Cars(carCount, matchCount);
		return cars.race();
	}
}
