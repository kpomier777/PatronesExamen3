package decorator;

public class Decorator implements IMarca {
    private IMarca componente;

    public Decorator(IMarca componente){
        this.componente = componente;

    }
    @Override
    public void aumentar() {
        componente.aumentar();
    }

    @Override
    public int getPrecio() {
        return componente.getPrecio();
    }

    @Override
    public void setPrecio(int precio) {
this.componente.setPrecio(precio);
    }

    @Override
    public int getAlmacenamiento() {
        return componente.getAlmacenamiento();
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
this.componente.setAlmacenamiento(almacenamiento);
    }

    public void anadirCarcasa(){
        System.out.println("Se esta añadiendo carcasa al celular de " + 50 + " Bs");
        componente.setPrecio(componente.getPrecio() + 50);
        componente.aumentar();
    };
    public void anadirVideoTemplado(){
        System.out.println("Se esta añadiendo vidrio templado al celular de " + 100 + " Bs");
        componente.setPrecio(componente.getPrecio() + 100);
        componente.aumentar();
    };
    public void anadirMemoria(){
        System.out.println("Se esta añadiendo memoria externa al celular de " + 500 + " Bs y "+1020+" GB de almacenamiento");
        componente.setPrecio(componente.getPrecio() + 500);
        componente.setAlmacenamiento(componente.getPrecio() + 1020);
        componente.aumentar();
    };
}
