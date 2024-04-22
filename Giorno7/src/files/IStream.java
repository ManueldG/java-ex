package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IStream {

	public static void main(String[] args) throws IOException {
		
		String nomefile = "C:\\Users\\Studente4.10\\Desktop\\output.txt" ;
		String contenuto = "Ciao nnnnnnn" ;	
		
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(nomefile));
			String linea;
			 while ((linea = br.readLine()) != null) {
			
				
				System.out.println(linea);
				contenuto = contenuto +"\n" + linea;
			}
			
			br.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(nomefile));
			br.write(contenuto);
			
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
