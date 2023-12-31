package com.everis.product.service;

import com.everis.product.entity.ProducEntity;

public interface ProductService {
    public Iterable<ProducEntity> getAll();

    public ProducEntity save(ProducEntity producEntity);

    public void remove(Long id);

    public ProducEntity getById(Long id);

}
