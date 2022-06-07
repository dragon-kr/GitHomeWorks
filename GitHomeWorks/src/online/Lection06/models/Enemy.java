package online.Lection06.models;

public abstract class Enemy extends Actor {

    public Enemy(String type, String name, int hp, int str, int x, int y) {
        super(type, name, hp, str, x, y);
    }

    public void attack() {
        System.out.println(type + " attack with " + str);
    }

    public void speak() {
        System.out.println(name + " speak something");
    }

    public abstract void voice();

}