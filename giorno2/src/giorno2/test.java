package giorno2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class test {

	public static void main(String[] args) {		 
		
		Carta[] carte = new Carta[52]; // 13 * 4
		
		List<Carta> cuori = new ArrayList<Carta>(), quadri = new ArrayList<Carta>(),fiori = new ArrayList<Carta>(),picche = new ArrayList<Carta>();		
		
		carte = deck(carte);
		carte = flush(carte);	
		
		
		for(int x = 0 ; x < carte.length ; x++) {			
			
			System.out.println( carte[x].seme + carte[x].val + " " );
			
			switch(carte[x].seme) {
				case "C":
					cuori.add(carte[x]);					
					break;
				case "Q":
					quadri.add(carte[x]);
					break;
				case "F":
					fiori.add(carte[x]);
					break;
				case "P":
					picche.add(carte[x]);
					break;
			}			
			
		}
				
		cuori = sort(cuori);
		quadri = sort(quadri);
		fiori = sort(fiori);
		picche = sort(picche);
		
		cuori.forEach((elem)->System.out.print(elem.seme + elem.val + " - " ));
		
		System.out.println();
		
		quadri.forEach((elem)->System.out.print(elem.seme + elem.val + " - " ));
		
		System.out.println();
		
		fiori.forEach((elem)->System.out.print(elem.seme + elem.val + " - " ));
		
		System.out.println();
		
		picche.forEach((elem)->System.out.print(elem.seme + elem.val + " - " ));
				System.out.println();				
		
	}
	
	
	
	private static List<Carta> sort(List<Carta> list){
		
		Collections.sort(list, new ComparatorCustom());	
		
		return list;		
	}
	
	
	
	private static Carta[] deck(Carta[] carte) {
		
		
		for(int x = 0 ; x < 52 ; x++) {
			
			
			if( x>=0 && x<13 )			
				carte[x] =  new Carta( "" + ( x + 1 ), "C");
			else if( x>=13 && x <= 25 )
				carte[x] =  new Carta( "" + ( x - 12  ), "Q");
			else if( x>=26 && x <= 38 )
				carte[x] =  new Carta( "" + ( x - 25 ), "F");
			else
				carte[x] =  new Carta( "" + ( x - 38 ), "P");
			
		}	
		
		
		
		return carte;	
	}
	
	private static Carta[] flush(Carta[] carte) {
		
		for( int x = 0 ; x < carte.length - 1 ; x++ ) {
			
			Random rand = new Random();
			int y = rand.nextInt((52 ) ) ;
			
			Carta tmp =  carte[x];
			carte[x] = carte[y];
			carte[y] = tmp;
			
		}
		
		return carte;
		
	}

}
