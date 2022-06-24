package com.jst.hrms.Entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     private Integer id;
     private String name;
     private float price;
     private String type;
     private byte[] picture;
     
     public Menu() {}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "MenuEntity [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", picture="
				+ Arrays.toString(picture) + "]";
	}
	public Menu(Integer id, String name, float price, String type, byte[] picture) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.picture = picture;
	}
     
     
}
