package com.sa.ims.models;

import com.sa.ims.models.interfaces.*;

public abstract class AbstractItem implements Categorizable, Item, Sellable {

	public abstract int getQuantity() ;
	public abstract void setQuantity(int quantity);

	public abstract String getDescription();

	public abstract void setDescription(String description);

	@Override
	public abstract double getPrice();
	@Override
	public abstract void setPrice(double price);
;

}
