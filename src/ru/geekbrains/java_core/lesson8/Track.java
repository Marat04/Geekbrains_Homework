package ru.geekbrains.java_core.lesson8;

class Track implements Obstacle {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public void test(MovingObject movingObject) {
        if (movingObject.run(distance)) {
            System.out.println("The object passed the  " + distance + "km long track");
        } else {
            System.out.println("The object failed to pass the  " + distance + "km long track");
        }
    }
}
