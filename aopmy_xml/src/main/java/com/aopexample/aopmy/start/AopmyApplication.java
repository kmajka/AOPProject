package com.aopexample.aopmy.start;

import com.aopexample.aopmy.library.Login;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AopmyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

		Login login = ctx.getBean(Login.class);
		login.show();
	}

}
