package ru.geekbrains.java_core.lesson8;

class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }


    public void test(MovingObject movingObject) {
        if (movingObject.jump(height)) {
            System.out.println("The object passed the " + height + "m height wall");
        } else {
            System.out.println("The object failed to pass the " + height + "m height wall");
        }
    }
}
