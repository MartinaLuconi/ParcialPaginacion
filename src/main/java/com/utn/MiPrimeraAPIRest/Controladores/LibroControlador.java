package com.utn.MiPrimeraAPIRest.Controladores;



import com.utn.MiPrimeraAPIRest.Entidades.Libro;
import com.utn.MiPrimeraAPIRest.Servicios.LibroServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroControlador extends BaseControladorImpl<Libro, LibroServicioImp> {

}
