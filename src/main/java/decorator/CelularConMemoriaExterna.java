package decorator;

public class CelularConMemoriaExterna extends Decorator {


    public CelularConMemoriaExterna(IMarca componente){
        super(componente);
    }


    public void aumentar(){
        super.anadirMemoria();

    }




}
