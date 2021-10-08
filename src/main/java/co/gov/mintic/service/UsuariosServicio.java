package co.gov.mintic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.gov.mintic.entity.Usuarios;

@Service
public interface UsuariosServicio {

	List<Usuarios> listar();

	Optional<Usuarios> buscar(Long id);

	void eliminar(Long id);

	Usuarios guardar(Usuarios usuarios);

}
