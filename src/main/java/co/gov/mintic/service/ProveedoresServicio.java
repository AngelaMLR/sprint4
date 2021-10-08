package co.gov.mintic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.gov.mintic.entity.Proveedores;

@Service
public interface ProveedoresServicio {

	List<Proveedores> listar();

	Optional<Proveedores> buscar(Long id);

	void eliminar(Long id);

	Proveedores guardar(Proveedores proveedores);

}
