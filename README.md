This program use Simulated Annealing Algorithm for solving n queen problem. </br>
N Queen problem is the problem of placing N chess queens on NxN chessboard.</br>
To change size of the board you need to change N value in Main.java.</br>
For big values of N (>40) you may need to change some variables in Solution.java:</br>
    - INIT_TEMP - "temperature" of the system at start of algorithm;</br>
    - FINAL_TEMP - after reaching this "temperature" algorithm stops;</br>
    - ALPHA - temperature reducing factor (0 < ALPHA < 1);</br>
    - STEPS - steps per one iteration of algorithm;</br>
