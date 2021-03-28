package ru.geekbrains.java_core.lesson2;

public class Main {

    public static void main(String[] args) {
        System.out.println("проверка задания 1");
        int[] array1 = {0, 1, 1, 0, 0, 0, 1};
        replaceNumbers(array1);
        System.out.println();
        System.out.println("проверка задания 2");
        int [] array2 = new int [8];
        fillEmptyArray(array2);
        System.out.println();
        System.out.println("проверка задания 3");
        int[]array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doubleNumbers (array3);
        System.out.println();
        System.out.println("проверка задания 4");
        int [][] array4 = new int[5][5];
        fillDiagonal(array4);

    }
    public static void replaceNumbers(int[] array){
        for (int i = 0; i < array.length; i += 1) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.println(array[i]);


        }

    }

    public static void fillEmptyArray (int[]array) {
        int k = 0;
        for(int i = 0; i < array.length; i += 1){
            array[i] = k;
            k = k+3;
            System.out.println(array[i]);
        }

    }

    public static void doubleNumbers (int[]array) {
        for(int i = 0; i < array.length; i += 1) {
            if (array[i] < 6) {
                array[i] = array[i]*2;
                System.out.println(array[i]);
            }
        }
    }

    public static void fillDiagonal (int [][] array) {
        for (int i = 0; i < array.length; i += 1) {
            for ( int j = 0; j < array[i].length; j += 1) {
                if ((i == j)||(i+j == array.length-1)){
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]+ " " );
            }
            System.out.println();
        }
    }


}
