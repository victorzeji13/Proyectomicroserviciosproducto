package com.everis.product.controller;

import com.everis.product.dto.DefaultDto;
import com.everis.product.dto.ResponseDto;
import com.everis.product.entity.ProducEntity;
import com.everis.product.repository.ProductRepository;
import com.everis.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public List<DefaultDto> getAll(){

        return StreamSupport.stream(productService.getAll().spliterator() , false).map(producEntity -> {
            return DefaultDto.builder().nombre(producEntity.getName()).descripcion(producEntity.getDescription()).activo(producEntity.getActive()).precio(producEntity.getPrice()).codigo(producEntity.getId()).build();
        }).collect(Collectors.toList());
    }

    @PostMapping("/product")
    public ResponseDto insert(@RequestBody ResponseDto request){
        ProducEntity savedProductEntity = productService.save(ProducEntity.builder().active(Boolean.TRUE).name(request.getNombre()).description(request.getDescripcion()).price(request.getPrecio()).build());
        return ResponseDto.builder().codigo(savedProductEntity.getId()).precio(savedProductEntity.getPrice()).nombre(savedProductEntity.getName()).descripcion(savedProductEntity.getDescription()).activo(savedProductEntity.getActive()).build();
    }

    @GetMapping("/product/{id}")
    public ResponseDto getById(@PathVariable("id") Long id){
        ProducEntity productEntity = productService.getById(id);
        return ResponseDto.builder().codigo(productEntity.getId()).precio(productEntity.getPrice()).nombre(productEntity.getName()).descripcion(productEntity.getDescription()).activo(productEntity.getActive()).build();
    }

    @DeleteMapping("/productdelete/{id}")
    public void eliminarProdudcto(@PathVariable("id") Long id){

        productService.remove(id);
    }
}
