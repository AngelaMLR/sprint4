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

import co.gov.mintic.entity.Proveedores;
import co.gov.mintic.service.ProveedoresServicio;

@RestController
@CrossOrigin(origins = "*")
public class ProveedoresController {

	@Autowired
	private ProveedoresServicio crudService;

	@GetMapping("/proveedoresList")
	public ResponseEntity<List<Proveedores>> getProveedoresList() {
		return new ResponseEntity<List<Proveedores>>(crudService.listar(), HttpStatus.OK);
	}

	@GetMapping("/proveedores/{id}")
	public ResponseEntity<Optional<Proveedores>> getProveedores(@PathVariable Long id) {
		return new ResponseEntity<Optional<Proveedores>>(crudService.buscar(id), HttpStatus.OK);
	}

	@PostMapping("/proveedores/save")
	public ResponseEntity<Void> saveOrUpdateProveedores(@RequestBody Proveedores proveedores) {
		crudService.guardar(proveedores);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/proveedores/delete/{id}")
	public ResponseEntity<Void> deleteProveedores(@PathVariable Long id) {
		crudService.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
