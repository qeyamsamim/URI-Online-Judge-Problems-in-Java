import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		float a = scan.nextFloat();
		
		if(a <= 25 && a >= 0){
			System.out.println("Intervalo [0,25]");
		}
		else if(a <= 50 && a > 25){
			System.out.println("Intervalo (25,50]");
		}
		else if(a <= 75 && a > 50){
			System.out.println("Intervalo (50,75]");
		}
		else if(a <= 100 && 75 < a){
			System.out.println("Intervalo (75,100]");
		}
		else{
			System.out.println("Fora de intervalo");
		}
	}
}