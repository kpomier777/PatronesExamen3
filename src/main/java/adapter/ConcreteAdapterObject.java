package adapter;

public class ConcreteAdapterObject implements adapter.basic.IAdapter {

    private adapter.basic.ConcreteObject adaptee = new adapter.basic.ConcreteObject();

    public ConcreteAdapterObject(adapter.basic.ConcreteObject adaptee){
          this.adaptee=adaptee;
    }

    public adapter.basic.ConcreteObject getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(adapter.basic.ConcreteObject adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void metodo1() {
        System.out.println("*** Adaptee > metodo1");
        adaptee.metodoA();
        adaptee.metodoB();
    }

    @Override
    public String metodo2() {
        // logica
        System.out.println("*** Adaptee > metodo2");
        adaptee.metodoC();
        return null;
    }

    @Override
    public int metodo3() {
        // logica
        System.out.println("*** Adaptee > metodo3");
        adaptee.metodoD();
        return 0;
    }
}
