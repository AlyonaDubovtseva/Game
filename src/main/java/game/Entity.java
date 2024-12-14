package game;

public class Entity {
    protected String name;
    protected int x;
    protected int y;
    protected static int fieldWidth;
    protected static int fieldHeight;
    protected int countSteps;

    public Entity() {}

    public Entity(String name) {
        this.name = name;
    }

    public Entity(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void move() {
    }

    public String toString() {
        return this.name + " (" + this.x + ", " + this.y + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCountSteps() {
        return countSteps;
    }

    public void setCountSteps(int countSteps) {
        this.countSteps = countSteps;
    }
    public void incrementCountSteps() {
        this.countSteps++;
    }

    public static void setFieldSize(int width, int height) {
        fieldWidth = width;
        fieldHeight = height;
    }
}