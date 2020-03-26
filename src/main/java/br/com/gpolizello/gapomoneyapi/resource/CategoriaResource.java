package br.com.gpolizello.gapomoneyapi.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.gpolizello.gapomoneyapi.model.Categoria;
import br.com.gpolizello.gapomoneyapi.repository.CategoriaRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping("/categorias")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class CategoriaResource {
	
	CategoriaRepository categoriaRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar(){
		return categoriaRepository.findAll();
	}
}
