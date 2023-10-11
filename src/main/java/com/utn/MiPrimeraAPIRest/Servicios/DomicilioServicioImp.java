package com.utn.MiPrimeraAPIRest.Servicios;


import com.utn.MiPrimeraAPIRest.Entidades.Domicilio;
import com.utn.MiPrimeraAPIRest.Repositorios.BaseRepositorio;
import com.utn.MiPrimeraAPIRest.Repositorios.DomicilioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServicioImp extends BaseServicioImpl<Domicilio,Long> implements DomicilioServicio{
    @Autowired
    private DomicilioRepositorio domicilioRepositorio;

    public DomicilioServicioImp(BaseRepositorio<Domicilio, Long> baseRepositorio, DomicilioRepositorio domicilioRepositorio) {
        super(baseRepositorio);
        this.domicilioRepositorio = domicilioRepositorio;
    }
}
