package com.sa.ims.models;

import com.sa.ims.models.interfaces.Breakable;

public class FragileItem extends InventoryItem implements Breakable {

	public FragileItem(String name, String description, double price, int quantity) {
		super(name, description, ItemCategories.FRAGILE, price, quantity);
	}

	@Override
	public void breakItem() {
		System.out.printf("The %s is broken", name);
		setQuantity(getQuantity()-1);
	}
}
