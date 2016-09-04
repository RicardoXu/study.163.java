import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        boolean flag = true;
        String s;
        while (true) {
            s = in.next();
            if (s.endsWith(".")) {
                if (flag) {
                    System.out.print(s.length() - 1);
                    flag = false;
                }
                else {
                    System.out.print(" " + (s.length() - 1));
                }
                break;
            }
            else {
                if (flag) {
                    System.out.print(s.length());
                    flag = false;
                }
                else {
                    System.out.print(" " + s.length());
                }
            }
        }
    }

}