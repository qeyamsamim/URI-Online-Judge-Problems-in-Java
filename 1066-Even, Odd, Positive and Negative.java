import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int a;
		int num = 0;
		int nenum = 0;
		int evnum = 0;
		int odnum = 0;
		
		for(int i = 0;i < 5;i++){
			
			a = scan.nextInt();
			
			if(a > 0){
				num += 1;
			}
			if(a < 0){
				nenum += 1;
			}
			if(a % 2 == 0){
				evnum += 1;
			}
			if(a % 2 != 0){
				odnum += 1;
			}
		}
		System.out.printf("%d valor(es) par(es)\n", evnum);
		System.out.printf("%d valor(es) impar(es)\n", odnum);
		System.out.printf("%d valor(es) positivo(s)\n", num);
		System.out.printf("%d valor(es) negativo(s)\n", nenum);
	}
}