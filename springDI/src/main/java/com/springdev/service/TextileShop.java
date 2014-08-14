package com.springdev.service;

public class TextileShop implements ShopService{

	public void purchase(String items, float amt) {
		
		System.out.println("purchasing Textile "+items+" for "+amt);
		
		
	}

	public void sales(String items, float amt) {
		System.out.println("sale Textile "+items+" for "+amt);
		
	}

}
