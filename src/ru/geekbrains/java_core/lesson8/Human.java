package ru.geekbrains.java_core.lesson8;

class Human implements MovingObject {
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }


    public boolean run(int distance) {
        System.out.println("the human runs (max run distance: "+ maxRunDistance + ")");
        if (distance > this.maxRunDistance) {
            return false;
        } else {
            return true;
        }
    }


    public boolean jump(int height) {
        System.out.println("the human jumps  (max jump distance: "+ maxJumpHeight +")");
        if (height > this.maxJumpHeight) {
            return false;
        } else {
            return true;
        }
    }
}
