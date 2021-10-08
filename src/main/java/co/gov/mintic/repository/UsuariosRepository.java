package co.gov.mintic.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import co.gov.mintic.entity.Producto;
import co.gov.mintic.entity.Usuarios;
import co.gov.mintic.repository.impl.UsuarioRepositoryCustom;

public interface UsuariosRepository extends CrudRepository<Usuarios,Long>,UsuarioRepositoryCustom {

	void delete(Long id);
	
	

}
