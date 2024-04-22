package tre;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


//Scrivetemi un metodo  che dato un hashmap e un valore dell'hashmap
//e restituisce la chiave corrente. 
//Assumiamo per semplicità che i valori siano tutti diversi

public class Map {
	
	public static void main(String[] arg) {
		
		HashMap<String,String> tab = new HashMap<>();
		Scanner l = new Scanner(System.in);
		
		tab.put("uno","Torino");
		tab.put("due","Palermo");
		tab.put("tre","Norcia");
		tab.put("quattro","Viterbo");
		
		System.out.println( "inserisci valore da cercare" );
		String val = l.next();
		
		
		if( tab.containsValue(val) )		
			for(Entry<String, String> entry : tab.entrySet()) {
						
				if(entry.getValue().equals(val) ) {
					System.out.println( " -> " + entry.getKey());
					return;					
				}
						
			}
		else 
			System.out.println( "Non trovato!! " );
	}
	
	

}
