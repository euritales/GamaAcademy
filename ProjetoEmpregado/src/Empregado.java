
public class Empregado {

	private String nome;
	private double salario;
	
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String Exibir() {
		return "Nome: " + this.nome + "\nR$ " + this.salario;
	}
	
	public void AumentarSalario(double percentual) {
		this.salario += this.salario * percentual / 100;
	}
	
}
