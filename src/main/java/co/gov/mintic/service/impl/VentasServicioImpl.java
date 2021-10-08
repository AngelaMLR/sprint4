package co.gov.mintic.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import co.gov.mintic.entity.Ventas;
import co.gov.mintic.repository.VentasRepository;
import co.gov.mintic.service.VentasServicio;


public class VentasServicioImpl implements VentasServicio {
	@Autowired
	VentasRepository repositorio;

@Override
public List<Ventas> listar() {
	// TODO Auto-generated method stub
	return (List<Ventas>) repositorio.findAll();
}

@Override
public Optional<Ventas> buscar(Long id) {
	// TODO Auto-generated method stub
	return repositorio.findById(id);
}

@Override
public void eliminar(Long id) {
	// TODO Auto-generated method stub
	repositorio.deleteById(id);
}

@Override
public Ventas guardar(Ventas ventas) {
	// TODO Auto-generated method stub
	return repositorio.save(ventas);
}

}