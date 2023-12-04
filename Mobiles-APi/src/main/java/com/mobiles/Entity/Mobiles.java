package com.mobiles.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vivo_Mobiles")
public class Mobiles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double price;
	
	private String modal;
	
	private String colour;

	 // normal constructor
	public Mobiles() {
		super();
		// TODO Auto-generated constructor stub
	}

	 // Field constructor
	public Mobiles(long price, String modal, String colour) {
		super();
		this.price = price;
		this.modal = modal;
		this.colour = colour;
	}

	// setters And getters
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

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return "Mobiles [id=" + id + ", price=" + price + ", modal=" + modal + ", colour=" + colour + "]";
	}

}
