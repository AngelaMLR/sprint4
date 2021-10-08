package co.gov.mintic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.gov.mintic.entity.Ventas;

@Service
public interface VentasServicio {

	List<Ventas> listar();

	Optional<Ventas> buscar(Long id);

	Ventas guardar(Ventas ventas);

	void eliminar(Long id);

}
