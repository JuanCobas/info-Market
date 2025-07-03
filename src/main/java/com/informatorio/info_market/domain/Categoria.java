package com.informatorio.info_market.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Categoria {

    @Id
    private Long id;

    @ManyToMany
    private List<Producto> productos;
}
