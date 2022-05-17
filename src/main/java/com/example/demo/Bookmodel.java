package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Bookmodel {
	private String Name;
	private int price;
	private String Aname;
	
	Bookmodel(String name,int amt,String author){
		Name = name;
		price = amt;
		Aname = author;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	
	@Override
	public String toString() {
		return "Book Details [name : " + Name + ", price : " + price + " Author's name : "+ Aname +"]";
	}
}
