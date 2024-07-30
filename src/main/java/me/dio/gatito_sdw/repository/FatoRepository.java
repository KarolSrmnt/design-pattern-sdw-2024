package me.dio.gatito_sdw.repository;

import me.dio.gatito_sdw.model.Fato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatoRepository extends CrudRepository<Fato, Long> {
}
