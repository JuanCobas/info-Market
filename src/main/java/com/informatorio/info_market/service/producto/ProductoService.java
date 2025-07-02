package com.informatorio.info_market.service.producto;

import com.informatorio.info_market.domain.Producto;

import java.util.List;
import java.util.UUID;

public interface ProductoService {
    List<Producto> getAllProductos();
    Producto createProducto(Producto producto);
    Producto getProductoById(UUID id);
}
