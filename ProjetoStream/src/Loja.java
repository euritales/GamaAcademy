import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Loja {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<Produto>();
		
		lista.add(new Produto(1, "Computador", 1500));
		lista.add(new Produto(2, "mouse", 80));
		lista.add(new Produto(3, "Monitor", 1000));
		lista.add(new Produto(4, "Teclado", 350));
		lista.add(new Produto(5, "Notebook", 5000));
		lista.add(new Produto(6, "Placa de Video", 1200));

		
		lista.stream().forEach((p) ->{
			System.out.println(p);
		});
		
		System.out.println("\nOrdem alfabetica\n");
				lista.stream().sorted(Comparator.comparing(p -> p.getNome())).forEach(p -> System.out.println(p));

		
		System.out.println("\nOrdem preco\n");
		lista.stream().sorted(Comparator.comparing(p -> p.getPreco())).forEach(p -> System.out.println(p));

		System.out.println("\nProduto mais caro\n");
		Produto produtoMaisCaro;
		produtoMaisCaro = lista.stream().max(Comparator.comparing(p -> p.getPreco())).orElse(null);
		
		if(produtoMaisCaro != null) {
			System.out.println("Produto mais caro: =" + produtoMaisCaro);
		}
	}

}
