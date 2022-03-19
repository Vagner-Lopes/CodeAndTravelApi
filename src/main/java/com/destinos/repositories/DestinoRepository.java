package com.destinos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.destinos.models.Destino;

public interface DestinoRepository extends JpaRepository<Destino, Long> {
	
}
