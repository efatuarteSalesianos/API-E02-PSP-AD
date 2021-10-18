package com.salesianostriana.dam;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MainPrueba {

    private final PaisRepository repository;

    public void initData() {

        Pais p1 = Pais.builder()
                .nombre("España")
                .build();

        Pais p2 = Pais.builder()
                .nombre("Francia")
                .build();

        repository.save(p1);
        repository.save(p2);

        repository.findAll().forEach(System.out::println);
    }
}
