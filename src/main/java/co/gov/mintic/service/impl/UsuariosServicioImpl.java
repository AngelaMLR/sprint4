package co.gov.mintic.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import co.gov.mintic.entity.Usuarios;
import co.gov.mintic.repository.UsuariosRepository;
import co.gov.mintic.service.UsuariosServicio;

public class UsuariosServicioImpl implements UsuariosServicio {
	@Autowired
	UsuariosRepository repositorio;

	@Override
	public List<Usuarios> listar() {
		// TODO Auto-generated method stub
		return (List<Usuarios>) repositorio.findAll();
	}

	@Override
	public Optional<Usuarios> buscar(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}
	
	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
	    repositorio.deleteById(id);
	}
	
	@Override
	public Usuarios guardar(Usuarios usuarios) {
		// TODO Auto-generated method stub
		return repositorio.save(usuarios);
	}
	
	
	
	
}
