package giorno4;

public class Giorno4 {
	
	String nome = "";
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	int eta = 0;

	public static void main(String[] args) {
		Giorno4 t = new Giorno4();
		System.out.println(" età:" + t.eta + " " + " Nome:" + t.nome);
		t.stampa();
		
	}
	
public Giorno4(String nome, int eta){
		
		this.nome = nome;
		this.eta = eta;	
		
	}

public Giorno4(){
	
	this.nome = "Sconosciuto";
	this.eta = 0;	
	
}

 void stampa() {
	 
	 this.setEta(60);
	 this.setNome("Gino");
	
	System.out.println(this.nome + " " + this.getEta());
}


	
	

}

