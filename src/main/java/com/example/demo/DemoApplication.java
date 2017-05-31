package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//ApplicationContext context= SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		Title t= context.getBean("titleShow",Title.class);
		t.show();
		
		/*Title t1= context.getBean("titleShow1",Title.class);
		t1.show();
		*/
	}
}
