package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class PlayInit {
    String name; // 자동차 이름
    int playCount; // 경주 횟수
    public PlayInit() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        name = readLine();
        if (name.contains(" ")) {
            throw new IllegalArgumentException();
        }
        System.out.println("시도할 회수는 몇회인가요?");
        playCount = Integer.parseInt(readLine());
    }
}
