package com.yod.Ecomerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yod.Ecomerce.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
