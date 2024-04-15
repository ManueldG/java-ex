package giorno4;
public class Costruttore {
	
	String nome = "";
	int eta = 0;
	
	public static void Main() {
		Costruttore t = new Costruttore("Gigi",60);
		System.out.println(" età:" + t.eta + " " + " Nome:" + t.nome);
	}
	
	
	public Costruttore(String nome, int eta){
		
		this.nome = nome;
		this.eta = eta;
		
		
		
	}

}
