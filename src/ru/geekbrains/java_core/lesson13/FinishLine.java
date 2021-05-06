package ru.geekbrains.java_core.lesson13;

class FinishLine {
    private Car winner;

    synchronized void finish(Car winner) {
        if (this.winner == null) {
            this.winner = winner;
            System.out.println("WIN: " + winner.getName());
        }
    }
}
