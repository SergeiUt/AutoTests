package practice_3;

public class GameSettings {
    /*
     * Создайте класс GameSettings с полями:
     * static int maxPlayers — общее ограничение игроков
     * final String gameName — название (нельзя менять)
     * int currentPlayers — сколько игроков в игре сейчас Реализуйте конструктор, статический метод setMaxPlayers(int),
     * метод addPlayer() — добавляет 1 игрока, если не превышен maxPlayers, метод printGameStatus() — выводит название,
     * текущее и максимальное количество игроков. В main: создайте 2 игры, измените maxPlayers,
     * добавьте игроков и выведите статус.
     */
    static int maxPlayers = 50;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int number) {
        maxPlayers = number;
    }

    public void addPlayer() {
        if(currentPlayers < maxPlayers) {
            currentPlayers++;
        }

    }

    public void printGameStatus() {
        System.out.println("Название игры: " + gameName + "; Текущее кол-во игроков: " + currentPlayers + "; " +
                "Максимальное кол-во игроков: " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Герои Меча и Магии 3", 30);
        GameSettings game2 = new GameSettings("CS", 50);
        maxPlayers = 53;
        game1.addPlayer();
        game1.addPlayer();
        game1.addPlayer();
        game1.addPlayer();
        game1.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();


    }







}
