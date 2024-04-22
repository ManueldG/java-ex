package uno;


	abstract class Automobile {		

		protected String marca;
		
		protected String modello;
		
		protected String targa;
		
		private int passeggeri;
		
		protected int anno;
		
		protected int annoImmatricolazione;
		
		protected int potenza;
		
		protected static int coefficente;
		
		
		
		// COSTRUTTORE
		//public Automobile(String marca, String modello, String targa, int passeggeri, int anno, int potenza) {
		public Automobile(String marca, String modello, String targa) {
			this.marca = marca;
			this.modello = modello;
			this.targa = targa;
			this.passeggeri = passeggeri;
			this.anno = anno;
			this.potenza = potenza;
			
		}


		// GETTERS 
		public String getMarca() {
			return marca;
		}


		public String getModello() {
			return modello;
		}
		
		
		public String getTarga() {
			return targa;
		}
		
		
		public int getPasseggeri() {
			return passeggeri;
		}

		
		public int getAnno() {
			return anno;
		}
		
		
		public int getAnnoImmatricolazione() {
			return annoImmatricolazione;
		}
		
		
		public int getPotenza() {
			return potenza;
		}


		// SETTERS
		public void setMarca(String marca) {
			this.marca = marca;
		}


		public void setModello(String modello) {
			this.modello = modello;
		}


		public void setTarga(String targa) {
			this.targa = targa;
		}


		public void setPasseggeri(int passeggeri) {
			this.passeggeri = passeggeri;
		}


		public void setAnno(int anno) {
			this.anno = anno;
		}
		
		
		public void setAnnoImmatricolazione(int annoImmatricolazione) {
			this.annoImmatricolazione = annoImmatricolazione;
		}
		

		public void setPotenza(int potenza) {
			this.potenza = potenza;
		}
		
		
		// METODI
		
		public abstract float tassa(int anno);
		
		public abstract float autonomia();
		
		@Override		
		public String toString() {
			return this.marca + " " + this.modello + " " + this.targa;			
		}
			
		
	}



