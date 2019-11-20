package racingcarWinner;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcarWinner.domain.Car;
import racingcarWinner.domain.RacingGame;

class RacingGameTest {

    private static String inputName = "pobi,crong,honux";

    private RacingGame racingGame = new RacingGame(inputName);

    @DisplayName("입력받은 값만큼 자동차수가 생성되는지 확인")
    @Test
    void initNumberOfCarArray() {
        assertThat(racingGame.parseCarNameArr(inputName).length).isEqualTo(3);
    }

    @DisplayName("입력한 값과 일치하는 자동차가 생성되는지 확인")
    @Test
    void createCarInform() {
        Car car = new Car("pobi", 3);
        assertThat(car.getName()).isEqualTo("pobi");
        assertThat(car.getPosition()).isEqualTo(3);
    }

    @DisplayName("입력받은 자동차 리스트가 생성되는지 확인")
    @Test
    void createCarList() {
        List<Car> list = racingGame.createCarList(racingGame.parseCarNameArr(inputName));
        assertThat(list.size()).isEqualTo(racingGame.parseCarNameArr(inputName).length);
    }

    @DisplayName("자동차가 움직임을 시도했을때, 4보다 큰 값이 들어오면 위치는 기존값 +1")
    @Test
    void tryMove() {
        Car car = new Car("pobi", 0);
        if (racingGame.isMove(5)) {
            car.move();
        }
        assertThat(car.getPosition()).isEqualTo(1);
    }

}