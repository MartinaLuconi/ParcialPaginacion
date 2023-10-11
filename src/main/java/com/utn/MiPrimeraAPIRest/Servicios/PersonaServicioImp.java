package com.utn.MiPrimeraAPIRest.Servicios;


import com.utn.MiPrimeraAPIRest.Entidades.Persona;
import com.utn.MiPrimeraAPIRest.Repositorios.BaseRepositorio;
import com.utn.MiPrimeraAPIRest.Repositorios.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicioImp extends BaseServicioImpl<Persona,Long> implements PersonaServicio {
    @Autowired
    private PersonaRepositorio personaRepositorio;

    public PersonaServicioImp(BaseRepositorio<Persona, Long> baseRepositorio, PersonaRepositorio personaRepositorio) {
        super(baseRepositorio);
        this.personaRepositorio = personaRepositorio;
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try{
            //List<Persona> personas = personaRepositorio.findByNombreContainingOrApellidoContaining(filtro,filtro);
           //List<Persona> personas= personaRepositorio.searchNativo(filtro);
            List<Persona> personas= personaRepositorio.search(filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Persona> personas = personaRepositorio.findByNombreContainingOrApellidoContaining(filtro,filtro,pageable);
            //Page<Persona> personas= personaRepositorio.searchNativo(filtro,pageable);
            Page<Persona> personas= personaRepositorio.search(filtro,pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
