package com.example.Inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Inventory.model.Item;
import com.example.Inventory.repository.InventoryRepo;

@RestController
public class ItemController {
	

	// Class

		@Autowired
		private InventoryRepo repo;

		@PostMapping("/addItem")
		public String saveItem(@RequestBody Item item){
			repo.save(item);
			
			return "Added Successfully";
		}

		@GetMapping("/items")
		public List<Item> getItems() {
			
			return repo.findAll();
		}
		@GetMapping("/items/{id}")  
		public Item getItems(@PathVariable("id") int id)   
		{  
		return repo.findById(id).get();  
		}  

		@DeleteMapping("/delete/{id}")
		public String deleteItem(@PathVariable int id){
			repo.deleteById(id);
			
			return "Deleted Successfully";
		}
		

	}

