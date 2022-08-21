package core;

public class Estudante extends Pessoa{
	
	private int numeroMatricula;
	private String Curso;
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	}
	
	public String exibirInfo() {
		return getNome()+"/ " + getEmail() + "/ " +  getTelefone() + "/ " + getNumeroMatricula() + "/ " + getCurso();
	}
	
	
}
