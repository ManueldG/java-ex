package tre;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Mappa<K,V> {
	
	public K cerca(HashMap<K,V> map , V val) {
		
		if( map.containsValue(val) )	
			for(Entry<K, V> elem : map.entrySet()) {
				if(elem.getValue().equals(val)) {
					
					return elem.getKey();
					
				}
					
			}
		return null;
		
		
		}

	public static void main(String[] args) {
		
		HashMap<String,String> tab = new HashMap<>();
		Scanner l = new Scanner(System.in);
		
		tab.put("uno","Torino");
		tab.put("due","Palermo");
		tab.put("tre","Norcia");
		tab.put("quattro","Viterbo");
		
		tab.forEach((key, value) -> {

		     System.out.println(key + " " + value);
	    });
		
		System.out.println( "inserisci valore da cercare" );
		
		
		
		String val = l.next();
		
		Mappa m = new Mappa();
		System.out.print(m.cerca(tab, val)!=null ? "->" + m.cerca(tab, val) : "non trovato");
		

	}

}
