package com.ecomm.dao;

import org.springframework.data.repository.CrudRepository;

import com.ecomm.entity.ProductEntity;

public interface ProductDAO extends CrudRepository<ProductEntity, Integer> {

}
