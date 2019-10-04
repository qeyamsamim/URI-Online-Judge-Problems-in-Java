import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int in = 0;
		int out = 0;
		
		for(int x = 0; x < num1; x++){
			int num2 = scan.nextInt();
			
			if(num2 <= 20 && num2 >= 10){
				in += 1;
			}
			else{
				out += 1;
			}
		}
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
	}
}