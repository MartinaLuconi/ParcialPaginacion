package com.utn.MiPrimeraAPIRest.Servicios;


import com.utn.MiPrimeraAPIRest.Entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaServicio extends BaseServicio<Persona,Long> {
    List <Persona> search(String filtro) throws Exception;
    //para paginacion
    Page<Persona> search(String filtro, Pageable pageable) throws Exception;
}
