package giorno4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spread {
	
	List<Integer> num = new ArrayList<>();		
	List<Integer> pari = new ArrayList<Integer>();
	List<Integer> dispari = new ArrayList<Integer>();
	
	public  Spread(int...elem) {
		
		List<Integer> numeri = new ArrayList<>();
		
		for(Integer e : elem)
			numeri.add(Integer.valueOf(e));
		
		this.num = numeri;
		
	}

	public static void main(String[] args) {		
		
		Scanner l = new Scanner(System.in);
		Integer n = -1;		
		
		Spread s = new Spread(2,4,6,7,8,9,3,4,5,56,76,45,78,676,0);
				
		
		for(Integer x : s.num)				 
				System.out.println(x);	
		 
		 s.sel(s.num);	
		 
		 for(Integer x : s.dispari) 			 
				System.out.println("dispari " + x);
		 
		 for(Integer x : s.pari) 			 
				System.out.println("pari" + x);		 
		
		 l.close();
	}
	
	private void sel(List<Integer> num) {
		
		for(Integer x : num) {
			if(x%2 != 0)
				this.dispari.add(x);
			else
				this.pari.add(x);
				
		}		
		
	}

}



