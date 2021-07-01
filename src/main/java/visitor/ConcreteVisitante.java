package visitor;

public class ConcreteVisitante implements  IVisit {

    @Override
    public void visit(visitor.basic.ElementConcrete1 elementConcrete1) {
        System.out.println(" **** Algoritmo ****");
        System.out.println("  para el ElementConcrete1 ");
    }

    @Override
    public void visit(visitor.basic.ElementConcrete2 elementConcrete2) {
        System.out.println(" **** Algoritmo ****");
        System.out.println("  para el ElementConcrete2 ");
    }

    @Override
    public void visit(visitor.basic.ElementConcrete3 elementConcrete3) {
        System.out.println(" **** Algoritmo ****");
        System.out.println("  para el ElementConcrete3 ");
    }
}
