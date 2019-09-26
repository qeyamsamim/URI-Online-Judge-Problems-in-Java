import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		float d = scan.nextFloat();
		
		float average = ((a*2) + (b*3) + (c*4) + (d*1)) / 10;
		System.out.printf("Media: %.1f\n", average);
		
		if(average >= 7){
			System.out.println("Aluno aprovado.");
		}
		else if(average < 5){
			System.out.println("Aluno reprovado.");
		}
		else if(5 <= average && average <= 6.9){
			System.out.println("Aluno em exame.");
			
			float e = scan.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", e);
			float sum = (average+e)/2;
				
			if(sum >= 5){
				System.out.println("Aluno aprovado.");
			}
			if (sum <= 4.9){
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", sum);
		}	
	}
}