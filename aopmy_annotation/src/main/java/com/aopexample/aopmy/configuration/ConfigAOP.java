package com.aopexample.aopmy.configuration;

import com.aopexample.aopmy.aspet_conf.InfoLoginAspect;
import com.aopexample.aopmy.library.Login;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ConfigAOP {

    @Bean
    public Login getLogin() {
        return new Login();
    }

    @Bean
    public InfoLoginAspect getInfoLoginAspect() {
        return new InfoLoginAspect();
    }
}
