package spring_basics;

public class PrototypeBean {
    private String message;

    public PrototypeBean() {
        System.out.println("Prototype Bean is instantiated");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PrototypeBean getPrototypeBean() {
        return this;
    }
}