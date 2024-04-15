package switchN;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {	
			
				
					
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				
				Calc c = new Calc();
		    
			    while(true) {
					    System.out.println("prego scegliere numero lati ");
					
					    int n = scanner.nextInt();
					    
				
					    switch(n) {
						    case 3:
						        System.out.println("Area triangolo");
						        System.out.println("inserisci altezza");
						        int h = scanner.nextInt();
						        System.out.println("inserisci base");
						        int b = scanner.nextInt();
						        System.out.println("risultato " + c.area(h, b, n) );
						        break;
						    
						    case 4:
						    	System.out.println("Area rettangolo");
						        System.out.println("inserisci altezza");
						        int hr = scanner.nextInt();
						        System.out.println("inserisci base");
						        int br = scanner.nextInt();
						        System.out.println("risultato " + c.area(hr,br));
						        break;
						    case 0:
						    	System.out.println("Fine!!");
						    	return;					
						        
						    default:
						    	
						    	System.out.println("Area poligono");
						        
						        System.out.println("inserisci misura lato");
						        
						        int l = scanner.nextInt();
						        
						        System.out.printf("risultato %5.2f%n", c.poligono(l,n));
						        
						        break;	    
				    	}
		    		}
		    }
	
			
}


