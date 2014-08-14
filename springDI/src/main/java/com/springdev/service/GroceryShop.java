package com.springdev.service;

public class GroceryShop implements ShopService{

	public void purchase(String items, float amt) {
		System.out.println("purchasing Grocery "+items+" for "+amt);
		
	}

	public void sales(String items, float amt) {
		System.out.println("sale Grocery "+items+" for "+amt);
		
	}

}
