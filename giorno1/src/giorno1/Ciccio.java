package giorno1;

import java.util.Arrays;

public class Ciccio {

	public static void main(String[] args) {
		
		int[] x = {3,6,4,9,2,6,8,6,4,7};
		int[] pari = new int[11];
		int[] dispari = new int[11];
		int cont1 = 0;
		int cont2 = 0;
		
		for(int i = 0 ; i < x.length ; i++) {
			
			if( x[i] % 2 == 0 ) {
				System.out.println(x[i] + " è paro.");
				pari[cont1] = x[i];
				cont1++;
			}
			else
			{
				System.out.println(x[i] + " è disparo.");
				dispari[cont2] = x[i];
				cont2++;
			}
			
		}
	
		System.out.println(Arrays.toString(pari));
		System.out.println(Arrays.toString(dispari));
			
			
		

	}

}
