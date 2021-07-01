package decorator;

public class CelularConTemplado extends Decorator {


    public CelularConTemplado(IMarca componente){
        super(componente);
    }



    public void aumentar(){
        super.anadirVideoTemplado();
    }




}
