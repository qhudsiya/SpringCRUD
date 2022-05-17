package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepo rep;
	
	public Bookmodel FindByid(String name) {
		return rep.findbyName(name);
	}
	
	public void AddBook(Bookmodel data) {
		rep.save(data);
	}
	
	public void DeleteBook(String name) {
		rep.deleteById(name);
	}
	
	public List<Bookmodel> FindAll(){
		return rep.findAll();
	}
	
	public void Updatebook(Bookmodel data,String name) {
		Bookmodel bm = rep.findbyName(name);
		bm.setPrice(data.getPrice());
		bm.setAname(data.getAname());
		rep.save(bm);
	}

}
