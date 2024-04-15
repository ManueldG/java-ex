package ApprCycle;

import java.util.Scanner;

public class Cycle {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		print("Numero righe\n");
		
		int row = l.nextInt();
		
		String space = " ";
		
		for(int i = 0 ; i <= ( row * 2); i++)
			space = space + " ";
		
		for( int y = 0 ; y <= row ; y++) { 			
			
			space = space.substring( 0 ,   space.length() - 1 * y);
			
			print(space);
			
			for( int x = 0 ; x <= y ; x++) {
			
				print("x");
			
			}
			
			print("\n");
		}

	}
	
	static void print(Object elem) {
		System.out.print(elem);
	}

}
