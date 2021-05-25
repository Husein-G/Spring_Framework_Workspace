package spring_basics;

public abstract class SingletonBean {
    public SingletonBean() {
        System.out.println("Singleton Bean is instantiated");
    }
    public abstract PrototypeBean getPrototypeBean();
}
