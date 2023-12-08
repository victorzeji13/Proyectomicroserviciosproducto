package com.everis.product.controller;

import com.everis.product.dto.DefaultDto;
import com.everis.product.dto.ResponseDto;
import com.everis.product.dto.RequestDto;
import com.everis.product.dto.ResponseGetByIdDto;
import com.everis.product.entity.ProducEntity;
import com.everis.product.mapper.ProductMapper;
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

     @PostMapping("/product")
    public ResponseDto insert(@RequestBody RequestDto request){
        ProducEntity productEntity = ProductMapper.MAPPER.mapRequestToEntity(request);
        ProducEntity savedProductEntity = productService.save(productEntity);
        return ProductMapper.MAPPER.mapEntityToResponseDto(savedProductEntity);
    }

    @GetMapping("/product/{id}")
    public ResponseGetByIdDto getById(@PathVariable("id") Long id){
        ProducEntity productEntity = productService.getById(id);
        return ProductMapper.MAPPER.mapEntityToResponseGetByIdDto(productEntity);
    }

    @DeleteMapping("/productdelete/{id}")
    public void eliminarProdudcto(@PathVariable("id") Long id){

        productService.remove(id);
    }
}
