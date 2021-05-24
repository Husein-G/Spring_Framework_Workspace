package spring_basics;

public class ExampleBean {
    private final int years;
    private final String ultimateAnswer;
    private ExampleBean beanOne;
    private ExampleBean beanTwo;
    private int i;
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }
    public void setBeanOne(ExampleBean beanOne) {
        this.beanOne = beanOne;
    }

    public void setBeanTwo(ExampleBean beanTwo) {
        this.beanTwo = beanTwo;
    }

    public void setIntegerProperty(int i) {
        this.i = i;
    }
}
