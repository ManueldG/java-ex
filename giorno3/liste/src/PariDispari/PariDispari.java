package PariDispari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PariDispari {

	public static void main(String[] args) {
		
		/* ciclo while do while paro -> array disparo -> dispari
		 * se 0 esce
		 * 
		 * 
		 * ciclo do while stringhe che ristamperà come singoli caratteri stringa stop per terminare ciclo charat() e equalsIgnoreCase()*/
		
		Scanner l = new Scanner(System.in);
		Integer n = -1;
		
		List<Integer> pari = new ArrayList<Integer>();
		List<Integer> dispari = new ArrayList<Integer>();
		
		 do {
			 
			 System.out.println("Inserisci numero");			 
			 n = l.nextInt();
			 //Leggo numero
			 
			 //scelta condizionale se divisibile per 2 lo assegno in array "pari" posizione p
			 if(n%2 == 0) {
				 
				 pari.add(n);
				 
			 }//altrimenti lo assegno in array "dispari" posizione d
			 else {
				 
				 dispari.add(n);			 
				 
			 }			 			 
			 
		 }while(n != 0);
		 
		 for(int elem : pari)
			 System.out.print(elem + " ");
		 
		 System.out.println("\n");
		 
		 for(int elem : dispari)
			 System.out.print(elem + " ");
		 
		 l.close();		 

	}

}