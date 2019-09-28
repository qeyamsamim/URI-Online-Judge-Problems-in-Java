import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		if(b + c > a && b + a > c && c + a > b){
			double sum = a + b + c;
			System.out.printf("Perimetro = %.1f\n", sum);
		}
		else{
			double sum1 = ((a + b) / 2) * c;
			System.out.printf("Area = %.1f\n", sum1);
		}
	}
}