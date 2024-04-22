package hash;


import java.util.HashMap;

public class Occorrenze2 {
	
    public static HashMap<String, Integer> contaFrequenza(String parole){
    	
        HashMap<String, Integer> frequenza = new HashMap<>();
        
        
        
        for(int x = 0 ; x < parole.strip().length() - 1 ; x++) {
        	
        	frequenza.put(parole.split("")[x], x);
        	System.out.println();
            //frequenza.put(parola, frequenza.getOrDefault(parola, 0) + 1);
        	//frequenza.put(parola,  );
            
        }
        
        
        
        return frequenza;
        
    }


    public static void main(String[] args) {
    	
        String parole = "gsdfgdfgeregalkklkkrelkalkle";
        
        HashMap<String, Integer> fr = contaFrequenza(parole);
        
        System.out.println("Dizionario delle frequenze di una parola:\n" + fr);
                
    }
    
   }