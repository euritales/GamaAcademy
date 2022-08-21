package controller;
import conexao.BancoDeDados;
import model.Compra;
import model.Produto;

public class Gerenciamento {
	
	
	public static void main(String[] args) {
//	
		BancoDeDados sintaxeBanco = new BancoDeDados();
		sintaxeBanco.Conectar();
		
		Produto produto = new Produto();
		produto.setId_produto(14);
		produto.setNome_produto("teste");
		produto.setPreco(15.75);
		produto.setQtd_produto(12);
		produto.setTipo_generico(false);
		produto.setTipo_medicamento(true);
		
		Compra compra = new Compra();
		compra.setClienteId(1);
		compra.setDataCompra("1942-02-18");
		
		if(sintaxeBanco.estaConectado()) {
			sintaxeBanco.salvarCompras(compra);
			// insercao
//			sintaxeBanco.InserirProdutos(produto);
			// edicao
//			sintaxeBanco.ModificarProduto(produto);
			// Exclusao
//			sintaxeBanco.ExcluirProduto(produto);
			//Listagem
			for(Produto p: sintaxeBanco.getProdutos()) {
				System.out.println("\nID: " + p.getId_produto());
				System.out.println("Produto: " + p.getNome_produto());
				System.out.println("Quantidade: " + p.getQtd_produto());
				System.out.println("Preco: " + p.getPreco());
				System.out.println("Generico: " + p.isTipo_generico());
				System.out.println("Medicamento: " + p.isTipo_medicamento());
			}
			System.out.println("Produtos");
			for(Compra c: sintaxeBanco.getCompras()) {
				System.out.println("\nID Cliente: " + c.getClienteId());
				System.out.println("Cod Compra: " + c.getCodigoCompra());
				System.out.println("Data: " + c.getDataCompra());

			}
			System.out.println("Exito");
		}else {
			System.out.println("Falha na operacao");
		}

	}

}
