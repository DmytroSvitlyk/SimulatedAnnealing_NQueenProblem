package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    final static int N = 8;
    public static void main(String[] args) throws IOException {

        FileWriter file = new FileWriter("OUT.txt");

        int timer = 0, step, solution = 0, accepted;
        boolean useNew;
        float temp = Solution.INIT_TEMP;
        Solution current = new Solution(N);
        Solution working = new Solution(N);
        Solution best = new Solution(N);

        Random rand = new Random();

        current.initSolution();
        current.calcEnergy();
        best.energy = 100.0f;
        working.copySolution(current);

        while (temp > Solution.FINAL_TEMP) {
            file.write("temperature: " + temp + "\n");
            accepted = 0;

            for (step = 0; step < Solution.STEPS; step++) {
                useNew = false;

                working.tweakSolution();
                working.calcEnergy();

                if(working.energy <= current.energy) {
                    useNew = true;
                }
                else {
                    float test = rand.nextFloat();
                    float delta = working.energy - current.energy;
                    float calc = (float) Math.exp(-delta/temp);

                    if(calc > test) {
                        accepted++;
                        useNew = true;
                    }
                }

                if(useNew) {
                    useNew = false;
                    current.copySolution(working);

                    if(current.energy < best.energy) {
                        best.copySolution(current);
                        solution = 1;
                    }
                }
                else {
                    working.copySolution(current);
                }
            }
            file.write("Timer: " + timer++ + " | " + "Best energy: " + best.energy + " | " + "Accepted: " + accepted + "\n");
            temp *= Solution.ALPHA;
        }
        file.close();
        if(solution != 0) {
            best.printSolution();
        }
    }
}
