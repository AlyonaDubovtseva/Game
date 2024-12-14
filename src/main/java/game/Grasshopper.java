package game;
import java.util.*;

public class Grasshopper extends Entity {
    public Grasshopper() {}

    public Grasshopper(int x, int y) {
        super("Кузнечик", x, y);
    }

    @Override
    public void move() {
        int direction = (int) (Math.random() * 3);
        switch (direction) {
            case 0:
                if (x > 0){
                    --x;
                }
                break;
            case 1:
                if (y > 0){
                    y-=2;
                }
                break;
            case 2:
                if (x < fieldHeight){
                    ++x;
                }
                break;
        }
        incrementCountSteps();
    }
}

