import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int cd = c + d;
		int ab = a + b;
		
		if(b > c && d > a && cd > ab && c > 0 && d > 0 && a % 2 == 0){
			System.out.println("Valores aceitos");
		}
		else{
			System.out.println("Valores nao aceitos");
		}
	}
}