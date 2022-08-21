
public class BDMysql implements InterfaceBD{

	@Override
	public void conectar() {
		System.out.println("Connecting MySQL Server...");		
	}

	@Override
	public void desconectar() {

		System.out.println("Desconnecting MySQL Server...");
	}

	@Override
	public void executar(String comando) {
		System.out.println("MySQL >" + comando);
		
	}

}
