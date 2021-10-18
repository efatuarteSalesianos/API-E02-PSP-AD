package com.salesianostriana.dam.e022;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
@ToString
@Table(name = "product")
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String nombre;

    @Column(name = "price", nullable = false)
    private float precio;

    @Column(name = "image")
    private String imagen;

    @Column(name = "description")
    private String descripcion;
}
