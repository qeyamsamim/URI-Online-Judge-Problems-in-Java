import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			int cityA = scan.nextInt();
			int cityB = scan.nextInt();
			double popA = scan.nextDouble();
			double popB = scan.nextDouble();
			int counter = 0;
			
			while(cityA <= cityB) {
				cityA += (int) ((cityA * popA) / 100);
				cityB += (int) ((cityB * popB) / 100);
				counter++;
			}
			
			if(counter > 100) {
				System.out.println("Mais de 1 seculo.");
			}else {
				System.out.println(counter + " anos.");
			}
		}
	}
}
