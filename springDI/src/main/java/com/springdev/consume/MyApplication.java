package com.springdev.consume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springdev.service.ShopService;

@Component
public class MyApplication {
	@Autowired
	private ShopService shopService;
	
	public boolean doShopping(String items,float amt){
		shopService.purchase(items, amt);
		return true;
	}

}
