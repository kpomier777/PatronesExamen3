package decorator;

public class CelularConCarcasa extends Decorator {


    public CelularConCarcasa(IMarca componente){
        super(componente);
    }



    public void aumentar(){
        super.anadirCarcasa();

    }




}
