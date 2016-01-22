package com.autowiring;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class AutoWirringTest {  
     public static void main(String [] args) {  
          ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Beans.xml");  
          BeanFactory beanFactory = (BeanFactory) applicationContext;  
          LaptopStore laptopStore = (LaptopStore) beanFactory.getBean("laptopStore");  

          System.out.println("Laptop1's trade mark: "+laptopStore.getLaptop1().showTradeMark());  
          System.out.println("Laptop2's trade mark: "+laptopStore.getLaptop2().showTradeMark());  
     }  
}  