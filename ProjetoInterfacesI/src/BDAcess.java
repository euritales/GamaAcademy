
public class BDAcess implements InterfaceBD{

	@Override
	public void conectar() {
		System.out.println("Conectando no banco ACESS.");
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando no banco ACESS.");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("ms- acess> " + comando);		
	}

	
}
