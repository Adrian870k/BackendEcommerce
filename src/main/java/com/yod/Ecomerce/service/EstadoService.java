package com.yod.Ecomerce.service;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {

    public String obtenerMensajeSegunEstado(String estado) {
        switch (estado.toLowerCase()) {
            case "diana":
                return "Es gay";
            case "yordan":
                return "Es un aragang.";
            default:
                return "Estado no reconocido. Por favor, proporciona 'Yordan' o 'Diana'.";
        }
    }
}