package online.Lection06.actors;
import online.Lection06.models.Enemy;
public class Troll extends Enemy {

    public Troll(String name, int hp, int str, int x, int y) {
        super("Troll", name, hp, str, x, y);
    }

    @Override
    public void voice() {
        System.out.println("arrhrhhrhrh!");
    }

    public void doSomething() {
        System.out.println(name + "do Something");
    }
}
