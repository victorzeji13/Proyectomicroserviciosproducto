package com.everis.product.controller;

import com.everis.product.dto.DefaultDto;
import com.everis.product.dto.ResponseDto;
import com.everis.product.dto.RequestDto;
import com.everis.product.dto.ResponseGetByIdDto;
import com.everis.product.entity.ProducEntity;
import com.everis.product.mapper.ProductMapper;
import com.everis.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

     @PostMapping("/product")
    public ResponseDto insert(@RequestBody RequestDto request){
        //ProducEntity productEntity = ProductMapper.MAPPER.mapRequestToEntity(request);
        //ProducEntity savedProductEntity = productService.save(productEntity);
        return ProductMapper.MAPPER.mapEntityToResponseDto(productService.save(ProductMapper.MAPPER.mapRequestToEntity(request)));
    }

    @GetMapping("/product/{id}")
    public ResponseGetByIdDto getById(@PathVariable("id") Long id){
        ProducEntity productEntity = productService.getById(id);
        return ProductMapper.MAPPER.mapEntityToResponseGetByIdDto(productEntity);
    }

    @GetMapping("/products")
    public List<DefaultDto> getAll(){
         //Iterable<ProducEntity> listaProductos = productService.getAll();
         return ProductMapper.MAPPER.mapListEntityToDefaultDto(productService.getAll());

    }

    @DeleteMapping("/productdelete/{id}")
    public void eliminarProdudcto(@PathVariable("id") Long id){

        productService.remove(id);
    }
}
