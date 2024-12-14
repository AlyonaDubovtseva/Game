package game;

public class Main {
    public static void main(String[] args) {
        int fieldWidth = 1000;
        int fieldHeigth = 1000;
        int finishFieldWight = 10;
        int finishFieldHeight = 10;
        int finishX = 495;
        int finishY = 495;
        int count = 0;
        Entity[] entities = new Entity[4];
        entities[0] = new Ant(0, 0);
        entities[1]  = new Grasshopper(0, 0);
        entities[2] = new Turtle(0, 0);
        entities[3] = new Something(0, 0);
        Entity.setFieldSize(fieldWidth, fieldHeigth);

        Game game = new Game(fieldWidth, fieldHeigth,
                finishFieldWight, finishFieldHeight,
                finishX, finishY, entities);
        Entity champion = game.start();
        System.out.println("Победитель: " + champion);
        System.out.println("Количество шагов: " + champion.getCountSteps());
    }
}
