package online.Lection05;

public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Setter
    public void setX(int x) {
        this.x = x;
    }

    public void changeX() {
        this.x += 1;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void changeY() {
        this.y -= 1;
    }
}
