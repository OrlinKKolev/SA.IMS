package com.sa.ims.models.interfaces;

public interface Breakable {
	void breakItem();

	static boolean isBreakable(){
		return true;
	}
}

