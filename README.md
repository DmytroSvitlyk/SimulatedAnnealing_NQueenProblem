This program use Simulated Annealing Algorithm for solving n queen problem. </br>
N Queen problem is the problem of placing N chess queens on NxN chessboard.</br>
To change size of the board you need to change N value in Main.java.</br>
For big values of N (>40) you may need to change some variables in Solution.java:</br>
&nbsp;&nbsp;&nbsp;&nbsp;- INIT_TEMP - "temperature" of the system at start of algorithm;</br>
&nbsp;&nbsp;&nbsp;&nbsp;- FINAL_TEMP - after reaching this "temperature" algorithm stops;</br>
&nbsp;&nbsp;&nbsp;&nbsp;- ALPHA - temperature reducing factor (0 < ALPHA < 1);</br>
&nbsp;&nbsp;&nbsp;&nbsp;- STEPS - steps per one iteration of algorithm;</br>
As a result you will get file OUT.txt with info about iterations of algorithm and "board" at console window with placed queens.</br>
Example for N = 8: </br></br>
<img src="https://user-images.githubusercontent.com/72920051/121740378-ae088100-cb05-11eb-9396-cf489be8fba0.png" alt = "image" width = 300/>


