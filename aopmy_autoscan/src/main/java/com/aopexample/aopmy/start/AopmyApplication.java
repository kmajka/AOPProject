package com.aopexample.aopmy.start;

import com.aopexample.aopmy.library.Login;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aopexample.aopmy")
public class AopmyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(AopmyApplication.class, args);

		Login login = ctx.getBean(Login.class);
		login.show();
	}

}
