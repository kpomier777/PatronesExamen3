package bridge;

public class Client {

    public static  void main(String[]ags){

        bridge.basic.ConcreteAbstraction concreteAbstraction = new bridge.basic.ConcreteAbstraction(new ConcreteImplementorA());
        concreteAbstraction.metodo1();
        concreteAbstraction.metodo2();

    }
}
