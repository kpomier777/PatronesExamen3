package bridge;

public class Client {

    public static  void main(String[]ags){

        Whatapp whatapp= new Whatapp();
        Twitter twitter= new Twitter();

        SistemaEscuela sistemaEscuela= new SistemaEscuela(whatapp);
        sistemaEscuela.setNombre("Nombre escuela");
        sistemaEscuela.setCapacidad(8);
        String[] nombres= new String[] {"Kevin", "Lit"};
        sistemaEscuela.setEstudiantes(nombres);
        sistemaEscuela.setRequisitos("Todos los requisistos");
        sistemaEscuela.mostrarDatos();

        SistemaUniversidad sistemaUniversidad = new SistemaUniversidad(twitter);
        sistemaUniversidad.setNombre("Nombre escuela");
        sistemaUniversidad.setCapacidad(8);

        sistemaUniversidad.setEstudiantes(nombres);
        sistemaUniversidad.setRequisitos("Todos los requisistos");
        sistemaUniversidad.mostrarDatos();


    }
}
