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

	import com.senaidev.mercado.entities.Categoria;
	import com.senaidev.mercado.services.CategoriaService;

	@RestController
	@RequestMapping("/categoria")
	public class CategoriaControllers {
	
		@Autowired
		private CategoriaService categoriaServices;

		@PostMapping
		public Categoria createCategoria(@RequestBody Categoria categoria) {
			return categoriaServices.savecategoria(categoria);
		}
		
		@PutMapping
		public Categoria editCategoria(@RequestBody Categoria categoria) {
			return categoriaServices.savecategoria(categoria);
		}

		@GetMapping
		public List<Categoria> getAllCategoria() {
			return categoriaServices.getAllCategoria();
		}

		@GetMapping("/{id}")
		public Categoria getCategoria(@PathVariable Long id) {
			return categoriaServices.getCategoriaById(id);
		}

		@DeleteMapping("/{id}")
		public void deleteCategoria(@PathVariable Long id) {
			categoriaServices.deleteCategoria(id);
		}

	}