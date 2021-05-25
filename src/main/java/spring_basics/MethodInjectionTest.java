package spring_basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodInjectionTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SingletonBean singleton = (SingletonBean) context.getBean("singletonBean");
        PrototypeBean prototypeBeanA = singleton.getPrototypeBean();
        PrototypeBean prototypeBeanB = singleton.getPrototypeBean();
        System.out.println(prototypeBeanA);
        System.out.println(prototypeBeanB);
        System.out.println("Is prototypeBeanA and prototypeBeanB same? " + (prototypeBeanA==prototypeBeanB));
    }
}