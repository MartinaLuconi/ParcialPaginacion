package com.utn.MiPrimeraAPIRest.Controladores;


import com.utn.MiPrimeraAPIRest.Entidades.Autor;
import com.utn.MiPrimeraAPIRest.Servicios.AutorServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorControlador extends BaseControladorImpl<Autor, AutorServicioImp> {


}

