package com.sa.ims.models;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class InventoryItem extends AbstractItem implements Serializable {
	String name;
	String description;
	ItemCategories category;
	double price;
	int quantity;
	public InventoryItem(String name, String description, ItemCategories category, double price, int quantity) {
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String getDescription() {
		return this.description;
	}
	@Override
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public void displayDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Descr: " + this.description);
		System.out.println("Category: " + this.category);
		System.out.println("Price: " + this.price);
		System.out.println("Quantity: " + this.quantity);
		System.out.printf("Value: %.02f%n", +calculateValue());
	}
	@Override
	public double calculateValue() {
		return this.price * this.quantity;
	}
	@Override
	public double getPrice() {
		return this.price;
	}
	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void sell(int quantity) {
		this.quantity=this.quantity-quantity;
	}

	@Override
	public void setCategory(ItemCategories category) {
		this.category=category;
	}
	@Override
	public ItemCategories getCategory() {
		return this.category;
	}

	@Override
	public String toString() {

		return this.name+","+this.description+","+this.category+","+this.price+","+this.quantity;
	}
}
