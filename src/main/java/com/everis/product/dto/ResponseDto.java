package com.everis.product.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ResponseDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long codigo;

    private String nombre;

    private String descripcion;

    private Double precio;

    private Boolean activo;
}
