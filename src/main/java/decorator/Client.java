package decorator;

public class Client {
    public static void main(String[] args) {
        CelularApple personajebasico= new CelularApple("Kevin",1);
        Juego juego = personajebasico;
        juego = new CelularConCarcasa(juego);
        juego = new decorator.Practica.practica.PersonajeConEscudo(juego);
        juego = new PesonajeConCuracion(juego);

        juego.operation(personajebasico);
    }
}
