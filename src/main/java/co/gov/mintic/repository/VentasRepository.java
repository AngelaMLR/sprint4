package co.gov.mintic.repository;

import org.springframework.data.repository.CrudRepository;

import co.gov.mintic.entity.Producto;
import co.gov.mintic.entity.Ventas;

public interface VentasRepository extends CrudRepository<Ventas,Long>  {

}
