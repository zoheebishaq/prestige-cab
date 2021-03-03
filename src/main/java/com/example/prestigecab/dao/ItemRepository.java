package com.example.prestigecab.dao;


import com.example.prestigecab.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Long> {
}
