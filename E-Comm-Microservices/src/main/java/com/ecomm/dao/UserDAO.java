package com.ecomm.dao;

import org.springframework.data.repository.CrudRepository;

import com.ecomm.entity.UserEntity;

public interface UserDAO extends CrudRepository<UserEntity, Integer>{

}
