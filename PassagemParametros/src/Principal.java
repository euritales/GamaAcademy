import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Criando Variaveis
		
		String Nome,Email;
		int Idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		Nome = teclado.nextLine();
		System.out.println("");
		System.out.println("Digite seu email: ");
		Email = teclado.nextLine();
		System.out.println("");
		System.out.println("Digite sua idade: ");
		Idade = teclado.nextInt();
		
		
		MandaMensagem executar = new MandaMensagem();
		executar.Mensagem(Nome, Email, Idade);
	}

}
