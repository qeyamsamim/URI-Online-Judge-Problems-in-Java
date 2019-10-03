import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int array[] = new int[num];
		int tmp = 0;
		int position = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
			if(array[i] < tmp) {
				tmp = array[i];
				position = i;
			}
		}
		System.out.println("Menor valor: " + tmp);
		System.out.println("Posicao: " + position);
	}
}