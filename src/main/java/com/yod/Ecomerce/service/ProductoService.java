package com.yod.Ecomerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yod.Ecomerce.dao.ProductoRepository;
import com.yod.Ecomerce.model.Producto;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }
}

