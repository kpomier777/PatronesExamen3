package bridge;

public class ConcreteAbstraction implements bridge.basic.IAbstraction {

    private bridge.basic.Implementor implemento= new ConcreteImplementorA();

    public ConcreteAbstraction(bridge.basic.Implementor implemento){
        this.implemento=implemento;
    }

    @Override
    public void metodo1() {
        System.out.println("ConcreteAbstraction > metodo1");
        implemento.operation1();
        implemento.operation2();
        implemento.operation3();
    }

    @Override
    public void metodo2() {
        System.out.println("ConcreteAbstraction > metodo2");
        implemento.operation2();
    }
}
