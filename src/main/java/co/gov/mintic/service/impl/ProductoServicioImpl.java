package co.gov.mintic.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;



import co.gov.mintic.entity.Producto;
import co.gov.mintic.repository.ProductoRepository;
import co.gov.mintic.service.ProductoServicio;

public class ProductoServicioImpl implements ProductoServicio {
	@Autowired
	ProductoRepository repositorio;

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return (List<Producto>) repositorio.findAll();
	}

	@Override
	public Optional<Producto> buscar(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public Producto guardar(Producto producto) {
		// TODO Auto-generated method stub
		return repositorio.save(producto);
	}

}