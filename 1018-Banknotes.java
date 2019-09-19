import java.util.*;

public class Main{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int hundred = input / 100;
		int fifty = (input % 100) / 50;
		int twenty = ((input % 100) % 50) / 20;
		int ten = (((input % 100) % 50) % 20) / 10;
		int five = ((((input % 100) % 50) % 20) % 10) / 5;
		int two = (((((input % 100) % 50) % 20) % 10) % 5) / 2;
		int one = ((((((input % 100) % 50) % 20) % 10) % 5) % 2) / 1;
		
		System.out.println(input);
		System.out.println(hundred + " nota(s) de R$ 100,00");
		System.out.println(fifty + " nota(s) de R$ 50,00");
		System.out.println(twenty + " nota(s) de R$ 20,00");
		System.out.println(ten + " nota(s) de R$ 10,00");
		System.out.println(five + " nota(s) de R$ 5,00");
		System.out.println(two + " nota(s) de R$ 2,00");
		System.out.println(one + " nota(s) de R$ 1,00");
	}
}