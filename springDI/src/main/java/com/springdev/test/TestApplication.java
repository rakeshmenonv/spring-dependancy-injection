package com.springdev.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdev.configuration.DIConfiguration;
import com.springdev.consume.MyApplication;

public class TestApplication {
	 public static void main(String[] args) {
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
	        MyApplication app = context.getBean(MyApplication.class);
	        app.doShopping("items", 10000);
	        //close the context
	        context.close();
	    }

}
