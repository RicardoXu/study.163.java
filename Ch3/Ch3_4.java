import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int foo = 0;
        if (n < 0) {
            System.out.print("fu ");
            n=-n;
        }
        if (n == 0) {
            System.out.println("ling");
        }
        else {
            int bar = n;
            int step = 1;
            while (bar > 0) {
                step = step * 10;
                bar = bar / 10;
            }
            step = step / 10;
            while (step > 0) {
                foo = n / step;
                switch (foo) {
                case 0:
                    System.out.print("ling");
                    break;
                case 1:
                    System.out.print("yi");
                    break;
                case 2:
                    System.out.print("er");
                    break;
                case 3:
                    System.out.print("san");
                    break;
                case 4:
                    System.out.print("si");
                    break;
                case 5:
                    System.out.print("wu");
                    break;
                case 6:
                    System.out.print("liu");
                    break;
                case 7:
                    System.out.print("qi");
                    break;
                case 8:
                    System.out.print("ba");
                    break;
                case 9:
                    System.out.print("jiu");
                    break;
                }
                n = n % step;
                step = step / 10;
                if (step > 0) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
    }

}