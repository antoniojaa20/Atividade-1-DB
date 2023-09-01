package exercicio_fixacao_1_BD;

import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaTextoCSV {
	public static void main(String[] args) throws IOException {
		String csvFile = "data.csv";
		String delimiter = ",";
		
		 try (FileWriter writer = new FileWriter(csvFile)) {	 
			 writer.append("Isabelly");
	         writer.append(delimiter);
	         writer.append("20");
	         
	         System.out.println("Arquivo CSV criado com sucesso!");
		 }
		 
		 catch (IOException e) {
			 e.printStackTrace();
		 }
	}
}
