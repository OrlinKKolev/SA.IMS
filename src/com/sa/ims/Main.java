package com.sa.ims;

import com.sa.ims.fileOperations.CSVReader;
import com.sa.ims.fileOperations.CSVWriter;
import com.sa.ims.fileOperations.Reader;
import com.sa.ims.fileOperations.Writer;
import com.sa.ims.models.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Serializable> items;
		items = new ArrayList<>();
		Writer wr = new CSVWriter();
		wr.write(items, "./resources/files/test01.csv");
		Reader r = new CSVReader();
		var res = r.read("./resources/files/items.csv");
		System.out.println(items);
		System.out.println(res);

//
//		InventoryItem item1 = new ElectronicsItem("Calculator", "Device for calculus", 13.40, 1);
//		InventoryItem item2 = new GroceryItem("Bananas", "Delicious tropical fruit", 0.64, 12);
//		InventoryItem item3 = new FragileItem("Vase", "Small vase for single flower", 2.75, 10);
//		item1.displayDetails();
//		item1.setDescription("ELKA");
//		System.out.println(item1.getDescription());
//		item1.setQuantity(13);
//		System.out.println(item1.getQuantity());
//		System.out.printf("%.02f%n", item1.calculateValue());
//
//
//		System.out.println(item1.getCategory());
//		item1.setCategory(ItemCategories.GROCERIES);
//		System.out.println(item1.getCategory());
//		item1.displayDetails();
//		System.out.println(item1);
//		System.out.println(item1.calculateValue());
//		System.out.println(item2.calculateValue());
//		System.out.println(item3.calculateValue());
	}
}
