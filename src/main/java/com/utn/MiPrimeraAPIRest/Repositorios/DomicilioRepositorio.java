package com.utn.MiPrimeraAPIRest.Repositorios;


import com.utn.MiPrimeraAPIRest.Entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepositorio extends BaseRepositorio<Domicilio,Long> {
}
