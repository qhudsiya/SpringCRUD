package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Bookcontroller {

	@Autowired
	BookService bkservice;
	
	@GetMapping("/books")
	public List<Bookmodel> AllBooks(){
		return bkservice.FindAll();
	}
	
	@GetMapping("/book/{id}")
	public Bookmodel bookById(@PathVariable String id) {
		return bkservice.FindByid(id);
	}
	
	@PostMapping("/book/{id}")
	public void Savebook(@RequestBody Bookmodel bm) {
		bkservice.AddBook(bm);
	}
	
	@DeleteMapping("/book/{id}")
	public void DeleteBook(@PathVariable String name) {
		bkservice.DeleteBook(name);
	}
	
	@PutMapping("/book/{id}")
	public void UpdateBook(@RequestBody Bookmodel bm,@PathVariable String id) {
		bkservice.Updatebook(bm, id);
	}
}
