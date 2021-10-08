package co.gov.mintic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.gov.mintic.entity.Cliente;
@Service
public interface ClienteServicio {

	List<Cliente> listar();

	Optional<Cliente> buscar(Long id);

	Cliente guardar(Cliente cliente);
	
	void eliminar(Long id);

}
