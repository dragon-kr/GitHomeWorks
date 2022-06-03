package online.Lection05;

public class Player {
    public static String msg = "Hello";

    //class fields
    private String name;
    private int hp;
    private int str;
    private int coins;
    private int score;
    private int exp;
    private Coordinates coordinates;
    private Weapon weapon;

    public static void doTest() {
        System.out.println("Player name is ");
    }

    public Player() {
        System.out.println("This command from constructor");
    }

    public Player(String name) {
        System.out.println("Value from constructor > " + name);
        this.name = name;
        attack();
    }

    public Player(String name, int hp, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.coordinates = new Coordinates(x, y);
        this.weapon = new Weapon();
//        this.coordinates.x = x;
//        this.coordinates.y = y;
    }

    void moveUp() {
//        coordinates.y -= 1;
        coordinates.changeY();
        System.out.println(name + " move up");
    }

    void moveRight() {
//        coordinates.x += 1;
        coordinates.changeX();
        coordinates.setX(35);
        System.out.println(name + " move right");
    }

    void decreaseHealth(int incomingDamage) {
        hp -= incomingDamage;
        System.out.println(name + " decrease self health on " + incomingDamage);
        System.out.println(name + " have health point is " + hp);
    }

    void attack() {
        System.out.println(name + " attack with " + str * 15);
    }

    void getNewLevel(int valueCoins, int valueScore) {
        coins += valueCoins;
        score += valueScore;
        exp += score * coins;
    }

    //getter
    public String getName() {
        return name;
    }

    class Weapon {
        int attack;
        String type;

        void repairSelf() {
            System.out.println(type + " repair self");
        }
    }
}
