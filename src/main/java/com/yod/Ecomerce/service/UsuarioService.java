package com.yod.Ecomerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yod.Ecomerce.dao.UsuarioRepository;
import com.yod.Ecomerce.model.Usuario;
import com.yod.Ecomerce.model.UsuarioDetalle;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioDetalleService usuarioDetalleService;

    final Long id = (long) 1;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario guardarUsuario(UsuarioDetalle usuarioDetalle) {
        Usuario usuario = new Usuario();
        usuario.setPrivilegios_id(id);
        usuario.setTipo_pago_id(id);
        usuario.setUsuario_detalle_id(usuarioDetalleService.guardarUsuarioDetalle(usuarioDetalle));
        return usuarioRepository.save(usuario);
    }
}
