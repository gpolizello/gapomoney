package br.com.gpolizello.gapomoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gpolizello.gapomoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
