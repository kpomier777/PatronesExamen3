package adapter;

public class Client {
    public static void main (String [] arggggg){
        adapter.basic.ConcreteObject adaptee = new adapter.basic.ConcreteObject();

        adapter.basic.ConcreteAdapter1 concreteAdapter1 = new adapter.basic.ConcreteAdapter1();
        adapter.basic.ConcreteAdapter2 concreteAdapter2 = new adapter.basic.ConcreteAdapter2();
        ConcreteAdapter3 concreteAdapter3 = new ConcreteAdapter3();
        ConcreteAdapterObject concreteAdapterObject = new ConcreteAdapterObject(adaptee);

        concreteAdapter1.metodo1();
        concreteAdapter2.metodo1();
        concreteAdapter3.metodo1();
        concreteAdapterObject.metodo1();
        concreteAdapterObject.metodo2();
        concreteAdapterObject.metodo3();
    }

}
