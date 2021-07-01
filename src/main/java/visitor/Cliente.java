package visitor;

public class Cliente {

    public static void main (String[]args){
        ElementConcrete1 elementConcrete1 = new ElementConcrete1();
        ElementConcrete2 elementConcrete2 = new ElementConcrete2();
        visitor.basic.ElementConcrete3 elementConcrete3 = new visitor.basic.ElementConcrete3();

        ConcreteVisitante visitante = new ConcreteVisitante();

        System.out.println("--------------");
        elementConcrete1.accept(visitante);
        System.out.println("--------------");
        elementConcrete2.accept(visitante);
        System.out.println("--------------");
        elementConcrete3.accept(visitante);
        System.out.println("--------------");


    }
}
