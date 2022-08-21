
public class Principal {

	public static void main(String[] args) {
		InterfaceBD ibd;
		
//		ibd = new BDAcess();
		ibd = new BDMysql();
		ibd.conectar();

		ibd.executar("SELECT * FROM tb_clientes");

		ibd.desconectar();
	}
}
