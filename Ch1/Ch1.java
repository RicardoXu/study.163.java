import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();
        temp = (int)((5.0/9.0)*(temp-32));
        System.out.println(temp);
    }

}