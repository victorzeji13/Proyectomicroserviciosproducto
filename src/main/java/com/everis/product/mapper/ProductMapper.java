package com.everis.product.mapper;

import com.everis.product.dto.RequestDto;
import com.everis.product.dto.ResponseDto;
import com.everis.product.dto.ResponseGetByIdDto;
import com.everis.product.entity.ProducEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ProductMapper {
    @Mapping(source = "id" , target = "codigo")
    @Mapping(source = "name" , target = "nombre")
    @Mapping(source = "description" , target = "descripcion")
    @Mapping(source = "price" , target = "precio")
    @Mapping(source = "active" , target = "activo")
    ResponseDto mapEntityToResponseDto(ProducEntity producEntity);

    @Mapping(source = "name" , target = "nombre")
    @Mapping(source = "description" , target = "descripcion")
    @Mapping(source = "price" , target = "precio")
    @Mapping(source = "active" , target = "activo")
    ResponseGetByIdDto mapEntityToResponseGetByIdDto(ProducEntity producEntity);

    @Mapping(source = "nombre" , target = "name")
    @Mapping(source = "descripcion" , target = "description")
    @Mapping(source = "precio" , target = "price")
    @Mapping(constant = "true" , target = "active")
    ProducEntity mapRequestToEntity(RequestDto requestDto);

}
