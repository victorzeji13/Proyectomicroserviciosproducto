package com.everis.product.controller;

import com.everis.product.entity.ProducEntity;
import com.everis.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;
    @GetMapping("/products")
    public Iterable<ProducEntity> getAll(){
       return repository.findAll();
    }

    @PostMapping("/product")
    public String insert(){
        ProducEntity producEntity = new ProducEntity();
        producEntity.setName("keyboard");
        producEntity.setDescription("Avarage office keyboard");
        producEntity.setActive(Boolean.TRUE);
        repository.save(producEntity);
        return "Product insert";
    }
}
