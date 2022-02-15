package com.sudoku.board;

public class SudokuElement {

    public static final int EMPTY = -1;
    private int value;


    public SudokuElement(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;

    }
}
