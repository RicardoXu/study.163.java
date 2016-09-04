import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int foo = 0;
        int bar = 0;
        int[] power = new int[101];
        int max = 0;
        
        do {
            foo = in.nextInt();
            bar = in.nextInt();
            power[foo] = power[foo] + bar;
            if(foo > max) {
               max = foo;    
            }
        } while(foo != 0);
        do {
            foo = in.nextInt();
            bar = in.nextInt();
            power[foo] = power[foo] + bar;
            if(foo > max) {
                max = foo;    
            }
        } while(foo != 0);
        
        boolean flag = true;
        for(int i = max; i > 0; i--) {
            if(power[i] > 0) {
                if (flag) {
                    flag = false;
                    }
                else {
                    System.out.print("+");
                }
                if (power[i] !=1) {
                    System.out.print(power[i]);
                }
                System.out.print("x");
                if(i != 1) {
                    System.out.print(i);
                }
            }
            else if(power[i] <0) {
                flag = false;
                if(power[i] != -1) {
                    System.out.print(power[i]);
                }
                else {
                    System.out.print("-");
                }
                System.out.print("x");
                if(i != 1) {
                    System.out.print(i);
                }
            }
        }     
        if (power[0] >= 0) {
            if (flag) {
                flag = false;
                System.out.print(power[0]);
            }
            else if(power[0] != 0) {
                System.out.print("+"+power[0]);
            }
        }
        else if(power[0] < 0) {
            System.out.print(power[0]);
        }
    }

}