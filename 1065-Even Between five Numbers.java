import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int a;
		int pnum = 0;
		
		for(int i = 0;i < 5;i++){
			a = scan.nextInt();
			
			if(a % 2 == 0){
				pnum += 1;
			}
		}
		System.out.printf("%d valores pares\n", pnum);
	}
}