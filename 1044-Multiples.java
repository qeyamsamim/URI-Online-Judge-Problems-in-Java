import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a > b && a % b == 0){		
			System.out.println("Sao Multiplos");
		}else if(a < b && b % a == 0){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
		}
	}	
}