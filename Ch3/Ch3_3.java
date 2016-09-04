import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = 0;
        int count = 0;
        int i = 1;
        boolean flag = true;
        
        
        while (count < m) {
            i++;
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }                    
            }
            if (flag) {
                count++;
                if (count >= n){
                    ans = ans + i;
                }
            }       
        }
        System.out.println(ans);
    }

}