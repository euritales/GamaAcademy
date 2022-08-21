package app;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("Teste");
		p.setEmail("teste@teste.com");
		p.setTelefone("71912345678");

		System.out.println(p.Exibir());
		
		Estudante e = new Estudante();
		e.setEmail("aluno@fauldade.com");
		e.setNome("Estudante");
		e.setTelefone("1235678921");
		e.setCurso("Odonto");
		e.setNumeroMatricula(201720012);
		System.out.println(e.exibirInfo());
		
		
	}

}
