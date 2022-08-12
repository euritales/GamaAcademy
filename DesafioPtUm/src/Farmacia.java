import java.util.Scanner;

public class Farmacia {
	
//	REQUISITOS
//		a. Cadastro de clientes : 
//		b. Listagem de clientes :
//		c. Atualização de clientes :
//		d. Deletar clientes :
//		e. Histórico de transações entre contas: 
//		f. Controle de estoque :
//		g. Medicamentos genéricos contêm 20% de desconto.:
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bem Vindo(a) ao Sistema da Farmacia Pague Mais Barato Ainda\n");
		
		while(opcao != 0) {
			System.out.println("Escolha a Operacao desejada:"
			+ "1 - Cliente;\r\n"
			+ "2 - Estoque\r\n"
			+ "");
			opcao = teclado.nextInt(); 
			
			switch(opcao){
				case 0:
					System.out.println("0 - Saindo da Aplicacao.");
					return;
				case 1:
					System.out.println("- Clientes -");
					System.out.println(
						"\n1 - Cadastro de clientes\r\n"
						+ "2 - Listagem de clientes\r\n"
						+ "3 - Atualização de clientes\r\n"
						+ "4 - Deletar cliente\r\n");
					opcao = teclado.nextInt(); 
					break;
				case 2:
					System.out.println("- Estoque -");
					System.out.println(
							"\n1 - Cadastro de remedios\r\n"
							+ "2 - Listagem de remedios\r\n"
							+ "3 - Atualização de remedios\r\n"
							+ "4 - Deletar remedio\r\n");
					break;

				default:
					System.out.println("Opcao invalida!");
			}
		
		}
		
	}

}
