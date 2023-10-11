package com.utn.MiPrimeraAPIRest.Repositorios;


import com.utn.MiPrimeraAPIRest.Entidades.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepositorio extends BaseRepositorio<Localidad,Long> {

}
