import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> cityName= new HashMap<String, Integer>();
		int i = 0;
		while (!in.hasNext("###")) {
			cityName.put(in.next(), i);
			i = i + 1;
		}
		in.next();
		
		int[][] cityDistance = new int[i][i];
		for (int j = 0; j < i; j = j + 1)
			for(int k = 0; k < i; k = k + 1) {
				cityDistance[j][k] = in.nextInt();
			}
		
		int j = cityName.get(in.next());
		int k = cityName.get(in.next());
		System.out.println(cityDistance[j][k]);
	}

}