package beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {

      AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanExample.xml");

      ExampleBean obj = (ExampleBean) context.getBean("helloWorld");
      obj.getMessage();
      context.registerShutdownHook();
   }
}
