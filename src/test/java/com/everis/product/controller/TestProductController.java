package com.everis.product.controller;

import com.everis.product.dto.DefaultDto;
import com.everis.product.entity.ProducEntity;
import com.everis.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestProductController {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductService productService;

    @Test
    public void testGetAllSuccessfully(){
        //1. Preparacion
        ProducEntity producEntity1 = new ProducEntity();
        producEntity1.setId(1L);
        producEntity1.setActive(Boolean.TRUE);
        producEntity1.setName("1");
        producEntity1.setDescription("1");
        producEntity1.setPrice(1D);
        Mockito.when(productService.getAll()).thenReturn(List.of(producEntity1));
        List<DefaultDto> productEntityList = productController.getAll();
        //productEntityList.add(producEntity1);

        //2. Ejecucion
       // List<DefaultDto>  defaultDtoList =  productController.getAll();

        //3. Comparacion
        //Assertions.assertEquals(defaultDtoList.get(0).getCodigo() , 1);
        //Assertions.assertEquals(defaultDtoList.get(0).getNombre(), "1");
        //Assertions.assertEquals(defaultDtoList.get(0).getDescripcion(), "1");
        //Assertions.assertEquals(defaultDtoList.get(0).getPrecio(), 1.0);







    }
}
