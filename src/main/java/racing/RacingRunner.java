package racing;

import racing.controller.RacingController;
import racing.view.InputView;
import racing.view.ResultView;

public class RacingRunner {
    public static void main(String[] args) {
        new RacingController(new InputView(), new ResultView()).processGame();
    }
}