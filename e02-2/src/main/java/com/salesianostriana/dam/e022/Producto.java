package com.salesianostriana.dam.e022;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "product")
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String nombre;

    @Column(name = "price", nullable = false)
    private float precio;

    private String imagen, descripcion;
}
