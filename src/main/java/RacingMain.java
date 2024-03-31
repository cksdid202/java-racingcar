import controller.RacingGame;
import view.InputView;
import view.OutputView;

public class RacingMain {

    public static void main(String[] args) {
        // TODO: MVC 패턴을 기반으로 자동차 경주 미션 구현해보기
        
        final var carNames = InputView.getCarNames();
        final var tryCount = InputView.getTryCount();
        
        final var racingGame = new RacingGame(carNames, tryCount);
        racingGame.race();
        
        OutputView.printWinners(racingGame.getWinners());
        
    }
}
