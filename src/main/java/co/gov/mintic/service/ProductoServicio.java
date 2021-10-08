package co.gov.mintic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.gov.mintic.entity.Producto;



@Service
public interface ProductoServicio {

	List<Producto> listar();

	Optional<co.gov.mintic.entity.Producto> buscar(Long id);

	void eliminar(Long id);

	Producto guardar(Producto producto);

}
