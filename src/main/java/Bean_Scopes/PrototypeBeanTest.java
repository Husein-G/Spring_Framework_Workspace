package Bean_Scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeBeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("PrototypeBeanScopeConfig.xml");
        PrototypeBean prototypeBeanA = (PrototypeBean) context.getBean("prototypeBean");
        System.out.println(prototypeBeanA);
        PrototypeBean prototypeBeanB = (PrototypeBean) context.getBean("prototypeBean");
        System.out.println(prototypeBeanB);
        System.out.println(prototypeBeanB == prototypeBeanA);
        prototypeBeanB.setMessage("Hello how are you?");
        System.out.println(prototypeBeanA.getMessage());
    }
}