package spring_basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImportElementTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ImportElementConfig.xml");
        HelloWorld welcomeObject = (HelloWorld) context.getBean("welcomeBean");
        welcomeObject.sayHello();
        HelloWorld otherWelcomeObject = (HelloWorld) context.getBean("greetingBean");
        otherWelcomeObject.sayHello();
    }
}
