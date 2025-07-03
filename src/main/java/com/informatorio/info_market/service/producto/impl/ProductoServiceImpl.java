package com.informatorio.info_market.service.producto.impl;

import com.informatorio.info_market.domain.Producto;
import com.informatorio.info_market.repository.producto.ProductoRepository;
import com.informatorio.info_market.repository.producto.ProductoRepositoryStub;
import com.informatorio.info_market.service.producto.ProductoService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;
    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto createProducto(Producto producto) {
        producto.setFechaDeCreacion(LocalDate.now());
        producto.setFechaActualizacion(LocalDate.now());
        return productoRepository.save(producto);
    }

    @Override
    public Producto getProductoById(UUID id){
        return productoRepository.findById(id).get();
    }
}
