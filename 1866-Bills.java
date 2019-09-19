import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		for(int i = 0; i < input; i++) {
			int num = scan.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("0");
			}else {
				System.out.println("1");
			}
		}
	}
}
