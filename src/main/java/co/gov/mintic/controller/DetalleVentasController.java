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

import co.gov.mintic.entity.DetalleVentas;
import co.gov.mintic.service.DetalleVentasServicio;

@RestController
@CrossOrigin(origins = "*")
public class DetalleVentasController {

	@Autowired
	private DetalleVentasServicio crudService;

	@GetMapping("/detalleVentasList")
	public ResponseEntity<List<DetalleVentas>> getDetalleVentasList() {
		return new ResponseEntity<List<DetalleVentas>>(crudService.listar(), HttpStatus.OK);
	}

	@GetMapping("/detalleVentas/{id}")
	public ResponseEntity<Optional<DetalleVentas>> getDetalleVentas(@PathVariable Long id) {
		return new ResponseEntity<Optional<DetalleVentas>>(crudService.buscar(id), HttpStatus.OK);
	}

	@PostMapping("/detalleVentas/save")
	public ResponseEntity<Void> saveOrUpdateDetalleVentas(@RequestBody DetalleVentas detalleVentas) {
		crudService.guardar(detalleVentas);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/detalleVentas/delete/{id}")
	public ResponseEntity<Void> deleteDetalleVentas(@PathVariable Long id) {
		crudService.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
