package com.springdev.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdev.consume.MyXmlApplication;

public class TestXmlApplication {
	public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MyXmlApplication app = context.getBean(MyXmlApplication.class);
 
        app.doShopping("items", 50000);
 
        // close the context
        context.close();
    }

}
