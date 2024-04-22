package persona;

public class Persona {
	
	private String nome;
	private int eta;
	private int altezza;
	
	public Persona(String nome, int eta, int altezza) {
		
		this.nome = nome;
		this.eta = eta;
		this.altezza = altezza;
	}
	
	public Persona(String nome, int altezza) {
			
			this(nome, 30 ,altezza);
			
		}
	
	public Persona(int eta) {
		
		this("Sconosciuto", eta ,179);
		
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s, eta: %d anni, altezza: $d cm", nome , eta , altezza);
		
	}
	
	public static void main(String[] args) {
		

	}

}
