package ru.geekbrains.java_core.lesson8;

public class Main {
    public static void main(String[] args) {
        int counter = 1;
        Obstacle obstacles[] = new Obstacle[]{
                new Wall(1),
                new Wall(3),
                new Track(150),
                new Track(50)
        };

        MovingObject movingObjects[] = new MovingObject[]{
                new Human(100, 2),
                new Cat(15, 1),
                new Robot(100, 0),
        };


        for (MovingObject movingObject : movingObjects) {
            System.out.println(counter+". "+ movingObject.getClass().getSimpleName());
            counter++;
            for (Obstacle obstacle : obstacles) {
                obstacle.test(movingObject);
                System.out.println();
            }
            System.out.println();
        }

    }
}
