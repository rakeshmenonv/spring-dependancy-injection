package com.springdev.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import com.springdev.service.GroceryShop;
import com.springdev.service.ShopService;
import com.springdev.service.TextileShop;
@Configuration
@ComponentScan(value={"com.springdev.consume"})
public class DIConfiguration {
 
    @Bean
    public ShopService getShopService(){
        return new TextileShop();
    }
} 