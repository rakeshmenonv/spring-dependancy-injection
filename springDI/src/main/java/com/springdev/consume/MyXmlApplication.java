package com.springdev.consume;

import com.springdev.service.ShopService;

public class MyXmlApplication {
private ShopService shopService;
	

//constructor-based dependency injection
	/*public MyXmlApplication(ShopService svc) {
	 this.shopService = svc;
	}*/
	
	public void setShopService(ShopService shopService) {
	this.shopService = shopService;
}

	public void doShopping(String items,float amt){
		shopService.purchase(items, amt);
	}
}
