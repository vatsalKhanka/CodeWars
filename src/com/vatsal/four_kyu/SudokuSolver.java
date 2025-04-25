package com.vatsal.four_kyu;

import java.util.*;

public class SudokuSolver {

    static class Coords {
        public int x, y;

        public Coords(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int[][] sudoku(int[][] puzzle) {
        for(int i = 0; i < 81; i++){
            HashMap<Coords, ArrayList<Integer>> poss = calcPossibilities(puzzle);

            for(Coords coords : poss.keySet()) {
                if(poss.get(coords).size()==1){
                    puzzle[coords.y][coords.x] = poss.get(coords).get(0);
                }
            }
        }

        return puzzle;
    }

    public static HashMap<Coords, ArrayList<Integer>> calcPossibilities (int[][] puzzle) {
        HashMap<Coords, ArrayList<Integer>> possibilities = new HashMap<>();

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (puzzle[j][i] != 0) continue;

                int boxX = (i - i % 3) / 3;
                int boxY = (j - j % 3) / 3;

                int[][] box = new int[][]{
                        Arrays.copyOfRange(puzzle[boxY * 3], boxX * 3, boxX * 3 + 3),
                        Arrays.copyOfRange(puzzle[boxY * 3 + 1], boxX * 3, boxX * 3 + 3),
                        Arrays.copyOfRange(puzzle[boxY * 3 + 2], boxX * 3, boxX * 3 + 3)
                };

                ArrayList<Integer> nums = new ArrayList();

                testLoop:
                for (int test = 1; test <= 9; test++) {

                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (box[y][x] == test) continue testLoop;
                        }
                    }

                    for (int x = 0; x < 9; x++) {
                        if (puzzle[j][x] == test) continue testLoop;
                    }

                    for (int y = 0; y < 9; y++) {
                        if (puzzle[y][i] == test) continue testLoop;
                    }
                    nums.add(test);
                }

                possibilities.put(new Coords(i,j), nums);
            }
        }

        return possibilities;
    }
}
