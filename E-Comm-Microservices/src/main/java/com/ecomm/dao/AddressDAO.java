package com.ecomm.dao;

import org.springframework.data.repository.CrudRepository;

import com.ecomm.entity.AddressEntity;

public interface AddressDAO extends CrudRepository<AddressEntity, Integer> {

}
