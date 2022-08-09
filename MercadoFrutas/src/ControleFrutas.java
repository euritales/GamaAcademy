import java.util.ArrayList;
import java.util.Scanner;

public class ControleFrutas {

	public static void main(String[] args) {

		ArrayList<String> frutas = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoFruta = new Scanner(System.in);

		String  fruta;
		int escolha = 1;
		int opcao = 0;
		
		while(escolha != 0) {
			System.out.println("");
			System.out.println("Escolha uma opcao: 1 - Cadastrar; 2 - Listar; 3 - Excluir; 4 - Listar Frutas com ID; 5 - Modificar fruta; 0 - Sair;");
			escolha = teclado.nextInt();
			 switch (escolha) {
				 case 0:
				     System.out.println("0 - Saindo da Aplicacao.");
					 return;
			     case 1:
				     System.out.println("1 - Cadastrando Fruta:");
				     fruta = tecladoFruta.nextLine();
				     frutas.add(fruta);
				     break;
			     case 2:
				     System.out.println("2 -Lista de frutas:");
				     for(String lista: frutas) {
				    	 System.out.println(lista);
				     };
				     break;
			     case 3:
				     System.out.println("3 -Excluir.");
				     opcao = teclado.nextInt();
				     frutas.remove(opcao);
				     break;
			     case 4:
				     System.out.println("4 -Listar Frutas com ID.");
				     opcao = teclado.nextInt();
				     System.out.println(frutas.get(opcao));
				     break;
			     case 5:
				     System.out.println("5 - Modificar fruta:");
				     opcao = teclado.nextInt();
				     System.out.println("Insira nova fruta");
				     fruta = tecladoFruta.nextLine();
				     frutas.set(opcao, fruta);
				     break;
				 default:
				     System.out.println("O número inválido! Digite um número entre 0 a 5 .");
			 }
	 }
	}
}
