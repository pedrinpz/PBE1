package com.senaidev.mercado.controllers;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.senaidev.mercado.entities.Produto;
	import com.senaidev.mercado.services.ProdutoService;

	@RestController
	@RequestMapping("/produto")
	public class ProdutoControllers {
		@Autowired
		private ProdutoServices ProdutoServices;

		@PostMapping
		public Produto createProduto(@RequestBody Produto produto) {
			return ProdutoServices.saveProduto(produto);
		}
		
		@PutMapping
		public Produto editProduto(@RequestBody Produto produto) {
			return ProdutoServices.saveProduto(produto);
		}

		@GetMapping
		public List<Produto> getAllProduto() {
			return ProdutoServices.getAllProduto();
		}

		@GetMapping("/{id}")
		public Produto getProduto(@PathVariable Long id) {
			return ProdutoServices.getProdutoById(id);
		}

		@DeleteMapping("/{id}")
		public void deleteProduto(@PathVariable Long id) {
			ProdutoServices.deleteProduto(id);
		}
	
}
