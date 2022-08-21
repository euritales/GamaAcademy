package app;

import model.Conta;
import model.ContaEspecial;

public class PIBank {

	public static void main(String[] args) {

		Conta c1 = new Conta("Isídro", "123.456.789-00", 3526, 100.00);
		Conta c2 = new ContaEspecial("Julio", "987.654.321-00", 2622, 100.00, 100.00);
		
		c1.debitar(80);
		c2.debitar(180);
		System.out.println(c1);
		System.out.println(c2);
	}

}
