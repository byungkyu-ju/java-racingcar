package racingCar;

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

	private void validateCarCount(int carCount) {
		if(carCount < 1) throw new IllegalArgumentException("자동차 수는 1보다 작을 수 없습니다.");
	}

	private void validateMatchCount(int matchCount) {
		if(matchCount < 1) throw new IllegalArgumentException("경기수는 1보다 작을 수 없습니다.");
	}

	public int getCarCount() {
		return carCount;
	}

	public int getMatchCount() {
		return matchCount;
	}
}