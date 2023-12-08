package com.everis.product.repository;

import com.everis.product.entity.ProducEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProducEntity, Long> {


}
