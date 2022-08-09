import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeraArquivo {

	public static void main(String[] args) throws IOException {
		ArrayList<String> clientes = new ArrayList<String>();
		
		clientes.add("Matheus");
		clientes.add("Joao");
		clientes.add("Bloca");
		clientes.add("Davi");
	
		FileWriter arquivo = new FileWriter("C:\\Users\\Atlas\\Documents\\clientes.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		for(String cliente: clientes) {
			gravarArquivo.println(cliente);
		}
		arquivo.close();
		System.out.println("Criacao de arquivo no c:\\clientes.txt");
		
	}
	
}
