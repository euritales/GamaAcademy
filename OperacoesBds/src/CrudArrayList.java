import java.util.ArrayList;

public class CrudArrayList {

	public static void main(String[] args) {

		//Criando procedimento de inser��o ed registros com ArryaList

		ArrayList<String> marcas = new ArrayList<String>();
		
		marcas.add("BMW");
		marcas.add("Chevrolet");
		marcas.add("Ford");
		marcas.add("FIAT");
		//alterando valor de marcar[2]
		marcas.set(2, "Volkswagem");
		
		//removendo
		marcas.remove(0);
		
		//sysout por item.
		System.out.println(marcas.get(2));
		System.out.println(marcas);

		for(String marca: marcas) {
			System.out.println(marca);
		}
		
	}

}
