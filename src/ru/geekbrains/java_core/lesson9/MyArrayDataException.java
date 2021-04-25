package ru.geekbrains.java_core.lesson9;

class MyArrayDataException extends Exception {
    private int i, j;
    private String val;

    public MyArrayDataException(int i, int j, String val, Exception ex) {
        super(ex);
        this.i = i;
        this.j = j;
        this.val = val;
    }

    @Override
    public String toString() {
        return "MyArrayDataException{" +
                "i=" + i +
                ", j=" + j +
                ", val=" + val +
                '}';
    }
}
