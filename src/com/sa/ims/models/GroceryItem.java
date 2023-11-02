package com.sa.ims.models;

import com.sa.ims.models.interfaces.Perishable;

public class GroceryItem extends InventoryItem implements Perishable {


	public GroceryItem(String name, String description, double price, int quantity) {
		super(name, description, ItemCategories.GROCERIES, price, quantity);
	}

	@Override
	public void perish() {
		System.out.printf("The %s have been perished", name);
		setQuantity(getQuantity()-1);
	}
}
