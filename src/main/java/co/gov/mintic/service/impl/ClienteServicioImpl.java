package co.gov.mintic.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import co.gov.mintic.entity.Cliente;
import co.gov.mintic.repository.ClienteRepository;
import co.gov.mintic.service.ClienteServicio;

public class ClienteServicioImpl implements ClienteServicio {
	@Autowired
	ClienteRepository repositorio;

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return (List<Cliente>) repositorio.findAll();
	}

	@Override
	public Optional<Cliente> buscar(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}
	
	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		 repositorio.deleteById(id);
	}
	

	@Override
	public Cliente guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		return repositorio.save(cliente);
	}

}