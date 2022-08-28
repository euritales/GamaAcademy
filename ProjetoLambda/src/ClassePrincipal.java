
public class ClassePrincipal {

	public static void main(String[] args) {
		InterfaceServico i;
		i = new InterfaceServico() {
			public void executar(int valor) {
				System.out.println("Executando  z" + valor);
			}
		};
		
		i.executar(32);
		
		InterfaceServico i2 = (valor) ->{
			System.out.println("Arrow function: " + valor);
		};
		i2.executar(11);
	}
}
