package com.yod.Ecomerce.service;

import java.util.List;
import java.util.Optional;

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

    public List<Producto> findAllProductos() {
        return productoRepository.findAll();
    }

    public Producto findProductoById(Long id) {
        Optional<Producto> prod = productoRepository.findById(id);

        if (prod.isPresent()) {
            Producto producto = prod.get();
            return producto;
        }
        Producto productoNoExiste = new Producto();
        productoNoExiste.setNombre("no existe");
        return productoNoExiste;
    }

}
