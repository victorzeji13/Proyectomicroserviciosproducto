package com.everis.product.dto;

import lombok.Data;

@Data
public class ResponseGetByIdDto {

    private String nombre;

    private String descripcion;

    private Double precio;

    private Boolean activo;
}
