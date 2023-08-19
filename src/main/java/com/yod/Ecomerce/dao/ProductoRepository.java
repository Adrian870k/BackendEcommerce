package com.yod.Ecomerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yod.Ecomerce.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}

