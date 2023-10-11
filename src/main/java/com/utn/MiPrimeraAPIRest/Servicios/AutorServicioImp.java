package com.utn.MiPrimeraAPIRest.Servicios;


import com.utn.MiPrimeraAPIRest.Entidades.Autor;
import com.utn.MiPrimeraAPIRest.Repositorios.AutorRepositorio;
import com.utn.MiPrimeraAPIRest.Repositorios.BaseRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicioImp extends BaseServicioImpl<Autor,Long> implements AutorServicio{
    @Autowired
    private AutorRepositorio autorRepositorio;



    public AutorServicioImp(BaseRepositorio<Autor, Long> baseRepositorio, AutorRepositorio autorRepositorio) {
        super(baseRepositorio);
        this.autorRepositorio = autorRepositorio;
    }
}

