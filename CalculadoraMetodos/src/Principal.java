import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double num1, num2;
		Scanner teclado = new Scanner(System.in);
		int opcao = 9;

		System.out.println("Insira um numero: ");
		num1 = teclado.nextDouble();
		System.out.println("Insira outro numero: ");
		num2 = teclado.nextDouble();
		
		Somar soma = new Somar();
		Subtrair subtracao = new Subtrair();
		Multiplicar multiplicacao = new Multiplicar();
		Dividir divisao = new Dividir();
		
		
		while(opcao != 0) {
			System.out.println("Escolha a Operacao desejada: 1 - Adicao; 2 - Subtracao; 3 - Multiplicacao; 4 - Divisao;");
			opcao = teclado.nextInt(); 
			switch(opcao){
				case 0:
					System.out.println("0 - Saindo da Aplicacao.");
					return;
				case 1:
					System.out.println("Adicao:");
					soma.Calculo(num1, num2);
					break;
				case 2:
					System.out.println("Subtracao:");
					subtracao.Calculo(num1, num2);
					break;
				case 3:
					System.out.println("Multiplicacao:");
					multiplicacao.Calculo(num1, num2);
					break;
				case 4:
					System.out.println("Divisao:");
					divisao.Calculo(num1, num2);
					break;
				default:
					System.out.println("Opcao invalida!");
			}
		}
		
		
		
		
	}

}
