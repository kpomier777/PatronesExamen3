package decorator;

public class Decorator implements decorator.basic.Component {

    private decorator.basic.Component component;

    public Decorator(decorator.basic.Component component){
        this.component=component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
