package accenti;

import java.util.Scanner;

public class ParoleAccentate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci Parola");
		String frase = input.nextLine();
		
		System.out.println( frase.charAt(frase.length()-1));
		
		char carattere = frase.charAt(frase.length()-1);
		
		String accenti = "àèìòù";
		boolean risp = accenti.indexOf(carattere) != -1;
		
		if ( risp ){
			System.out.println("l'ultimo carattere è accentato ed è \"" + carattere + "\"");
		}
		else
			System.out.println("non ci sono caratteri accentati");
		

	}

}
