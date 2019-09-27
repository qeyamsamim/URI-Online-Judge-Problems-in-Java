import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String startDay = scan.next();
		int day1 = scan.nextInt();
		
		int hour1 = scan.nextInt();
		char colon = scan.next().charAt(0);
		int min1 = scan.nextInt();
		char colon1 = scan.next().charAt(0);
		int sec1 = scan.nextInt();
		
		String endDay = scan.next();
		int day2 = scan.nextInt();
		
		int hour2 = scan.nextInt();
		char colon2 = scan.next().charAt(0);
		int min2 = scan.nextInt();
		char colon3 = scan.next().charAt(0);
		int sec2 = scan.nextInt();
		
		if(hour2 < hour1) {		
			System.out.println(((day2 - day1) - 1) + " dia(s)");
			hourDiff(hour1, hour2, min1, min2);
			minuteDiff(min1, min2, sec1, sec2);
			secDiff(sec1, sec2);
		}else {
			System.out.println((day2 - day1) + " dia(s)");
			hourDiff(hour1, hour2, min1, min2);
			minuteDiff(min1, min2, sec1, sec2);
			secDiff(sec1, sec2);
		}
	}

	private static void hourDiff(int hour1, int hour2, int min1, int min2) {
		if(hour2 < hour1) {
			if(min2 > min1) {
				System.out.println((24 - hour1) + hour2 + " hora(s)");
			}else {
				System.out.println((23 - hour1) + hour2 + " hora(s)");
			}
		}else {
			if(min2 > min1) {
				System.out.println((hour2 - hour1 - 1) + " hora(s)");
			}else {
				System.out.println((hour2 - hour1) + " hora(s)");
			}
		}
	}

	private static void minuteDiff(int min1, int min2, int sec1, int sec2) {
		if(min1 > min2) {
			if(sec2 < sec1) {
				System.out.println((59 - min1) + min2 + " minuto(s)");
			}else {
				System.out.println((60 - min1) + min2 + " minuto(s)");
			}
		}else {
			if(sec2 < sec1) {
				System.out.println((min2 - min1 - 1) + " minuto(s)");
			}else {
				System.out.println((min2 - min1) + " minuto(s)");
			}
		}
	}
	
	private static void secDiff(int sec1, int sec2) {
		if(sec1 > sec2) {
			System.out.println((60 - sec1) + sec2 + " segundo(s)");
		}else {
			System.out.println((sec2 - sec1) + " segundo(s)");
		}
	}
}