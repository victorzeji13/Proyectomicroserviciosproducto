package com.everis.product.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestDto {

    private String nombre;

    private String descripcion;

    private Double precio;

}
