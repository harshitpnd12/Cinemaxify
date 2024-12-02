package com.cinemaxify;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        User self = context.getBean("self", User.class);
        self.setUserDetails("Harshit", 25, 9876543210L, "123 Street, City");
        self.getUserDetails();
        System.out.println("User Plan: " + self.getUserPlan().getPlanName());

        User spouse = context.getBean("spouse", User.class);
        spouse.setUserDetails("Ananya", 24, 9876543211L, "456 Avenue, City");
        spouse.getUserDetails();
        System.out.println("User Plan: " + spouse.getUserPlan().getPlanName());
    }
}
