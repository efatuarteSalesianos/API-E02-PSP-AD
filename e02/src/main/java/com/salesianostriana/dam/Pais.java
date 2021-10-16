package com.salesianostriana.dam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "country")
public class Pais {

@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column(name = "name", nullable = false)
private String nombre;
    
}
