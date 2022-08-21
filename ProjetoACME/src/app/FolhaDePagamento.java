package app;

import model.Funcionario;
import model.Comissionado;
import model.Chefe;
import model.Empreiteiro;
import model.Horista;


public class FolhaDePagamento {

	public static void main(String[] args) {

		Funcionario f1, f2, f3, f4;
		
		f1 = new Chefe(0001,"Chefe Jonas", 5000.0, 15.0, 500);
		f2 = new Comissionado(0002, "Ana Comissionada", 4000, 35);
		f3 = new Horista(0003, "Silvia Designer", 80, 150);
		f4 = new Empreiteiro(0004, "Bob Construtor", 5862.80);
		
		System.out.println(f1.getNumRegistro() + " - " + f1.getNome() + " R$" + f1.calcularSalario());
		System.out.println(f2.getNumRegistro() + " - " + f2.getNome() + " R$" + f2.calcularSalario());
		System.out.println(f3.getNumRegistro() + " - " + f3.getNome() + " R$" + f3.calcularSalario());
		System.out.println(f4.getNumRegistro() + " - " + f4.getNome() + " R$" + f4.calcularSalario());

		
	}

}
