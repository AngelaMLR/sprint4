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

import co.gov.mintic.entity.Usuarios;
import co.gov.mintic.service.UsuariosServicio;

@RestController
@CrossOrigin(origins = "*")
public class UsuariosController {

	@Autowired
	private UsuariosServicio crudService;

	@GetMapping("/usuariosList")
	public ResponseEntity<List<Usuarios>> getUsuariosList() {
		return new ResponseEntity<List<Usuarios>>(crudService.listar(), HttpStatus.OK);
	}

	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Optional<Usuarios>> getUsuarios(@PathVariable Long id) {
		return new ResponseEntity<Optional<Usuarios>>(crudService.buscar(id), HttpStatus.OK);
	}

	@PostMapping("/usuarios/save")
	public ResponseEntity<Void> saveOrUpdateUsuarios(@RequestBody Usuarios usuarios) {
		crudService.guardar(usuarios);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/usuarios/delete/{id}")
	public ResponseEntity<Void> deleteUsuarios(@PathVariable Long id) {
		crudService.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
