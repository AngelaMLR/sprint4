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

import co.gov.mintic.entity.Ventas;
import co.gov.mintic.service.VentasServicio;

@RestController
@CrossOrigin(origins = "*")
public class VentasController {

	@Autowired
	private VentasServicio crudService;

	@GetMapping("/ventasList")
	public ResponseEntity<List<Ventas>> getVentasList() {
		return new ResponseEntity<List<Ventas>>(crudService.listar(), HttpStatus.OK);
	}

	@GetMapping("/ventas/{id}")
	public ResponseEntity<Optional<Ventas>> getVentas(@PathVariable Long id) {
		return new ResponseEntity<Optional<Ventas>>(crudService.buscar(id), HttpStatus.OK);
	}

	@PostMapping("/ventas/save")
	public ResponseEntity<Void> saveOrUpdateVentas(@RequestBody Ventas ventas) {
		crudService.guardar(ventas);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/ventas/delete/{id}")
	public ResponseEntity<Void> deleteVentas(@PathVariable Long id) {
		crudService.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
