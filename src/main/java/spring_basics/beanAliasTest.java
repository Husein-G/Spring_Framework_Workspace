package spring_basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanAliasTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanAliasConfig.xml");
        HelloWorld object1 = (HelloWorld) context.getBean("main");
        object1.sayHello();

        HelloWorld object2 = (HelloWorld) context.getBean("firstAlias");
        object2.sayHello();

        HelloWorld object3 = (HelloWorld) context.getBean("secondAlias");
        object3.sayHello();

        HelloWorld object4 = (HelloWorld) context.getBean("thirdAlias");
        object4.sayHello();

        HelloWorld object5 = (HelloWorld) context.getBean("fourthAlias");
        object5.sayHello();

        HelloWorld object6 = (HelloWorld) context.getBean("fifthAlias");
        object6.sayHello();
    }
}
