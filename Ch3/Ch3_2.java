import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int temp = in.nextInt();
        int ans = 0;
        int i = 1;
        int step = 1;
        int now = 0;
        while (temp > 0) {
            now = temp % 10;
            if ( (now % 2) == (i % 2)) {
                ans = ans + step;
            }
            
            temp = temp / 10;
            i++;
            step = step * 2;
        }
        System.out.println(ans);
    }

}