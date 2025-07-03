package com.informatorio.info_market.domain;


import com.informatorio.info_market.enumerations.EstadoCarritoEnum;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.SQLType;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(generator = "UUID")
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(length = 36, columnDefinition = "varchar(36)", nullable = false, updatable = false)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private EstadoCarritoEnum estadoCarrito;

    @ManyToMany
    private List<Producto> productos;

    @OneToOne
    private Factura factura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private LocalDate fechaDeCreacion;
    private LocalDate fechaActualizacion;
}
