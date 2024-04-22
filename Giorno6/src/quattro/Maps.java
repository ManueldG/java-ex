package quattro;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Arrays;

/*
 * array stringhe restituisce numero parole nell'array
 * getOrDefault 
 */

public class Maps {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap();
		String[] list = {"uno","due","tre","tre","cinque","due","uno","due","uno"} ;
		Integer[] occ = new Integer[10];
		
		for(int x = 0 ; x < occ.length - 1; x++)
			occ[x] = 0;
		
		
		for (int x=0 ; x<list.length ; x++) {
			for(int y=0 ; y<list.length ; y++) {
				if(list[x]==list[y])
					occ[x]++; 
			}
		}
		
		System.out.println(Arrays(occ));
		
		
			

	}

	private static char[] Arrays(Integer[] occ) {
		// TODO Auto-generated method stub
		return null;
	}
}
