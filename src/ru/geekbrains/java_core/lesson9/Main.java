package ru.geekbrains.java_core.lesson9;

public class Main {
    static int matrixSum(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        if (matrix.length != 4) {
            throw new MyArraySizeException("wrong rows count: " + matrix.length);
        }
        int result = 0;
        int i=0;
        for (String[] rows : matrix) {
            if (rows.length != 4) {
                throw new MyArraySizeException("wrong count of elemenents in the row: " + rows.length);
            }
            int j=0;
            for (String element : rows) {
                try {
                    result += Integer.valueOf(element);
                } catch (NumberFormatException ex) {
                    System.out.println("can't convert " + element + " into integer");
                    throw new MyArrayDataException(i, j, element, ex);
                }
                j++;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] correctMatrix = new String[][] {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };

        String[][] wrongSizeMatrix = new String[][] {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3"},
                {"1", "2", "3", "4"},
        };

        String[][] wrongIntMatrix = new String[][] {
                {"1", "2", "3", "4"},
                {"1", "2", "x", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        try {
            System.out.println("matrixSum: " + matrixSum(correctMatrix));
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println();

        try {
            System.out.println("matrixSum: " + matrixSum(wrongSizeMatrix));
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println();

        try {
            System.out.println("matrixSum: " + matrixSum(wrongIntMatrix));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
