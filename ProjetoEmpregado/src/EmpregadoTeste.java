import java.util.Scanner;

public class EmpregadoTeste {

	public static void main(String[] args) {

		Empregado e1, e2;
		String nome;
		double salario;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Insira seu Salário: ");
		salario = Double.parseDouble(teclado.nextLine());
	
	
		e1 = new Empregado("Professor Isídro", 5000.00);
		e2 = new Empregado(nome, salario);
	
		
		System.out.println(e1.Exibir());
		System.out.println(e2.Exibir());
		
		e1.AumentarSalario(5.0);
		e2.AumentarSalario(7.0);

		System.out.println("----------- -----------");
		System.out.println(e1.Exibir());
		System.out.println(e2.Exibir());

	}

}
