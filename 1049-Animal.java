import java.util.*;

public class Main {
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		String fw = scan.next();
		String sw = scan.next();
		String tw = scan.next();
		
		if(fw.equals("vertebrado") && sw.equals("ave") && tw.equals("carnivoro")){
			System.out.println("aguia");
		}
		else if(fw.equals("vertebrado") && sw.equals("ave") && tw.equals("onivoro")){
			System.out.println("pomba");
		}
		else if(fw.equals("vertebrado") && sw.equals("mamifero") && tw.equals("onivoro")){
			System.out.println("homem");
		}
		else if(fw.equals("vertebrado") && sw.equals("mamifero") && tw.equals("herbivoro")){
			System.out.println("vaca");
		}
		else if(fw.equals("invertebrado") && sw.equals("inseto") && tw.equals("hematofago")){
			System.out.println("pulga");
		}
		else if(fw.equals("invertebrado") && sw.equals("inseto") && tw.equals("herbivoro")){
			System.out.println("lagarta");
		}
		else if(fw.equals("invertebrado") && sw.equals("anelideo") && tw.equals("hematofago")){
			System.out.println("sanguessuga");
		}
		else if(fw.equals("invertebrado") && sw.equals("anelideo") && tw.equals("onivoro")){
			System.out.println("minhoca");
		}
	}
}

