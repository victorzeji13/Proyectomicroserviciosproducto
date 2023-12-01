package com.everis.product.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DefaultDto {
    private Long codigo;

    private String nombre;

    private String descripcion;

    private Double precio;

    private Boolean activo;
}
