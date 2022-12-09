package com.example.Inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Inventory.model.Item;

public interface InventoryRepo
	extends MongoRepository<Item, Integer> {
}
