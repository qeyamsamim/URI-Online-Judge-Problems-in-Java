import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int answer=0;
		
		for(int i = 1; i <= num; i++){
			
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			for(int j=1; j<=num1;j++){
				answer = (answer + num2) % j;
			}
			System.out.printf("Case %d: %d\n", i, answer + 1);
		}	
	}
}