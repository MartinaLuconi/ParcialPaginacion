package com.utn.MiPrimeraAPIRest.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Localidad")
public class Localidad  extends Base{
    @Column(name="Denominacion")
    private String denominacion;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="domicilio_id")
    //1 localidad tiene muchos domicilios
    private List<Domicilio> domicilios = new ArrayList<Domicilio>();
}
