package racingcar;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintWinner {
    public PrintWinner(String[] player, int[] playerPoint) {
        List<Integer> indexList = new ArrayList<>();
        int maxInt = Arrays.stream(playerPoint).max().getAsInt();
//        System.out.println(maxInt);
        for (int i = 0; i < player.length; i++) {
            if(maxInt == playerPoint[i]) {
                indexList.add(i);
            }
        }
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < indexList.size(); i++) {
            if (i != indexList.size() - 1) {
                System.out.print(player[indexList.get(i)] + ", ");
            }
            else {
                System.out.print(player[indexList.get(i)]);
            }
        }
    }
}
