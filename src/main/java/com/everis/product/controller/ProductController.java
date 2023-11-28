package com.everis.product.controller;

import com.everis.product.entity.ProducEntity;
import com.everis.product.repository.ProductRepository;
import com.everis.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public Iterable<ProducEntity> getAll(){
       return productService.getAll();
    }

    @PostMapping("/product")
    public ProducEntity insert(){
        ProducEntity producEntity = new ProducEntity();
        producEntity.setName("keyboard");
        producEntity.setDescription("Avarage office keyboard");
        producEntity.setActive(Boolean.TRUE);
        return productService.save(producEntity);
    }
}
