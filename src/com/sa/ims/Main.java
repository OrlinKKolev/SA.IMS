package com.sa.ims;

import com.sa.ims.fileOperations.CSVReader;
import com.sa.ims.fileOperations.CSVWriter;
import com.sa.ims.fileOperations.CustomReader;
import com.sa.ims.fileOperations.CustomWriter;
import com.sa.ims.models.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Serializable> items;
		items = new ArrayList<>();
		CustomWriter writer = new CSVWriter();
		CustomReader reader = new CSVReader();
		var resources = reader.read("./src/resources/files/items.csv");
		System.out.println(items);
		System.out.println(resources);

		InventoryItem item1 = new ElectronicsItem("Calculator", "Device for calculus", 13.40, 1);
		InventoryItem item2 = new GroceryItem("Bananas", "Delicious tropical fruit", 0.64, 12);
		InventoryItem item3 = new FragileItem("Vase", "Small vase for single flower", 2.75, 10);
		items.add(item1);
		items.add(item2);
		items.add(item3);
		writer.write(items, "./src/resources/files/items.csv");
	}
}
