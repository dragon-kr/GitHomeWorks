package online.Lection06.actors;
import online.Lection06.models.Enemy;

    public class Orc extends Enemy {

    public Orc(String name, int hp, int str, int x, int y) {
        super("Orc", name, hp, str, x, y);
    }

    public void voice() {
        System.out.println(type + " " + name + " voice");
    }

    public void task() {
        System.out.println(type + " " + name + " task");
    }

}
