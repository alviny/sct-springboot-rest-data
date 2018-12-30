package com.sct.repository;

import org.springframework.data.repository.CrudRepository;

import com.sct.entity.Item;

public interface ItemRepository extends CrudRepository<Item,Long> {

}
