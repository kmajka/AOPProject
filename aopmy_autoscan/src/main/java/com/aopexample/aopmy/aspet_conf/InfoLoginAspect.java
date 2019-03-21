package com.aopexample.aopmy.aspet_conf;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InfoLoginAspect {

    @Before("execution(* com.aopexample.aopmy.library.Login.show(..))")
    public void BeforeLogin()
    {
        System.out.println("start login...");
    }

    @After("execution(* com.aopexample.aopmy.library.Login.show(..))")
    public void AfterLogin()
    {
        System.out.println("end login...");
    }

}
