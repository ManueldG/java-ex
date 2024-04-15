package Ex;
	
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Scanner;
	import java.util.regex.MatchResult;
	import java.util.stream.*;
	

	public class Ex1 {

	    public static void main(String... args) {
	    	
	        String wordsAndNumbers = "Longing rusted furnace daybreak 17 benign 9 homecoming 1 freight car ";
	        
	        Collection<String> lista = new ArrayList<String>();
	        
	        lista.add("text2");	 
	        lista.add("text1");	
	        
	        lista.iterator().forEachRemaining(elem -> System.out.println(elem));
	        lista.stream().forEach( elem -> System.out.println(elem));
	        	        
	        List<String> listaS = new ArrayList<String>();
	        
	        listaS.add(0, "ciao");
	        
	        System.out.println(listaS.toString());
	        
	        try (Scanner scanner = new Scanner(wordsAndNumbers)) {
	            System.out.println(scanner.toString());
	            
	        }
	        
	      
	        
	        //System.out.print(occorrenze( wordsAndNumbers , "7"));
	    }
	        
	        static int occorrenze(String st,String s1){
	        	
	    		int sum=0,i=0,x;
	    		
	    		do{
	    		      x=st.indexOf(s1,i);
	    		      System.out.println(x);
	    		      
	    		      if(x!=-1){ 
	    		    	  sum++; 
	    		    	  i=x+1; 
	    		    	  }
	    		      
	    		      
	    		}
	    		while(x!=-1);
	    		
	    		return sum;
	    		}//fine occorrenza
	    
	


}
