package eccezioni;

import java.util.Scanner;

public class Eccezioni {

	public static void main(String[] args) {
		
		int y = 0;
		
		Scanner l = new Scanner(System.in);
		
		y = l.nextInt();
		
		int x = 0;
		
		try {
			x = 10 / y ;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println(x);

	}

}
