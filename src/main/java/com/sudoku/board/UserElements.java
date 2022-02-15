package com.sudoku.board;

import java.util.Scanner;

public class UserElements {
    private static final Scanner scanner = new Scanner(System.in);

    public int getRow() {
        System.out.println("Please enter row:");
        return getUserElementSelection();
    }

    public int getCol() {
        System.out.println("Please enter column:");
        return getUserElementSelection();
    }

    public int getValue() {
        System.out.println("Please enter Value:");
        return getUserElementSelection();

    }

    private static int getUserElementSelection() {

        while (true) {
            String s = scanner.nextLine();
            switch (s) {
                case "1":
                    return 1;
                case "2":
                    return 2;
                case "3":
                    return 3;
                case "4":
                    return 4;
                case "5":
                    return 5;
                case "6":
                    return 6;
                case "7":
                    return 7;
                case "8":
                    return 8;
                case "9":
                    return 9;
                default:
                    System.out.println("Wrong data,try again");
            }

        }
    }
}
