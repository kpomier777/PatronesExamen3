package decorator;

public class CelularConCarcasa extends decorator.Practica.practica.Decorator {


    public CelularConCarcasa(decorator.Practica.practica.Juego componente){
        super(componente);
    }



    public void operation(decorator.Practica.practica.PersonajeBasico cuentaBasic){
        super.operation(cuentaBasic);

        if (cuentaBasic.getNivel()>=1){
            cuentaBasic.setPuntosAtaque(cuentaBasic.getPuntosAtaque()+30);
            cuentaBasic.setNivel(cuentaBasic.getNivel()*2);
            cuentaBasic.setArmas("Espada, Hacha, Escopeta");
            System.out.println("Personaje con armas: ");
            System.out.println("Nombre: "+cuentaBasic.getNombre());
            System.out.println("NIvel: "+cuentaBasic.getNivel());
            System.out.println("Armas: "+cuentaBasic.getArmas());
            System.out.println("Porcentaje de armadura: "+cuentaBasic.getPorcentajeArmadura()+"%");
            System.out.println("Puntos de ataque: "+cuentaBasic.getPuntosAtaque());
            System.out.println("Puntos de defenza: "+cuentaBasic.getPuntosDefensa());
            System.out.println("Puntos de regenración de vida: "+cuentaBasic.getPuntosRegeneracionVida());

        }else {
            System.out.println("Este personaje no puede tener armas");
        }
    }




}
