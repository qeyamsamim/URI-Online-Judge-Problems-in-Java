import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		double r = scan.nextDouble();
		double area = 3.14159 * r * r;
		
		System.out.printf("A=%.4f\n", area);
	}
}
