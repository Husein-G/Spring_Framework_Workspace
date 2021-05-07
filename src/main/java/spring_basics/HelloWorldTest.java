package spring_basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("src.main.java.spring_basics.SpringConfigFile.xml");
        HelloWorld greetObject = (HelloWorld) context.getBean("welcomeBean");
        greetObject.welcome();
    }
}