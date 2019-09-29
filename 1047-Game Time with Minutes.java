import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int h1 = scan.nextInt();
		int m1 = scan.nextInt();
		int h2 = scan.nextInt();
		int m2 = scan.nextInt();
		int h2h1 = h2 - h1;
		int m2m1 = m2 - m1;
		int h1h2 = 24 - h1 + h2;
		int m1m2 = 60 - m1 + m2;
		int c = (h2 - h1) - 1;
		int d = (24 - h1 + h2) - 1;
		
		
		if(h1 == h2 && m1 == m2){
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		else if(h1 < h2 && m2 > m1){
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h2h1, m2m1);
		}
		else if(h1 > h2 && m2 > m1){
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", h1h2, m2m1);
		}
		else if(h1 < h2 && m2 < m1){
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", c, m1m2);
		}
		else if(h1 > h2 && m2 < m1){
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", d, m1m2);
		}
	}
}