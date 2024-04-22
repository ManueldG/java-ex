package uno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Autonoleggio {
	
	protected List<Auto> autoDisponibili = new ArrayList<Auto>();
	
	public Autonoleggio() {		
		
	}	
	
	public static void main(String[] args) {	
		
		Scanner l = new  Scanner(System.in);
		Autonoleggio gg = new Autonoleggio();
		
		
		while(true) {
			
			System.out.println(" inserisci marca");
			String marc = l.nextLine();
			System.out.println(" inserisci modello");
			String mod = l.nextLine();
			System.out.println(" inserisci targa");
			String tar = l.nextLine();
			
			Auto a = new Auto(marc,mod,tar); 
			gg.setAutoDisponibili(a);
			//gg.autoDisponibili.add(a);
			
		}
	}

	public List<Auto> getAutoDisponibili() {
		return autoDisponibili;
	}

	public List<Auto> setAutoDisponibili(Auto autoDisponibili) {
		List<Auto> tmp = new ArrayList<Auto>();
		tmp.add(autoDisponibili) ;
		return tmp ;
	}
	
	public void stampaLista(ArrayList<Automobile> auto) {
		for(Automobile a : auto) {
			System.out.println(a.getMarca() + " " + a.getModello() + " " + a.getTarga());
		}
	}

}
