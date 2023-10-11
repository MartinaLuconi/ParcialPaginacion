package com.utn.MiPrimeraAPIRest.Repositorios;


import com.utn.MiPrimeraAPIRest.Entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepositorio extends BaseRepositorio<Persona,Long> {
    //Metodo query
    List<Persona> findByNombreContainingOrApellidoContaining( String nombre, String apellido);
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);
  //@query
    @Query(value = "Select p from Persona p where p.nombre like %:filtro% OR p.apellido like %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);

    @Query(value = "Select p from Persona p where p.nombre like %:filtro% OR p.apellido like %:filtro%")
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);
    //query nativa
    @Query(
            value = "Select * from persona where persona.nombre like %:filtro% OR persona.apellido like %:filtro%",
            nativeQuery = true
    )
    List<Persona> searchNative(@Param("filtro") String filtro);

    @Query(
            value = "Select * from persona where persona.nombre like %:filtro% OR persona.apellido like %:filtro%",
            countQuery = "Select count(*) from persona",
            nativeQuery = true
    )
    Page<Persona> searchNative(@Param("filtro") String filtro, Pageable pageable);
}
