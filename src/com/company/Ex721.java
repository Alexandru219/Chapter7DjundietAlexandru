package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Ex721 {
    private static boolean penDown;
    private static int tX = 0, tY = 0;
    private static int[][] f = new int[20][20];
    private static short direction = 0;
    public static void main(String[] args) {
        initFloor(f);
        Scanner in = new Scanner(System.in);
        printMenu();
        int nextComm = in.nextInt();
        while (nextComm != 9) {
            switch (nextComm) {
                case 1:
                    penDown = false;
                    break;
                case 2:
                    penDown = true;
                    break;
                case 3:
                    direction++;
                    break;
                case 4:
                    direction--;
                    break;
                case 5:
                    System.out.println("How many steps do you want to move?");
                    int move = in.nextInt();
                    if (move <= 10)
                        while (--move != 0)
                            move();
                    break;
                case 6:
                    printArray();
                    break;
                default:
                    System.err.println("ERROR!!! Please try again:\n");
                    break;
            }
            move();
            System.out.println("Next command: ");
            nextComm = in.nextInt();
        }
    }

    private static void initFloor(int[][] floor) {
        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor[i].length; j++) {
                floor[i][j] = 0;
            }
        }
    }

    private static void printMenu() {
        System.out
                .println("Commands List:\nEnter 1-Pen up\n"
                        + "Enter 2-Pen down\n"
                        + "Enter 3-Turn right\n"
                        + "Enter 4-Turn left\n"
                        + "Enter 5 to 10 Move forward 10 spaces (replace 10 for a different number of spaces)\n"
                        + "Enter 6-Display the 20-by-20 array\n"
                        + "Enter 9-End of data:\n");
    }

    private static void printArray() {
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                System.out.print(f[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void move() {
        switch (direction) {
            case 0:
                tX++;
                break;
            case 1:
                tY++;
                break;
            case 2:
                tX--;
                break;
            case 3:
                tY--;
                break;
            default:
                if (direction < 0)
                    direction = 3;
                else
                    direction = 4;
                move();
                break;
        }
        if (penDown) {
            if (tX < 20 && tY < 20)
                f[tX][tY] = 1;
            else {
                direction -= 2;
                move();
            }
        }
    }
}