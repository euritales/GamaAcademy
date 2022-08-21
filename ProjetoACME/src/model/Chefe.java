package model;

public class Chefe extends Funcionario{

	private double salarioBase;
	private double adcionalFuncao;
	private double beneficioTerno;
	
	public Chefe(int numRegistro, String nome, double salarioBase, double adcionalFuncao, double beneficioTerno) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.adcionalFuncao = adcionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase + adcionalFuncao/100 + beneficioTerno;
	}
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAdcionalFuncao() {
		return adcionalFuncao;
	}

	public void setAdcionalFuncao(double adcionalFuncao) {
		this.adcionalFuncao = adcionalFuncao;
	}

	public double getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}

	
	
	
}
