## Table of contest

* [General info](#general-info)
* [Game navigation](#game-navigation)
* [Board](#board)
* [Algorithm](#Algorithm)
* [Technologies](#Technologies)
* [Setup](#Setup)


## General info
I present to you a Sudoku resolver game. You decide how many numbers you want to put into the board.
If it's possible to solve, application will print out the board with correct solution or print message that present 
sudoku board cannot be solved.

## Game navigation
The console accepts values in the correct form. Each value to be typed will be preceded by a console message.
Firstly users will have to enter the row number, then the column and the value. The possible number of row column and value are
from 1 to 9. After entering a value into the console, it will show whether the user wants to add a new value to the sudoku board,
or there will be a second option to choose so that the user sees the sudoku solution. Next, when the board is ready
you have to type 'sudoku' to start the process.

## Board
The board contains 9x9 elements grid. 

## Algorithm

* Each row has unique numbers from 1 to 9 or empty spaces.
* Each column has unique numbers from 1o to 9 or empty spaces.
* Every sudoku sub-box (3x3) has unique numbers from 1 to 9 or empty spaces.

The algorithm will "guess" at each step to find the final solution.
If a number is not present in appropriate row,column or sub-box, algorithm assigns the number
and recursively checks whether that assignment leads to solution or not.
## Technologies

Project is created with:

* IntelliJ IDEA Community Edition 2021.1.3 x64
* JUnit Jupiter Engine version: 5.7.0
* JUnit Jupiter Api version: 5.7.0
* Mockito JUnit Jupiter version: 4.1.0
* Gradle version 7.3.1

## Setup

To run this game, just run main method from Application class.



