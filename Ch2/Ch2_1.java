import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int timeBJT = in.nextInt();
        int min = timeBJT % 100;
        int hour = timeBJT / 100;
        int hourUTC = (hour + 24 - 8) % 24;
        String minUTC = String.format("%02d", min);
        if (hourUTC != 0) {
            System.out.println(hourUTC + minUTC);
        }
        else {
            System.out.println(min);
        }
    }

}