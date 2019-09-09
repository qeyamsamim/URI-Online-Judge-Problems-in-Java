import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int hour = scan.nextInt();
		double salary = scan.nextDouble();
		
		double total = hour * salary;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n", total);
	}
}
