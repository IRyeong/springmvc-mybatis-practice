package com.sample.product.dto;

public class ProductDTO {
	int id;
	String name;
	int price;
	String brand;

	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(int id, String name, int price, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}

}
