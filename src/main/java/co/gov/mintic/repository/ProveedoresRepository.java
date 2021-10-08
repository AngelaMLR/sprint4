package co.gov.mintic.repository;

import org.springframework.data.repository.CrudRepository;

import co.gov.mintic.entity.Producto;
import co.gov.mintic.entity.Proveedores;

public interface ProveedoresRepository extends CrudRepository<Proveedores,Long>  {

}
