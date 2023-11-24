package com.yod.Ecomerce.controller.SaludoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yod.Ecomerce.model.Usuario;
import com.yod.Ecomerce.model.UsuarioDetalle;
import com.yod.Ecomerce.service.UsuarioService;

@CrossOrigin(origins = "*")
@RequestMapping("/usuarios")
@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/saveUsuario")
    public Usuario guardarUsuario(@RequestBody UsuarioDetalle usuario){
        return usuarioService.guardarUsuario(usuario);
    }

}
