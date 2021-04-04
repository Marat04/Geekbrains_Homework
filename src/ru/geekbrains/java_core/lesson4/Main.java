package ru.geekbrains.java_core.lesson4;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static char DOT_EMPTY = '.';
    public static char DOT_X = 'X'; //игрок 1 ходит символом Х
    public static char DOT_Y = 'Y'; //игрок 2 ходит символом Y
    public static char DOT_O = 'O'; //компьютер ходит нулем
    public static Scanner sc = new Scanner (System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn(DOT_X); //Игрок1
            printMap();
            if (checkWin1(DOT_X)==true) {
                System.out.println("Игрок1 выиграл!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            humanTurn(DOT_Y); //Игрок2
            printMap();
            if (checkWin1(DOT_Y)==true) {
                System.out.println("Игрок2 выиграл!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin1(DOT_O)==true){
                System.out.println("компьютер выиграл");
                break;
            };
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }


        }
        System.out.println("Игра закончена");
    }


    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)

                map[i][j] = DOT_EMPTY;

        }
    }
    public static void printMap() {
        for (int i=0; i <= SIZE; i++ ) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i <SIZE; i++){
            System.out.print((i+1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }


    public static void humanTurn(char symb) {
        int x, y;
        do {
            if (symb==DOT_X) System.out.println("Игрок 1 (фишка X), введите координаты в формате X Y");
            else System.out.println("Игрок 2 (фишка Y), введите координаты в формате X Y");
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;
        } while (!isCellValid(x,y));
        map[x][y] = symb;
    }


    public static boolean isCellValid(int x, int y) {
        if (x<0 || x >= SIZE || y <0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }


    public static void aiTurn() {
        int x, y;
        do {

            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x,y));
        map[x][y] = DOT_O;
        System.out.println("Компьютер (фишка O) выбрал ячейку (" +(x+1) + ")" + "("+ (y+1) + ")");
    }
    public static boolean isMapFull(){
        for (int i =0; i < SIZE; i++) {
            for (int j =0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        }
        return true;
    }


    public static boolean checkWin(char symb) {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }

    public static boolean checkWin1(char symb) {
        int horizCount=0;
        int vertCount=0;
        int diag1Count=0;
        int diag2Count=0;
        for (int j=0; j<SIZE; j++)
        {
            if (map[0][j]==symb) horizCount++;
            if (map[j][0]==symb) vertCount++;
            if (map[j][j]==symb) diag1Count++;
            if (map[j][SIZE-j-1]==symb) diag2Count++;

        }
        if(( horizCount==SIZE)||(vertCount==SIZE)||(diag1Count==SIZE)||(diag2Count==SIZE))
            return true;
        return false;

    }
}

