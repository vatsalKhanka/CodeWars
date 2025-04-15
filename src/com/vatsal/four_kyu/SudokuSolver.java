package com.vatsal.four_kyu;

import java.util.ArrayList;
import java.util.Arrays;

public class SudokuSolver {

    public static int[][] sudoku(int[][] puzzle) {

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(puzzle[i][j] != 0) continue;

                int boxX = (i - i%3)/3;
                int boxY = (j - j%3)/3;

                int[][] box = new int[][] {
                        Arrays.copyOfRange(puzzle[boxX], boxY, boxY + 3),
                        Arrays.copyOfRange(puzzle[boxX+1], boxY, boxY + 3),
                        Arrays.copyOfRange(puzzle[boxX+2], boxY, boxY + 3)
                };


                System.out.println("(" + boxX + ", " + boxY + ")");
                System.out.println("-----------------");
                for(int k = 0; k < 3; k++) {
                    System.out.println(Arrays.toString(box[k]));
                }
                System.out.println("-----------------");

                testLoop:
                for(int test = 1; test < 10; test++){
                    for(int x = 0; x < 9; x++){
                        if(puzzle[x][j] == test){
                            continue testLoop;
                        }
                    }

                    for(int y = 0; y < 9; y++){
                        if(puzzle[i][y] == test){
                            continue testLoop;
                        }
                    }

                    for(int x = 0; x < 3; x++){
                        for(int y = 0; y < 3; y++){
                            if(box[x][y] == test) continue testLoop;
                        }
                    }

                    puzzle[i][j] = test;
                    break;
                }
            }
        }

        return puzzle;
    }
}
