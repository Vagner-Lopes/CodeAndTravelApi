package com.destinos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.destinos.models.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {
	
	@Query(value = "select d from Destino d where d.nome like %?1%")
	List<Destino> findByNome(String nome);
}
