package com.utn.MiPrimeraAPIRest.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="Autor")
public class Autor extends Base{
    @Column(name = "Nombre")
    private String nombreAutor;
    @Column(name = "Apellido")
    private String apellidoAutor;
    @Column(name = "Biografia")
    private String biografia;

}
