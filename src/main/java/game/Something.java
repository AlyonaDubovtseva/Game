package game;
import java.util.*;

import game.Entity;

public class Something extends Entity {
    public Something() {}

    public Something(int x, int y) {
        super("Нечто", x, y);
    }

    @Override
    public void move() {
        y = (int) (Math.random() * 1000);
        x = (int) (Math.random() * 1000);
        incrementCountSteps();

    }

}
