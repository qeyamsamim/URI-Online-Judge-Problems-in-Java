import java.util.*;

public class Main{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int hour = input / 3600;
		int minute = (input % 3600) / 60;
		int second = (input % 3600) % 60;
		
		System.out.printf("%d:%d:%d\n", hour , minute, second);
	}
}