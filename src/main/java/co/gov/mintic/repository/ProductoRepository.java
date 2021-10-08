package co.gov.mintic.repository;

import org.springframework.data.repository.CrudRepository;

import co.gov.mintic.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto,Long> {

}
