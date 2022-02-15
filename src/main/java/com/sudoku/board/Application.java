package com.sudoku.board;


public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {
        checkResultGame();
    }


    public static void checkResultGame() throws CloneNotSupportedException {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame game = new SudokuGame();
            gameFinished = game.resolve();

        }
    }

}




