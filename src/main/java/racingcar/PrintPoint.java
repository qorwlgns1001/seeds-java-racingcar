package racingcar;

public class PrintPoint {
    public PrintPoint(String[] player, int[] playerPoint, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(player[i] + " : ");
            for (int j = 0; j < playerPoint[i]; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
