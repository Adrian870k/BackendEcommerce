package com.yod.Ecomerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yod.Ecomerce.dao.UsuarioDetalleRepository;
import com.yod.Ecomerce.model.UsuarioDetalle;

@Service
public class UsuarioDetalleService {
    private final UsuarioDetalleRepository detalleRepository;

    @Autowired
    public UsuarioDetalleService(UsuarioDetalleRepository detalleRepository) {
        this.detalleRepository = detalleRepository;
    }

    public Long guardarUsuarioDetalle(UsuarioDetalle usuarioDetalle) {
        if (this.validarData(usuarioDetalle)) {
            return detalleRepository.save(usuarioDetalle).getId();

        }
        return 0l;
    }

    private boolean validarData(UsuarioDetalle usuarioDetalle) {
        boolean validar = false;
        detalleRepository.findById(usuarioDetalle.getId());
        return validar;

    }
}
