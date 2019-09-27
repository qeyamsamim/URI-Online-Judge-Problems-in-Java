import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int sum = 0;
			
			if(num1 < num2) {
				for(int j = num1 + 1; j < num2; j++) {
					if(j % 2 != 0) {
						sum += j;
					}
				}
			}else {
				for(int j = num2 + 1; j < num1; j++) {
					if(j % 2 != 0) {
						sum += j;
					}
				}
			}
			System.out.println(sum);
		}
	}
}
