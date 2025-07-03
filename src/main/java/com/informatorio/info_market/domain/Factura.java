package com.informatorio.info_market.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Carrito carrito;
    private LocalDate fechaDeEmision;


    public Factura() {}

    public Factura(Long id, Carrito carrito, LocalDate fechaDeEmision) {
        this.id = id;
        this.carrito = carrito;
        this.fechaDeEmision = fechaDeEmision;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public LocalDate getFechaDeEmision() {
        return fechaDeEmision;
    }

    public void setFechaDeEmision(LocalDate fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }
}
