import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int distance = scan.nextInt();
		double fuel = scan.nextDouble();
		
		double average = distance/fuel;
		
		System.out.printf("%.3f km/l\n", average);
	}
}