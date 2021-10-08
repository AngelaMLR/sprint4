package co.gov.mintic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.gov.mintic.entity.Cliente;
import co.gov.mintic.service.ClienteServicio;

@RestController
@CrossOrigin(origins = "*")
public class ClienteController {

	@Autowired
	private ClienteServicio crudService;

	@GetMapping("/clienteList")
	public ResponseEntity<List<Cliente>> getClienteList() {
		return new ResponseEntity<List<Cliente>>(crudService.listar(), HttpStatus.OK);
	}

	@GetMapping("/cliente/{id}")
	public ResponseEntity<Optional<Cliente>> getCliente(@PathVariable Long id) {
		return new ResponseEntity<Optional<Cliente>>(crudService.buscar(id), HttpStatus.OK);
	}

	@PostMapping("/cliente/save")
	public ResponseEntity<Void> saveOrUpdateCliente(@RequestBody Cliente cliente) {
		crudService.guardar(cliente);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/cliente/delete/{id}")
	public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
		crudService.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
