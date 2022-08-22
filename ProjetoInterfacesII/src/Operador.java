
public class Operador  implements InterfaceModulo1, InterfaceModulo2{

	public void realizaCalculO(){
		System.out.println("Calculei!");
	}

	@Override
	public void efetivarContas() {
		realizaCalculO();		
	}

	@Override
	public void calcularValores() {
		realizaCalculO();		
	}
}
