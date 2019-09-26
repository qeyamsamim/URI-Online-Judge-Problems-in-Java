import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a == 1){
			double sum = 4*b;
			System.out.printf("Total: R$ %.2f\n", sum);
		}
		else if(a == 2){
			double sum1 = 4.5*b;
			System.out.printf("Total: R$ %.2f\n", sum1);
		}
		else if(a == 3){
			double sum2 = 5*b;
			System.out.printf("Total: R$ %.2f\n", sum2);
		}
		else if(a == 4){
			double sum3 = 2*b;
			System.out.printf("Total: R$ %.2f\n", sum3);
		}
		else if(a == 5){
			double sum4 = 1.5*b;
			System.out.printf("Total: R$ %.2f\n", sum4);
		}
	}
}