package visitor;



public class SantaCruz implements IDepartamento {

    String nombre = "Santa Cruz";
    int número = 20;
    int provincias= 20;
    int numeroHabitantes = 1020;
    String clima= "Templado";
    int dineroPorTurismo = 400;

    public SantaCruz(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public int getProvincias() {
        return provincias;
    }

    public void setProvincias(int provincias) {
        this.provincias = provincias;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getDineroPorTurismo() {
        return dineroPorTurismo;
    }

    public void setDineroPorTurismo(int dineroPorTurismo) {
        this.dineroPorTurismo = dineroPorTurismo;
    }

    @Override
    public void recibir(ITurista turista) {
        System.out.println("Turista visita "+getNombre()+", Bolivia");
        turista.visitar(this);
    }
}
