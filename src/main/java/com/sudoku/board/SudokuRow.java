package com.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private final List<SudokuElement> rowElements = new ArrayList<>();

    public SudokuRow() {

    }

    public List<SudokuElement> getRowElements() {
        return rowElements;
    }

    public void getEmptyRow() {
        for (int i = 0; i < 9; i++) {
            rowElements.add(new SudokuElement(SudokuElement.EMPTY));
        }
    }

}

