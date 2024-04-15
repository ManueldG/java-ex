package whileex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		/* ciclo while do while paro -> array disparo -> dispari
		 * se 0 esce
		 * 
		 * 
		 * ciclo do while stringhe che ristamperà come singoli caratteri stringa stop per terminare ciclo charat() e equalsIgnoreCase()*/
		
		Scanner l = new Scanner(System.in);
		Integer n = -1;
		
		Integer[] pari = new Integer[100];
		Integer[] dispari = new Integer[100];
		
		int p = 0;
		int d = 0;
		
		 do {
			 
			 System.out.println("Inserisci numero");
			 n = l.nextInt();
			 //Leggo numero
			 
			 //scelta condizionale se divisibile per 2 lo assegno in array "pari" posizione p
			 if(n%2 == 0) {
				 //pari[p] = n;
				 //p++;
				 addArray(pari,n);
			 }//altrimenti lo assegno in array "dispari" posizione d
			 else {
				 addArray(dispari,n);
				 //dispari[d] = n;
				 //d++;
			 }
			 
			 			 
			 
		 }while(n != 0);
		 
		 System.out.println(Arrays.toString(pari));
		 System.out.println(Arrays.toString(dispari));
		 l.close();
		 

	}
	
	static private Integer[] addArray(Integer[] pa, int n){
		
		int i=0;
		
		while(true) {
			if( Objects.isNull(pa[i]) ) {
				
				pa[i] = n;
				
				break;
				
			}else 
				i++;
		}
		
		 return pa;
	 }

}
