package com.everis.product.repository;

import com.everis.product.entity.ProducEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProducEntity, Long> {


}
