package com.aopexample.aopmy.start;

import com.aopexample.aopmy.configuration.ConfigAOP;
import com.aopexample.aopmy.library.Login;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AopmyApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ConfigAOP.class);
		ctx.refresh();

		Login login = ctx.getBean(Login.class);
		login.show();

	}

}
