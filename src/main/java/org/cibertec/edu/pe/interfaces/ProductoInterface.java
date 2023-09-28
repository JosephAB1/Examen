package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoInterface extends JpaRepository<Producto,String> {
	
}
