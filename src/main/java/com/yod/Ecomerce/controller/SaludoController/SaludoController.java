package com.yod.Ecomerce.controller.SaludoController;

import com.yod.Ecomerce.model.EstadoRequest;
import com.yod.Ecomerce.service.EstadoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    private final EstadoService estadoService;

    public SaludoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @PostMapping("/obtener-mensaje")
    public String obtenerMensajeSegunEstado(@RequestBody EstadoRequest estadoRequest) {
        String estado = estadoRequest.getEstado();
        return estadoService.obtenerMensajeSegunEstado(estado);
    }

    @GetMapping("/obtenerProductos")
    public String obtenerProductos(@RequestBody EstadoRequest estadoRequest) {
        String estado = estadoRequest.getEstado();
        return estadoService.obtenerMensajeSegunEstado(estado);
    }
}
