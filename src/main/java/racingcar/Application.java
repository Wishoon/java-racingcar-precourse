package racingcar;

import racingcar.domain.RacingGame;
import racingcar.domain.RacingRecord;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
	public static void main(String[] args) {
		RacingGame racingGame = RacingGame.createRacingGame(
			InputView.getInputCarsName(),
			InputView.getInputRound()
		);
		int roundCount = 0;
		OutputView.printRacingRecordHeadLine();
		while (racingGame.isContinue(roundCount++)) {
			RacingRecord racingRecord = racingGame.race();
			OutputView.printRacingRecord(racingRecord);
		}
		OutputView.printRacingWinners(racingGame.getRacingResult());
	}
}
