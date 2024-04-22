package due;

import java.security.KeyStore.Entry;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Dizionari {	
	
	public static void main(String[] args) {
		Hashtable<Integer,String> n = new Hashtable<>();
		
		n.put(1, "uno");
		n.put(2, "due");
		n.put(3, "tre");
		n.put(4, "quattro");
		
		System.out.println("Il valore n è " + n.get(1)); 
		n.remove(1);
		
		for(Map.Entry<Integer, String> entry : n.entrySet()) {
			
			System.out.println(entry.getValue() + " : " + entry.getKey());
			
		}	
		
	}
	
}
