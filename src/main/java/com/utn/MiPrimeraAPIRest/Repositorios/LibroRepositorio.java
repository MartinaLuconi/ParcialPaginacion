package com.utn.MiPrimeraAPIRest.Repositorios;


import com.utn.MiPrimeraAPIRest.Entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends BaseRepositorio<Libro,Long> {
}
