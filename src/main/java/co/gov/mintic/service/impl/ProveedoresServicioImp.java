package co.gov.mintic.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import co.gov.mintic.entity.Proveedores;
import co.gov.mintic.entity.Usuarios;
import co.gov.mintic.repository.ProveedoresRepository;
import co.gov.mintic.service.ProveedoresServicio;

public class ProveedoresServicioImp implements ProveedoresServicio {
	@Autowired
	ProveedoresRepository repositorio;

	@Override
	public List<Proveedores> listar() {
		// TODO Auto-generated method stub
		return (List<Proveedores>) repositorio.findAll();
	}

	@Override
	public Optional<Proveedores> buscar(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public Proveedores guardar(Proveedores proveedores) {
		// TODO Auto-generated method stub
		return repositorio.save(proveedores);
	}
}