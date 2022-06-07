package online.Lection06.actors;
import online.Lection06.models.Actor;

public class Player extends Actor {

    private String name;
    private int coins;
    private int score;
    private int exp;

    public Player(String type, String name, int x, int y) {
        super(type, name, 100, 25, x, y);
        this.coins = 0;
        this.score = 0;
        this.exp = 0;
        this.name = name;
    }

    public void giveMeInfoSelf() {
        System.out.println("My name is " + name);
    }

//    public Player(String type, String name, int x, int y, String value) {
//        super(type, name, 100, 25, x, y,  value);
//        this.coins = 0;
//        this.score = 0;
//        this.exp = 0;
//    }

    @Override
    public void attack() {
        System.out.println(name + " attack with " + str * 15);
    }

    public void getNewLevel(int valueCoins, int valueScore) {
        coins += valueCoins;
        score += valueScore;
        exp += score * coins;
    }

    @Override
    public void run(int value) {
        System.out.println(type + " > " + name + " fast run");
    }
}
