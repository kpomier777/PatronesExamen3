package decorator;

public class Decorator implements IMarca {
    private IMarca componente;

    public Decorator(IMarca componente){
        this.componente = componente;

    }

    public void operation(CelularApple cuentaBasic){
        componente.operation(cuentaBasic);
    }

    @Override
    public void aumentar(CelularApple celularBasico) {
        componente.operation(celularBasico);
    }
}
