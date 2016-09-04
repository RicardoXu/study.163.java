import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count1 = 0;
        int count2 = 0;
        int i = in.nextInt();
        while (i != -1) {
            if (i % 2 != 0) {
                count1++;
            } 
            else {
                count2++;
            }
            i = in.nextInt();
        }
        System.out.println(count1 + " " + count2);
    }

}