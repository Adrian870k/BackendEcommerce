package com.yod.Ecomerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long privilegios_id;
    private Long tipo_pago_id;
    private Long usuario_detalle_id;

    // Getter para el campo 'id'
    public Long getId() {
        return id;
    }

    // Setter para el campo 'id'
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para el campo 'privilegios_id'
    public Long getPrivilegios_id() {
        return privilegios_id;
    }

    // Setter para el campo 'privilegios_id'
    public void setPrivilegios_id(Long privilegios_id) {
        this.privilegios_id = privilegios_id;
    }

    // Getter para el campo 'tipo_pago_id'
    public Long getTipo_pago_id() {
        return tipo_pago_id;
    }

    // Setter para el campo 'tipo_pago_id'
    public void setTipo_pago_id(Long tipo_pago_id) {
        this.tipo_pago_id = tipo_pago_id;
    }

    // Getter para el campo 'usuario_detalle_id'
    public long getUsuario_detalle_id() {
        return usuario_detalle_id;
    }

    // Setter para el campo 'usuario_detalle_id'
    public void setUsuario_detalle_id(Long usuario_detalle_id) {
        this.usuario_detalle_id = usuario_detalle_id;
    }

}
