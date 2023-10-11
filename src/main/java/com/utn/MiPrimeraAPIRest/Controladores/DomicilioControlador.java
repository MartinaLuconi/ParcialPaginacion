package com.utn.MiPrimeraAPIRest.Controladores;


import com.utn.MiPrimeraAPIRest.Entidades.Domicilio;
import com.utn.MiPrimeraAPIRest.Servicios.DomicilioServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")

public class DomicilioControlador extends BaseControladorImpl<Domicilio, DomicilioServicioImp>{


}

