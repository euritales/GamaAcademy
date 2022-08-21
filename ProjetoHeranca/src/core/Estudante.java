package core;

public class Estudante extends Pessoa{
	
	private int numeroMatricula;
	private String curso;
	
	public Estudante(String nome, String email, String telefone, int numeroMatricula, String curso)  {
		super(nome, email, telefone);
		this.numeroMatricula = numeroMatricula;
		this.curso = curso;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		curso = curso;
	}
	
	public String exibirInfo() {
		return super.nome+"/ " + super.email + "/ " +  super.telefone + "/ " + getNumeroMatricula() + "/ " + getCurso();
	}
	
	
}
	