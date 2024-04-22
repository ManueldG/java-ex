package biblioteca;


public class Book implements Papers{
	
	private String titolo;
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	private String autore;
	
	public Book(String titolo, String autore) {
		this.titolo=titolo;
		this.autore=autore;
		
	}
	
	@Override
	public String toString() {
		return titolo + "," + autore;
	}
	
	

}