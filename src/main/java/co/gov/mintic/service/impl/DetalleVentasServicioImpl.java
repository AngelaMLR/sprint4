package co.gov.mintic.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import co.gov.mintic.entity.DetalleVentas;
import co.gov.mintic.repository.DetalleVentasRepository;
import co.gov.mintic.service.DetalleVentasServicio;

public class DetalleVentasServicioImpl implements DetalleVentasServicio {
	@Autowired
	DetalleVentasRepository repositorio;
	

	@Override
	public List<DetalleVentas> listar() {
		// TODO Auto-generated method stub
		return (List<DetalleVentas>) repositorio.findAll();
	}

	@Override
	public Optional<DetalleVentas> buscar(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}
	
	@Override
	public void  eliminar(Long id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public DetalleVentas guardar(DetalleVentas detalle) {
		// TODO Auto-generated method stub
		return repositorio.save(detalle);
	}
	
}