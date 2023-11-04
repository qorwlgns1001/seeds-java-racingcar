package racingcar;

public class PlayerInput {
    private String[] list;
    public PlayerInput(String input) {
        list = input.split(",");
        for (int i = 0; i < list.length; i++) {
            if (list[i].length() > 5) {
                throw new IllegalArgumentException();
            }
        }
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++){
                if (list[i].equals(list[j])) {
                    throw new IllegalArgumentException();
                }
            }
        }
    }
    public String[] getList() {
        return list;
    }
}
