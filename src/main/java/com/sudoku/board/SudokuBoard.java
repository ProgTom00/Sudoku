package com.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype<SudokuBoard> {

    private List<SudokuRow> sudokuBoard = new ArrayList<>();

    public SudokuBoard() {
    }

    public void createBoard() {
        for (int i = 0; i < 9; i++) {
            sudokuBoard.add(new SudokuRow());
        }
        for (SudokuRow row : sudokuBoard) {
            row.getEmptyRow();
        }

    }

    public void addInputExampleBoard(int x, int y, int value) {
        sudokuBoard.get(x).getRowElements().set(y, new SudokuElement(value));

    }

    public void addInputUser(int x, int y, int value) {
        sudokuBoard.get(x - 1).getRowElements().set(y - 1, new SudokuElement(value));
    }

    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }


    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard cloneBoard = (SudokuBoard) super.clone();
        cloneBoard.sudokuBoard = new ArrayList<>();
        for (SudokuRow row : sudokuBoard) {
            SudokuRow clonedRow = new SudokuRow();
            for (SudokuElement element : row.getRowElements()) {
                clonedRow.getRowElements().add(element);
            }
            cloneBoard.getSudokuBoard().add(clonedRow);
        }
        return cloneBoard;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sudokuBoard.size(); i++) {
            result.append("| ");
            if (i % 3 == 0) {
                result.append("++++++|+++++++|+++++++|\n| ");
            }
            for (int j = 0; j < sudokuBoard.size(); j++) {
                if (sudokuBoard.get(i).getRowElements().get(j).getValue() == -1) {
                    result.append(". ");

                } else {
                    result.append(sudokuBoard.get(i).getRowElements().get(j).getValue()).append(" ");
                }
                if (j == 2 || j == 5) result.append("| ");
            }
            result.append("|\n");
        }
        return result.toString();
    }
}

