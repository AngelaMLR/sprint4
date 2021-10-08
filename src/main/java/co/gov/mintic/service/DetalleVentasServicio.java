package co.gov.mintic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.gov.mintic.entity.DetalleVentas;
@Service
public interface DetalleVentasServicio {


	List<DetalleVentas> listar();

	Optional<DetalleVentas> buscar(Long id);
	
	DetalleVentas guardar(DetalleVentas detalle);

	void eliminar(Long id);

}
