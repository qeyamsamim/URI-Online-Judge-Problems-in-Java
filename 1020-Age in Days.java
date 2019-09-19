import java.util.*;

public class Main{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int year = input / 365;
		int month = (input % 365) / 30;
		int day = ((input % 365) % 30);
		
		System.out.println(year + " ano(s)");
		System.out.println(month + " mes(es)");
		System.out.println(day + " dia(s)");
	}
}