package giorno2;

import java.util.Comparator;
import java.util.List;


class ComparatorCustom implements Comparator<Carta>{
	
	public int compare(Carta a, Carta b){
		
		Integer s1 = Integer.valueOf(a.val);
		Integer s2 = Integer.valueOf(b.val);
		
		return (s1.compareTo(s2)) ;
	}

	

	
		
}