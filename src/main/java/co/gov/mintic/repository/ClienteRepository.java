package co.gov.mintic.repository;

import org.springframework.data.repository.CrudRepository;

import co.gov.mintic.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
