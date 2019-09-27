import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int counter = 0;
		float sum = 0;
		
		while(scan.hasNext()) {
			float num = scan.nextFloat();
			
			if(num > 0 && num <= 10) {
				counter++;
				sum += num;
				if(counter == 2) {
					System.out.println("media = " + sum/2.0);
					break;
				}
			}else {
				System.out.println("nota invalida");
			}
		}
	}
}
