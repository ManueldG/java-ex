package DoWhileEx2;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		
		//leggo stringa in ingresso
		Scanner l = new Scanner(System.in);
		String s = "";
		
		
		 do {
			 // ciclo per la lunghezza della stringa 
			 for(int i = 0; i <= s.length() - 1 ; i++)
				 System.out.println(s.charAt(i));
			 
			 //e stampo il singolo carattere
			 System.out.println("Stringa");
			 s = l.nextLine();
			 
			 //se inserisco "stop" esce
		 }while(!s.equalsIgnoreCase("stop"));
		 
		 System.out.println("Fine");
		 l.close();		 

	}

}
