package com.utn.MiPrimeraAPIRest.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="Libro")
public class Libro extends Base{
     @Column(name="Titulo")
     private String titulo;
     @Column(name="Fecha")
     private int fecha;
     @Column(name="Genero")
     private String genero;
     @Column(name="Paginas")
     private int paginas;
     @Column(name="Autor")
     private String autor;

     @ManyToMany(cascade = CascadeType.REFRESH)
     private List<Autor> Autores = new ArrayList<Autor>();



}
