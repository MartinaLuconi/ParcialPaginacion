package com.utn.MiPrimeraAPIRest.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Domicilio")
public class Domicilio extends Base{
    @Column(name = "Calle")
    private String calle;
    @Column(name="numero")
    private int numero;
    @ManyToOne(optional = false)
    @JoinColumn(name="localidad_id")
    private Localidad localidad;

}
