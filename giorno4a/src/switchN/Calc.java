package switchN;

public class Calc {
	
public int area(int h, int b, int l) {
		
		return ((h*b)/2);
	}
	
public int area(int h, int b) {
			
			return (h*b);
		}

public double poligono(int l, int n) {
		
		double tan =   Math.tan(Math.PI/n);
		
		double a = l /(2 * tan);
		
		return ( ((n*l) * a)/2 );
	}


}
