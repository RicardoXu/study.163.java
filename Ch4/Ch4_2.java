import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[][] tictactoe = new int[n][n];
        
        int i = 0;
        int j = 0;
        
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                tictactoe[i][j] = in.nextInt();
            }            
        }
                    
        int foo = 0;
        int winner = -1;

        
        for(i = 0; i < n; i++) {
            foo = tictactoe[i][0];
            for(j = 1; j < n; j++) {
                if (tictactoe[i][j] != foo)
                break;
            }
            if (j == n) {
                winner = foo;
            }
        }
        for(j = 0; j < n; j++) {
            foo = tictactoe[0][j];
            for(i = 1; i < n; i++) {
                if (tictactoe[i][j] != foo)
                break;
            }
            if (i == n) {
                winner = foo;
            }
        }
        for(i = 0; i < n - 1; i++) {
            if (tictactoe[i][i] != tictactoe[i +1][i + 1]) {
                break;
            }
            if (i == n - 2) {
                winner = tictactoe[0][0];
            }
        }
        for(i = 0; i < n- 1; ++i) {
            if (tictactoe[n - 1 - i][i] !=tictactoe[n - 2 - i][i + 1]) {
                break;
            }
            if (i == n - 2) {
                winner = tictactoe[n - 1][0];
            }
        }
        if(winner == 1) {
            System.out.println("X");
        }
        else if(winner==0) {
            System.out.println("O");
        }
        else {
            System.out.println("NIL");
        }
    }

}