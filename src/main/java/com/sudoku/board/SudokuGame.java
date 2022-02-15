package com.sudoku.board;

import java.util.Arrays;
import java.util.Scanner;

public class SudokuGame {
    private final SudokuBoard board = new SudokuBoard();
    private final Scanner scanner = new Scanner(System.in);
    private final SudokuSolver solver = new SudokuSolver(board);


    public SudokuGame() throws CloneNotSupportedException {
    }

    public boolean resolve() {
        board.createBoard();
        resultChoiceUser();
        return true;
    }

    private void resultChoiceUser() {
        if (choiceUser()) {
            try {
                solveSudoku();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean choiceUser() {
        IOService.choiceUser();
        IOService.message();
        String sc323 = scanner.nextLine();
        switch (sc323) {
            case "1":
                emptyBoard();
                return true;
            case "2":
                exampleFillSudoku();
                return true;
            default:
                choiceUser();
        }
        return true;
    }

    private void exampleFillSudoku() {

        solver.exampleFill(board);
        System.out.println(board);

    }


    private void emptyBoard() {
        IOService.message1();
        while (true) {
            IOService.putElements();
            String s = scanner.nextLine();
            switch (s) {
                case "Y":
                    System.out.println(board);
                    UserElements userElements = new UserElements();
                    board.addInputUser(userElements.getRow(), userElements.getCol(), userElements.getValue());
                    System.out.println(board);
                    break;
                case "N":
                    return;
                default:
                    IOService.invalidValue();
            }

        }
    }

    private void endChoice() throws CloneNotSupportedException {
        IOService.newGameMessage();
        while (true) {
            String choice = scanner.nextLine();
            switch (choice) {
                case "Y":
                    Application.checkResultGame();
                case "Q":
                    System.exit(0);
                default:
                    IOService.invalidValue();
            }

        }
    }

    private void solveSudoku() throws CloneNotSupportedException {


        IOService.solveSudoku();
        String s = scanner.nextLine();
        try {
            if ("SUDOKU".equals(s)) {
                SudokuSolver solver = new SudokuSolver(board);
                SudokuBoard result = solver.solve();
                System.out.println(result);
                endChoice();
            } else {
                solveSudoku();
            }

        } catch (CloneNotSupportedException k) {
            System.out.println(Arrays.toString(k.getStackTrace()));
        }
    }
}




