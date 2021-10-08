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

import co.gov.mintic.entity.Producto;
import co.gov.mintic.service.ProductoServicio;

@RestController
@CrossOrigin(origins = "*")
public class ProductoController {

	@Autowired
	private ProductoServicio crudService;

	@GetMapping("/productoList")
	public ResponseEntity<List<Producto>> getProductoList() {
		return new ResponseEntity<List<Producto>>(crudService.listar(), HttpStatus.OK);
	}

	@GetMapping("/producto/{id}")
	public ResponseEntity<Optional<Producto>> getProducto(@PathVariable Long id) {
		return new ResponseEntity<Optional<Producto>>(crudService.buscar(id), HttpStatus.OK);
	}

	@PostMapping("/producto/save")
	public ResponseEntity<Void> saveOrUpdateProducto(@RequestBody Producto producto) {
		crudService.guardar(producto);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/producto/delete/{id}")
	public ResponseEntity<Void> deleteProducto(@PathVariable Long id) {
		crudService.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
