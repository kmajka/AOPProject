package com.aopexample.aopmy.aspet_conf;

public class InfoLoginAspect {

    public void BeforeLogin()
    {
        System.out.println("start login...");
    }
    public void AfterLogin()
    {
        System.out.println("end login...");
    }

}
