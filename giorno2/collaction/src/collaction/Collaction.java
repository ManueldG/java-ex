package collaction;

import java.util.*;
import java.util.Arrays;

public class Collaction {

	public static void main(String[] args) {
		
		//dato un'array vuoto di stringhe che rappresenta un campionato di calcio(nell'array ci staranno le squadre che partecipano) chiedete di settare la lunghezza dell'array del campionato e poi inserite in nomi della squadre del campionato con un ciclo for nell'array.
		//poi mi stampate con un for each le squadre del campionato
		
		
		String x = """
				fsdfsdf
				   sdfasdf
						sdfsdaf
						%s
				sdfsdfsd
				""";
		
		System.out.printf(x,"ddddd");
		String[] campionato = new String[100];
		
		System.out.println("Inserire numero di squadre:");
		
		Scanner nSquadre = new Scanner(System.in);
		
		int numSquadre = nSquadre.nextInt();
		
		nSquadre.nextLine();
		
		
		for(int n = 0 ; n <= numSquadre ; n++) {
			
			System.out.println("Squadre:\n");
						
			String squadre = nSquadre.nextLine();
			
			campionato[n] = squadre;
						
		}
		
		for(String c : campionato)
			System.out.print(c!=null ? c + "\n" : "");
				
		nSquadre.close();
		
		

	}

}
