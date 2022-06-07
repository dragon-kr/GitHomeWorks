package online.Lection06.models;
import online.Lection05.Coordinates;

public abstract class Actor {
    protected String type;
    protected String name;
    protected int hp;
    protected int str;
    protected Coordinates coordinates;
    protected String value;

    public Actor(String type, String name, int hp, int str, int x, int y) {
        this.type = type;
        this.name = name;
        this.hp = hp;
        this.str = str;
        this.coordinates = new Coordinates(x, y);
    }

    public abstract void attack();

    public void run(int args) {
        System.out.println("run");
    }

    public void moveUp() {
        coordinates.changeY();
        System.out.println(type + " move up. My place is " + coordinates.getX() + ":" + coordinates.getY());
    }

    public void moveRight() {
        coordinates.changeX();
        System.out.println(name + " move right. My place is " + coordinates.getX() + ":" + coordinates.getY());
    }

    public void decreaseHealth(int incomingDamage) {
        hp -= incomingDamage;
        System.out.println(name + " decrease self health on " + incomingDamage);
        System.out.println(name + " have health point is " + hp);
    }
}
