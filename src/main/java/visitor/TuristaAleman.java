package visitor;




import java.util.Random;

public class TuristaAleman implements ITurista {
    private int ci;
    private String nombre;
    private int capital;

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TuristaAleman(int capital) {
        this.capital = capital;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }


    Random rand = new Random();
    int upperbound = 101;
    int int_random = rand.nextInt(upperbound);


    @Override
    public void visitar(LaPaz laPaz) {
        setCapital(getCapital()-int_random);

            System.out.println("El turista gasta "+ getCapital()+" Bs. en La Paz");


    }

    @Override
    public void visitar(Cochabamba cochabamba) {
        setCapital(getCapital()-(10*cochabamba.getNumeroHabitantes()/100));

            System.out.println("El turista gasta "+ getCapital()+" Bs. en Conchabamba");



    }

    @Override
    public void visitar(SantaCruz santaCruz) {
        setCapital(getCapital()-(50*santaCruz.getProvincias()/100));

            System.out.println("El turista gasta "+ getCapital()+" Bs. en Santa Cruz");

    }
}
