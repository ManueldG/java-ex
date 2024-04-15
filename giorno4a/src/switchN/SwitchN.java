package switchN;



import java.util.Scanner;

public class SwitchN{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

    
	    while(true) {
			    System.out.println("prego inserire numeri da 1 a 12 per ricevere come risposta la stagione corrente, premi qualunque altro tasto per uscire ");
			
			    int N= scanner.nextInt();
		
			    switch(N) {
				    case 12, 1 , 2 ,3:
				        System.out.println("è inverno");
				         break;
				    case 4,5,6:
				        System.out.println("è primavera");
				        break;
				    case 7,8,9:
				        System.out.println("è estate");
				        break;
				    case 10,11:
				        System.out.println("è autunno");
				        break;
				
				        
				    default:
				        System.out.println("grazie e arrivederci");
				        scanner.close();
				        return;			    
		    	}
    		}
    }
}
