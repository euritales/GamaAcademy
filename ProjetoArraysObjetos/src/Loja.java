
public class Loja {

	public static void main(String[] args) {

		Produto lista[];
		
		lista = new Produto[5];
		
		lista[0] = new Produto(1, "Computador", 2500);
		lista[1] = new Produto(2, "Mouse", 80);
		lista[2] = new Produto(3, "Teclado", 300);
		lista[3] = new Produto(4, "Monitor", 1200);
		lista[4] = new Produto(5, "Impressora", 650);

	for(Produto p: lista ) {
		System.out.println(p);
	}
	}
}