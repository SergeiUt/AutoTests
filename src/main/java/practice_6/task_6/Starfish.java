package practice_6.task_6;

public class Starfish implements SeaCreature{
    @Override
    public void behavior() {
        System.out.println("Морская звезда спокойная.");
    }

    @Override
    public void move() {
        System.out.println("Морская звезда медленно ползает.");
    }
}
