package decorator;

public class CelularConTemplado extends Decorator {


    public CelularConTemplado(Juego juego){
        super(juego);
    }

    public void operation(CelularApple cuentaBasic){
        super.operation(cuentaBasic);
        if (cuentaBasic.getNivel()>=2){
            cuentaBasic.setPuntosDefensa(cuentaBasic.getPuntosDefensa()+35);
            cuentaBasic.setPorcentajeArmadura(cuentaBasic.getPorcentajeArmadura()+10);
            System.out.println("Personaje con escudo: ");
            System.out.println("Nombre: "+cuentaBasic.getNombre());
            System.out.println("NIvel: "+cuentaBasic.getNivel());
            System.out.println("Armas: "+cuentaBasic.getArmas());
            System.out.println("Porcentaje de armadura: "+cuentaBasic.getPorcentajeArmadura()+"%");
            System.out.println("Puntos de ataque: "+cuentaBasic.getPuntosAtaque());
            System.out.println("Puntos de defenza: "+cuentaBasic.getPuntosDefensa());
            System.out.println("Puntos de regenración de vida: "+cuentaBasic.getPuntosRegeneracionVida());
        }else {
            System.out.println("Este personaje todavia no puede recibir escudo");
        }


    }




}
