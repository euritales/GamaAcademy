import java.util.Scanner;

public class ProcessaCalculos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		

		String texto, strConvert;
		int valor1;
		float valor2;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o primeiro valor");
		strConvert = teclado.nextLine();
		valor1 = Integer.parseInt(strConvert);
		System.out.println("Insira o segundo valor");
		strConvert = teclado.nextLine();
		valor2 = Integer.parseInt(strConvert);
		System.out.println("Na moral, deixa uma palinha:");
		texto = teclado.nextLine();
		System.out.println("A soma é: " + (valor1 + valor2));
		System.out.println("Seu texto: " + texto);
		teclado.close();
		
	}

}
