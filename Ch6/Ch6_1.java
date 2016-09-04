import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        boolean flag = true;
        int temp = n;
        for (int i = 2; i <= temp; ++i) {
            while (true) {
                if (temp % i == 0) {
                    if (flag) {
                        System.out.printf(n + "=" + i);
                        flag = false;
                    } else
                        System.out.printf("x" + i);
                    temp /= i;
                }
                else {
                	break;
                }
            }
        }
        if (flag) {
        	System.out.printf(n + "=" + n);
        }    
    }

}