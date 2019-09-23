import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		double a, b, c, R1, R2;
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		if (a != 0 && b != 0 && c != 0 && (((b * b) -(4.00 * a * c)) > 0)) {
			R1 =(float) ((-b + Math.sqrt(((b * b) -(4.00 * a * c)))) / (2 * a));
			R2 =(float) ((-b - Math.sqrt(((b * b) -(4.00 * a * c)))) / (2 * a));
			
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}
		else {
			System.out.print("Impossivel calcular\n");
		}	
	}
}