import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int time = scan.nextInt();
		int speed = scan.nextInt();
		
		double fuel = (time * speed)/12.0;
		
		System.out.printf("%.3f\n", fuel);
	}
}