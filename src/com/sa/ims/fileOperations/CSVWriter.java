package com.sa.ims.fileOperations;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class CSVWriter implements CustomWriter {
	@Override
	public void write(List<Serializable> items, String filename) {
		try (FileWriter writer = new FileWriter(filename)) {
			for (Serializable item : items) {
				writer.write(item.toString() + "\n");
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}


}
