package com.mahendra.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MahendraCar")
public class Mahendra {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="Mahendra_Price")
	private double price;
	@Column(name="Mahendra_Color")
	private String color;
	@Column(name="Mahendra_Model")
	private String model;
	
   // normal constructor
	public Mahendra() {
		super();
		// TODO Auto-generated constructor stub
	}
	
  // Field constructor	
	public Mahendra(double price, String color, String model) {
		super();
		this.price = price;
		this.color = color;
		this.model = model;
	}

  // setter And getter Methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	// tostring method
	@Override
	public String toString() {
		return "Mahendra [id=" + id + ", price=" + price + ", color=" + color + ", model=" + model + "]";
	}
	
	
	

}
