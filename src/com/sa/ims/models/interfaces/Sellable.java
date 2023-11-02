package com.sa.ims.models.interfaces;

public interface Sellable {


	double getPrice();

	void setPrice(double price);

	void sell(int quantity);

}

