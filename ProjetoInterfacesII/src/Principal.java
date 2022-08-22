
public class Principal {

	public static void main(String[] args) {
		
		Operador o = new Operador();
		o.realizaCalculO();
	
		InterfaceModulo1 i1 = o;
		i1.calcularValores();
		InterfaceModulo2 i2 = o;
		i2.efetivarContas();
		
	}
}
