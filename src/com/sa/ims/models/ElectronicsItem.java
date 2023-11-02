package com.sa.ims.models;

import com.sa.ims.models.interfaces.Breakable;

public class ElectronicsItem extends InventoryItem implements Breakable {


	public ElectronicsItem(String name, String description, double price, int quantity) {
		super(name, description, ItemCategories.ELECTRONICS, price, quantity);
		}

	@Override
	public void breakItem() {
		System.out.printf("The %s is broken", name);
	}
}


