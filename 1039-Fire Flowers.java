import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int r1 = scan.nextInt();
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			
			int r2 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			
			double d = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			
			if((r1 - d) >=r2) {
				System.out.println("RICO");
			}else {
				System.out.println("MORTO");
			}
		}
	}
}