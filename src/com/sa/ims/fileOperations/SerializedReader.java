package com.sa.ims.fileOperations;

import com.sa.ims.models.InventoryItem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializedReader implements CustomReader {

	@Override
	public List<? extends Serializable> read(String filename) {
		List<InventoryItem> items = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			while (true) {
				try {
					InventoryItem item = (InventoryItem) ois.readObject();
					items.add(item);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					break;
				} catch (IOException e) {
					e.printStackTrace();
					break;
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return items;
	}
}
