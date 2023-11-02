package com.sa.ims.fileOperations;

import com.sa.ims.models.InventoryItem;
import com.sa.ims.models.ItemCategories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CSVReader implements CustomReader {

	@Override
	public List<? extends Serializable> read(String filename) {
		List<InventoryItem> products = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			//  TODO check for headers!

			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				//  TODO validations for input data
				products.add(new InventoryItem(values[0], values[1],ItemCategories.valueOf(values[2]), Double.parseDouble(values[3]), Integer.parseInt(values[4])));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return products;
	}
}
