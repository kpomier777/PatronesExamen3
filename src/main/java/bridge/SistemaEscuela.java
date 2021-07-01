package bridge;

public class SistemaEscuela implements ISistemas {

    private IRed redsocial;
    String nombre;
    int capacidad;
    String[] estudiantes;
    String requisitos;

    public SistemaEscuela(IRed redsocial) {
        this.redsocial = redsocial;
    }

    public IRed getRedsocial() {
        return redsocial;
    }

    public void setRedsocial(IRed redsocial) {
        this.redsocial = redsocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(String[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }



    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Capacidad: "+getNombre());
        for (int i =0; i<getEstudiantes().length;i++ ){
            System.out.println("Studiante: "+getEstudiantes()[i]);
        }
        System.out.println("Requisitos: "+getRequisitos());
        redsocial.publicar(this);
    }
}
