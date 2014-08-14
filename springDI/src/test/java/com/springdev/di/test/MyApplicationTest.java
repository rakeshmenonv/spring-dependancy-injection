package com.springdev.di.test;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.springdev.consume.MyApplication;
import com.springdev.service.ShopService;

@ComponentScan(value="com.springdev.consume")
public class MyApplicationTest {
     
    private AnnotationConfigApplicationContext context = null;
 
    @Bean
    public ShopService getShopService() {
        return new ShopService(){
 
            public void purchase(String items, float amt) {
				System.out.println("moking test");
				
			}

			public void sales(String items, float amt) {
				System.out.println("moking test");
				
			}
             
        };
    }
 
    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
    }
     
    @After
    public void tearDown() throws Exception {
        context.close();
    }
 
    @Test
    public void test() {
        MyApplication app = context.getBean(MyApplication.class);
        Assert.assertTrue(app.doShopping("ttt", 50000));
    }
 
}
