package com.utn.MiPrimeraAPIRest.Servicios;

import com.utn.MiPrimeraAPIRest.Entidades.Libro;
import com.utn.MiPrimeraAPIRest.Repositorios.BaseRepositorio;
import com.utn.MiPrimeraAPIRest.Repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicioImp extends BaseServicioImpl<Libro,Long> implements LibroServicio{
    @Autowired
    private LibroRepositorio libroRepositorio;

    public LibroServicioImp(BaseRepositorio<Libro, Long> baseRepositorio, LibroRepositorio libroRepositorio) {
        super(baseRepositorio);
        this.libroRepositorio = libroRepositorio;
    }
}
