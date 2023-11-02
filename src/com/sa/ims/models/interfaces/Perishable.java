package com.sa.ims.models.interfaces;

public interface Perishable {

	void perish();

	static boolean isPerishable(){
		return true;
	}
}

