package br.com.projectspring.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectspring.hello.model.Produto;

@RestController
public class ProdutoController {
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto();
		p.setId(12);
		p.setNome("Computador");
		p.setPreco(4000);
		p.setQtdEstoque(12);
		return p;
	}

	@PostMapping("/produto")
	public String inserirProduto(@RequestBody Produto p) {
		return "Recebido: " + p.getId() + " " + p.getNome() + " " + p.getPreco() + " " + p.getQtdEstoque();
	}
	
//	@PutMapping("/produto:id")
//	public String editarProduto(@RequestBody Produto p) {
//		return "Recebido: " + p.getId() + " " + p.getNome() + " " + p.getPreco() + " " + p.getQtdEstoque();
//	
//	}
	
}
