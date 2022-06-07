package online.Lection06;
import online.Lection05.Coordinates;

import java.util.Random;
public class Coin {

    private int price;
    private Random random = new Random();
    private Coordinates coordinates;

    public Coin(int x, int y) {
        this.price = randomValue(10, 50);
        this.coordinates = new Coordinates(x,y);
    }

    private int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public int getPrice() {
        return price;
    }

}
