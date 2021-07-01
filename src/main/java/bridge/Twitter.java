package bridge;

public class Twitter implements IRed {



    @Override
    public void publicar(SistemaEscuela sistemaEscuela) {
        System.out.println("Nombre: "+sistemaEscuela.getNombre());
        System.out.println("Capacidad: "+sistemaEscuela.getNombre());
        for (int i =0; i<sistemaEscuela.getEstudiantes().length;i++ ){
            System.out.println("Studiante: "+sistemaEscuela.getEstudiantes()[i]);
        }
        System.out.println("Requisitos: "+sistemaEscuela.getRequisitos());
    }

    @Override
    public void publicar(SistemaUniversidad sistemaUniversidad) {
        System.out.println("Nombre: "+sistemaUniversidad.getNombre());
        System.out.println("Capacidad: "+sistemaUniversidad.getNombre());
        for (int i =0; i<sistemaUniversidad.getEstudiantes().length;i++ ){
            System.out.println("Studiante: "+sistemaUniversidad.getEstudiantes()[i]);
        }
        System.out.println("Requisitos: "+sistemaUniversidad.getRequisitos());
    }

    @Override
    public void publicar(SistemaColegio sistemaColegio) {
        System.out.println("Nombre: "+sistemaColegio.getNombre());
        System.out.println("Capacidad: "+sistemaColegio.getNombre());
        for (int i =0; i<sistemaColegio.getEstudiantes().length;i++ ){
            System.out.println("Studiante: "+sistemaColegio.getEstudiantes()[i]);
        }
        System.out.println("Requisitos: "+sistemaColegio.getRequisitos());
    }
}
