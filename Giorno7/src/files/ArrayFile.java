package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArrayFile {
	
	public static void main(String[] args) throws IOException {
		
		String nomefile = "C:\\Users\\Studente4.10\\Desktop\\output.txt" ;
		String[] contenuto = {"arancia" ,"mela", "banana", "mora"};			
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(nomefile));
			String line = "";
			for(String elem : contenuto) {
				
				line += "-" + elem; 
				
			}
			br.write(line);
			
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(nomefile));
			String linea;
			 while ((linea = br.readLine()) != null) {
			
				
				System.out.println(linea);
				
				contenuto = linea.split("-");
			}
			 String tmp = "";
			 
			 for(String elem : contenuto) {
				 
				 System.out.println(elem);
				 
				 if(elem.equals("mora") )
					 tmp += "fragola" ;
				 else
					 tmp += elem + "-";
				 
			 }
			 
			 BufferedWriter b = new BufferedWriter(new FileWriter(nomefile));
			 
			 b.write(tmp);
			 System.out.println(tmp);	
			 b.close();
					
					
			} catch (IOException e) {
					
				e.printStackTrace();
				
				}
			
				

	}

}

