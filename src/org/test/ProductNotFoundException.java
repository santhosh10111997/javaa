package org.test;

public class ProductNotFoundException extends Exception{
	
	@Override
	public String getMessage() {
		
		return ("product not available in search list");
	
	}
	
	
}
