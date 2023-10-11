package com.utn.MiPrimeraAPIRest.Servicios;



import com.utn.MiPrimeraAPIRest.Entidades.Localidad;
import com.utn.MiPrimeraAPIRest.Repositorios.BaseRepositorio;
import com.utn.MiPrimeraAPIRest.Repositorios.LocalidadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServicioImp extends BaseServicioImpl<Localidad,Long> implements LocalidadServicio{
    @Autowired
    private LocalidadRepositorio localidadRepositorio;

    public LocalidadServicioImp(BaseRepositorio<Localidad, Long> baseRepositorio, LocalidadRepositorio localidadRepositorio) {
        super(baseRepositorio);
        this.localidadRepositorio = localidadRepositorio;
    }
}
