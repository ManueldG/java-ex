package whileEs;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		//TODO fare con DO..WHILE
		Scanner x = new Scanner(System.in);
		int tot = 0;
		
		while(true) {
			
			System.out.println("Inserisci numero");
			
			int r = x.nextInt();
			
			tot += r;
			
			if ( r == 0) {
				
				System.out.println(tot);
				
				break;
			}
				
		}
		
		x.close();
	}

}
