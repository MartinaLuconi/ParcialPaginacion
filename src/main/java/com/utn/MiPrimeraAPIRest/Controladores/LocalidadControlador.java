package com.utn.MiPrimeraAPIRest.Controladores;



import com.utn.MiPrimeraAPIRest.Entidades.Localidad;
import com.utn.MiPrimeraAPIRest.Servicios.LocalidadServicioImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadControlador extends BaseControladorImpl<Localidad, LocalidadServicioImp> {

}
