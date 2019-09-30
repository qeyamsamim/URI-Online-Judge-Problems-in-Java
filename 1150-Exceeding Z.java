import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int z = scan.nextInt();
		
		if(z > x) {
			answer(z,x);
		}else {
			while(z <= x) {
				z = scan.nextInt();		
				if(z > x) {
					answer(z,x);
				}
			}
		}
	}

	private static void answer(int z, int x) {
		int sum = 0;
		int counter = 1;
		sum = x;
		
		while(sum < z) {		
			x++;
			sum += x;
			counter++;
		}
		System.out.println(counter);
	}
}
