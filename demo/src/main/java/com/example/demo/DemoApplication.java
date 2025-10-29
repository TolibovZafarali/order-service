package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		var heavyResource = context.getBean(HeavyResource.class);
//		var heavyResource2 = context.getBean(HeavyResource.class);
		var orderService = context.getBean(OrderService.class);
		var orderService2 = context.getBean(OrderService.class);

		context.close();
//		orderService.placeOrder();

//		for (String name : context.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}
//
//		System.out.println("Total beans: " + context.getBeanDefinitionCount());
	}

}
