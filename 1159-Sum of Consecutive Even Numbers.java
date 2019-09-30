import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int counter = 0;
		int sum = 0;
		
		while(num != 0){
			for(int i = num; i <= num+9; i++) {
				if(i % 2 == 0) {
					sum += i;
				}
				if(i == num + 9) {
					System.out.println(sum);
				}
			}
			num = scan.nextInt();
			sum = 0;
			counter++;
		}
	}
}