package com.ecomm.dao;

import org.springframework.data.repository.CrudRepository;

import com.ecomm.entity.OrderEntity;

public interface OrderDAO extends CrudRepository<OrderEntity, Integer> {

}
