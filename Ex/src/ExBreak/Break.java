package ExBreak;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
		Scanner lettori = new Scanner(System.in);
		
		
		
		while(true) {
			
			System.out.println("Inserici numero:");
			int n = lettori.nextInt();
			
			if( n % 100 == 0 ){
				System.out.println("divisibile per 100");
				break;
			}
			
			else if( n % 4 == 0) {
				 System.out.println("divisibile per 4");
				 continue;
			 }
			
			else if( n % 2 == 0 ) {
				System.out.println("divisibile per 2");
				continue;
			}
			
			else if( n % 3 == 0 ) {
				System.out.println("divisibile per 3");
				break;
			}
			
			
			
		}
		
		
		
			

	}

}
