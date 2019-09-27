import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		
		if(a == 0 && b == 0){
			System.out.println("Origem");
		}
		else if(a > 0 && b > 0){
			System.out.println("Q1");
		}
		else if(a == 0){
			System.out.println("Eixo Y");
		}
		else if(b == 0){
			System.out.println("Eixo X");
		}
		else if(a < 0 && b > 0){
			System.out.println("Q2");
		}
		else if(a < 0 && b < 0){
			System.out.println("Q3");
		}
		else{
			System.out.println("Q4");
		}
	}
}