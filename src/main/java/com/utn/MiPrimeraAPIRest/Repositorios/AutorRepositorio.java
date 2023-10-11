package com.utn.MiPrimeraAPIRest.Repositorios;


import com.utn.MiPrimeraAPIRest.Entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends BaseRepositorio<Autor,Long>{
}
