import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int tmp = 0;
		int position = 0;
		
		for(int i = 1; i <= 100; i++) {
			int num = scan.nextInt();
			
			if(num > tmp) {
				tmp = num;
				position = i;
			}
		}
		
		System.out.println(tmp);
		System.out.println(position);
	}
}
