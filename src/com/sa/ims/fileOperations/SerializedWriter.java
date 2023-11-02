package com.sa.ims.fileOperations;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class SerializedWriter implements Writer {
	@Override
	public void write(List<Serializable> items, String filename) {
		try (FileOutputStream fileOut = new FileOutputStream(filename);
			 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
			for (Serializable item : items) {
				objectOut.writeObject(item);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
