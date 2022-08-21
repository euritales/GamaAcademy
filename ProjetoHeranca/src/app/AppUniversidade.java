package app;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Isídro", "isidro.teste@teste.com", "00123456789");
		
		System.out.println(p.exibirInfo());
		
		Estudante e = new Estudante("aluno@fauldade.com","Jose", "12345612300", 12354894,"Estudante");
		System.out.println(e.exibirInfo());
		
	}

}
