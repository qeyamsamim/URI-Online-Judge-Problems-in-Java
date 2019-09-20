import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			int nom1 = scan.nextInt();
			char slash1 = scan.next().charAt(0);
			int den1 = scan.nextInt();
			
			char op = scan.next().charAt(0);
			
			int nom2 = scan.nextInt();
			char slash2 = scan.next().charAt(0);
			int den2 = scan.nextInt();
			
			int den = 0;
			int nom = 0;
			
			switch(op) {
				case '+':
					den = den1 * den2;
					nom = ((den / den1) * nom1) + ((den / den2) * nom2);
					break;
				case '-':
					den = den1 * den2;
					nom = ((den / den1) * nom1) - ((den / den2) * nom2);
					break;
				case '*':
					nom = nom1 * nom2;
					den = den1 * den2;
					break;
				case '/':
					nom = nom1 * den2;
					den = nom2 * den1;
					break;
			}
			System.out.print(nom + "/" + den + " = ");
			simplification(nom, den);
		}
	}

	public static void simplification(int nom, int den) {
		if(nom > den) {
			for(int i = nom/2; i > 0; i--) {
				if(nom%i == 0 && den%i == 0) {
					System.out.println(nom/i + "/" + den/i);
					break;
				}
			}
		}else if(nom < den){
			for(int i = den/2; i > 0; i--) {
				if(nom%i == 0 && den%i == 0) {
					System.out.println(nom/i + "/" + den/i);
					break;
				}
			}
		}else {
			System.out.println(1 + "/" + 1);
		}
	}
}