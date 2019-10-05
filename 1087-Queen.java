import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int x1, y1, x2, y2;

		do {
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();

			if (x1 > 0) {
				if (x1 == x2 && y1 == y2) {
					System.out.println("0");
				}
				else if ((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)
						|| (x1 != x2 && y1 != y2 && x1 + y1 == x2 + y2)
						|| (x1 != x2 && y1 != y2 && x1 != y1 && x2 != y2 && x1 + y2 == x2 + y1)
						|| (x1 == y1 && x2 == y2 && x1 != x2 && y1 != y2)) {
					System.out.println("1");
				}
				else if (x1 != x2 && y1 != y2) {
					System.out.println("2");
				}
			}

		} while (!(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0));
	}
}
