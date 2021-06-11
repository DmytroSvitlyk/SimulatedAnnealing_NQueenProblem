This program use Simulated Annealing Algorithm for solving n queen problem.
N Queen problem is the problem of placing N chess queens on NxN chessboard.
To change size of the board you need to change N value in Main.java.
For big values of N (>40) you may need to change some variables in Solution.java:
    - INIT_TEMP - "temperature" of the system at start of algorithm;
    - FINAL_TEMP - after reaching this "temperature" algorithm stops;
    - ALPHA - temperature reducing factor (0 < ALPHA < 1);
    - STEPS - steps per one iteration of algorithm;
