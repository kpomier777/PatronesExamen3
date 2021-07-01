package bridge;

public class ConcreteImplementorA implements bridge.basic.Implementor {
    @Override
    public void operation1() {
        System.out.println("ConcreteImplementorA > operation1 ");
    }

    @Override
    public String operation2() {
        System.out.println("ConcreteImplementorA > operation2 ");
        return null;
    }

    @Override
    public int operation3() {
        System.out.println("ConcreteImplementorA > operation3 ");
        return 0;
    }
}
