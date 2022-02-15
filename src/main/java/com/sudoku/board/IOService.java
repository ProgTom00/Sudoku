package com.sudoku.board;

public class IOService {

    public static void message1() {
        System.out.println("You need to enter correctly row,column,value number a range from (1-9)");
    }

    public static void choiceUser() {
        System.out.println("Welcome in the Sudoku game\nChoose the board on which you wanna play");
    }

    public static void message() {
        System.out.println("Press '1' for empty board\nPress '2' for filled board\"");
    }

    public static void solveSudoku() {
        System.out.println("Write 'SUDOKU' to get a solution");
    }


    public static void putElements() {
        System.out.println("If you want to put element into board press[Y] or [N]");
    }

    public static void invalidValue() {
        System.out.println("Invalid value, please Try again");
    }

    public static void newGameMessage() {
        System.out.println("To start a new game press 'Y', or 'Q' to quit the application");
    }

}
