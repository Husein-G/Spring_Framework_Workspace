package Bean_Scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonBeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SingletonBeanScopeConfig.xml");
        SingletonBean singletonBeanA = (SingletonBean) context.getBean("singletonBean");
        System.out.println(singletonBeanA);
        singletonBeanA.setMessage("Hello World");
        SingletonBean singletonBeanB = (SingletonBean) context.getBean("singletonBean");
        System.out.println(singletonBeanB);
        System.out.println(singletonBeanA == singletonBeanB);
        System.out.println(singletonBeanB.getMessage());
    }
}
