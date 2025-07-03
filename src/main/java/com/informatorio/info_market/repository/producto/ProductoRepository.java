package com.informatorio.info_market.repository.producto;

import com.informatorio.info_market.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID> {
    public Producto getProductoById(UUID id);
}
