package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class PlayerPoint {
    public PlayerPoint(int[] playerPoint, int j) {
        if(Randoms.pickNumberInRange(0,9) > 3){
            playerPoint[j]++;
        }
    }
}
