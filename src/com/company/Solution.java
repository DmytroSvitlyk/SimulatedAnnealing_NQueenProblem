package com.company;

import java.util.Random;

public class Solution {
    final public static float INIT_TEMP = 30.0f,
                       FINAL_TEMP = 0.5f,
                       ALPHA = 0.98f;
    final public static int STEPS = 100;

    public int[] solution;
    public static int size;
    public float energy;

    public Solution(int n) {
        size = n;
        solution = new int[size];
    }

    public void initSolution() {
        for (int i = 0; i < size; i++)
            this.solution[i] = i;
        for (int i = 0; i < size; i++)
            this.tweakSolution();
    }

    public void tweakSolution() {
        int temp, x, y;
        Random rand = new Random();
        x = rand.nextInt(size);
        do{
            y = rand.nextInt(size);
        } while (x==y);

        temp = this.solution[x];
        this.solution[x] = this.solution[y];
        this.solution[y] = temp;
    }

    public void calcEnergy() {
        int x, y, tempx, tempy;
        int[][] board = new int[size][size];
        final int[] dx = {-1, 1, -1, 1};
        final int[] dy = {-1, 1, 1, -1};

        for (int i = 0; i < size; i++) {
            board[i][this.solution[i]] = 1;
        }

        int tempEnergy = 0;
        for (int i = 0; i < size; i++) {
            x = i; y = this.solution[i];
            for (int j = 0; j < 4; j++) {
                tempx = x; tempy = y;
                while(true){
                    tempx+=dx[j]; tempy+=dy[j];
                    if((tempx < 0) || (tempx >= size) || (tempy < 0) || (tempy >= size))
                        break;
                    if(board[tempx][tempy] == 1)
                        tempEnergy++;
                }
            }
        }
        this.energy = tempEnergy;
    }

    public void copySolution(Solution sol) {
        if (size >= 0) System.arraycopy(sol.solution, 0, this.solution, 0, size);
        this.energy = sol.energy;
    }

    public void printSolution() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j == this.solution[i])
                    System.out.print("Q\t");
                else
                    System.out.print(".\t");
            }
            System.out.println("\n");
        }
    }

}
