package biblioteca;

public class AudioBook extends Book{
	
	Integer durata;
	
	public Integer getDurata() {
		return durata;
	}

	public void setDurata(Integer durata) {
		this.durata = durata;
	}

	public AudioBook(String titolo, String autore, Integer durata) {
		
		super(titolo, autore);
		
		this.durata = durata;
		
		
	}
	
	public String toString() {
		return super.toString() + "," + this.durata;
	}
	

		
	

	public static void main(String[] args) {
		

	}

}
