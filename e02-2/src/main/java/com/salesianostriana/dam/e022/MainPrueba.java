package com.salesianostriana.dam.e022;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainPrueba {

    private final ProductoRepository repository;

    @PostConstruct
    public void initData() {
        Producto p1 = Producto.builder()
                .nombre("Barra de pan")
                .precio(1)
                .imagen("https://congeladospetri.com/149-thickbox_default/barra-de-pan.jpg")
                .descripcion("Barra de pan de 250g, hecha de harina y cocida en horno de piedra")
                .build();

        Producto p2 = Producto.builder()
                .nombre("Paquete de pipas")
                .precio(1)
                .imagen("https://m.media-amazon.com/images/I/41qNH9OEcOL._AC_PIbundle-3,TopRight,0,0_SH20_.jpg")
                .descripcion("Paquete de pipas saladas de la marca Grefusa, 150g")
                .build();

        repository.save(p1);
        repository.save(p2);

        repository.findAll().forEach(System.out::println);
    }
}
