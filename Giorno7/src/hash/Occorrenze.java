package hash;


import java.util.HashMap;

public class Occorrenze {
	
    public static HashMap<String, Integer> contaFrequenza(String[] parole){
    	
        HashMap<String, Integer> frequenza = new HashMap<>();
        
        for(String parola : parole) {
        	
            frequenza.put(parola, frequenza.getOrDefault(parola, 0) + 1);
            
        }
        
        return frequenza;
        
    }


    public static void main(String[] args) {
    	
        String[] parole = {"banana", "banana", "arancia", "mela", "mela", "banana", "banana"};
        
        HashMap<String, Integer> fr = contaFrequenza(parole);
        
        System.out.println("Dizionario delle frequenze di una parola:\n" + fr);
                
    }
    
   }