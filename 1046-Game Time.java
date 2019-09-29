import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a == b){
			System.out.print("O JOGO DUROU ");
			System.out.println(24 + " HORA(S)");
		}
		else if(a > b){
			System.out.print("O JOGO DUROU ");
			System.out.println(24 - (a - b) + " HORA(S)");
		}
		else if(a < b){
			System.out.print("O JOGO DUROU ");
			System.out.println(b - a + " HORA(S)");
		}
	}
}