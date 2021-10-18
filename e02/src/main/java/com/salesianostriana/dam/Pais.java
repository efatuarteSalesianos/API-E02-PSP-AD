package com.salesianostriana.dam;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
@ToString
@Table(name = "country")
public class Pais {

@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;

@Column(name = "name", nullable = false)
private String nombre;
    
}
