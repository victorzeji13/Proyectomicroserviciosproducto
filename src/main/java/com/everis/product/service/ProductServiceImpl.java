package com.everis.product.service;

import com.everis.product.entity.ProducEntity;
import com.everis.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

   @Autowired
   private ProductRepository productRepository;

    @Override
    public Iterable<ProducEntity> getAll() {
        return productRepository.findAll();
    }

    @Override
    public ProducEntity save(ProducEntity producEntity) {
        return productRepository.save(producEntity);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public ProducEntity getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }


}
