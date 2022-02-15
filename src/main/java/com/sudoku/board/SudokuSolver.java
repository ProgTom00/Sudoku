package com.sudoku.board;

public class SudokuSolver {

    private final SudokuBoard cloneBoard;

    public SudokuSolver(SudokuBoard cloneBoard) throws CloneNotSupportedException {
        this.cloneBoard = cloneBoard.deepCopy();
    }


    public SudokuBoard solve() throws CloneNotSupportedException {
        if (solveBoard()) {
            System.out.println("Sudoku has been resolved");
        } else {
            System.out.println("Impossible to solve");
        }
        return cloneBoard.deepCopy();
    }

    private boolean solveBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (cloneBoard.getSudokuBoard().get(i).getRowElements().get(j).getValue() == SudokuElement.EMPTY) {
                    for (int k = 1; k < 10; k++) {
                        if (isValidPlacement(i, j, k)) {
                            cloneBoard.getSudokuBoard().get(i).getRowElements().get(j).setValue(k);
                            if (solveBoard()) {
                                return true;
                            } else {
                                cloneBoard.getSudokuBoard().get(i).getRowElements().get(j).setValue(SudokuElement.EMPTY);
                            }
                        }
                    }
                    return false;

                }
            }
        }
        return true;
    }

    private boolean isValidPlacement(int x, int y, int value) {
        return !isInRow(y, value) && !isInCol(x, value) && !isInBox(x, y, value);
    }

    private boolean isInBox(int x, int y, int value) {
        int r = x - x % 3;
        int c = y - y % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (cloneBoard.getSudokuBoard().get(i).getRowElements().get(j).getValue() == value) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isInRow(int y, int value) {
        for (int i = 0; i < 9; i++) {
            if (cloneBoard.getSudokuBoard().get(i).getRowElements().get(y).getValue() == value) {
                return true;
            }
        }
        return false;
    }

    private boolean isInCol(int x, int value) {
        for (int i = 0; i < 9; i++) {
            if (cloneBoard.getSudokuBoard().get(x).getRowElements().get(i).getValue() == value) {
                return true;
            }
        }
        return false;
    }

    public void exampleFill(SudokuBoard sudokuBoard) {
        sudokuBoard.addInputExampleBoard(0, 2, 9);
        sudokuBoard.addInputExampleBoard(0, 6, 6);
        sudokuBoard.addInputExampleBoard(1, 1, 5);
        sudokuBoard.addInputExampleBoard(1, 3, 8);
        sudokuBoard.addInputExampleBoard(1, 4, 7);
        sudokuBoard.addInputExampleBoard(1, 7, 1);
        sudokuBoard.addInputExampleBoard(1, 8, 2);
        sudokuBoard.addInputExampleBoard(2, 0, 8);
        sudokuBoard.addInputExampleBoard(2, 5, 9);
        sudokuBoard.addInputExampleBoard(2, 7, 4);
        sudokuBoard.addInputExampleBoard(3, 1, 3);
        sudokuBoard.addInputExampleBoard(3, 3, 7);
        sudokuBoard.addInputExampleBoard(3, 6, 8);
        sudokuBoard.addInputExampleBoard(3, 8, 1);
        sudokuBoard.addInputExampleBoard(4, 1, 6);
        sudokuBoard.addInputExampleBoard(4, 2, 5);
        sudokuBoard.addInputExampleBoard(4, 7, 3);
        sudokuBoard.addInputExampleBoard(5, 0, 1);
        sudokuBoard.addInputExampleBoard(5, 8, 7);
        sudokuBoard.addInputExampleBoard(6, 3, 6);
        sudokuBoard.addInputExampleBoard(6, 4, 3);
    }
}
