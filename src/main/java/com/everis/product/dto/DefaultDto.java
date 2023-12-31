package com.everis.product.dto;

import lombok.Data;

@Data
public class DefaultDto {
    private Long codigo;

    private String nombre;

    private String descripcion;

    private Double precio;

    private Boolean activo;
}
