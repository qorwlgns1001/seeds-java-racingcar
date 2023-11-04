package racingcar;

public class Application {
    public static void main(String[] args) {
        PlayInit playInit = new PlayInit();
        PlayerInput playerInput = new PlayerInput(playInit.name);
        String[] player = playerInput.getList(); // 플레이어 리스트
        int playCount = playInit.playCount; // 플레이 횟수
        int[] playerPoint = new int[player.length]; // 플레이어 점수
        System.out.println("실행결과");
        for (int i = 0; i < playCount; i++) {
            for (int j = 0; j < player.length; j++){
                new PlayerPoint(playerPoint, j);
            }
            new PrintPoint(player, playerPoint, player.length);
            System.out.println();
        }
//        for (int i = 0; i < player.length; i++) {
//            System.out.println(playerPoint[i]);
//        }
        new PrintWinner(player, playerPoint);
    }

}
