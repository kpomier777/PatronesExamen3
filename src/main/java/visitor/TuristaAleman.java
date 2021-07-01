package visitor;




import java.text.DecimalFormat;

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

¿

    @Override
    public void visitar(LaPaz laPaz) {
        System.out.println("Bolivia> recibir librecambista");
        System.out.println("Convirtiendo "+capital+" Dolares a "+bolivia.getMoneda());
        System.out.println("Total: "+df.format(capital*6.86) +" "+bolivia.getMoneda());
    }

    @Override
    public void visitar(Cochabamba cochabamba) {
        System.out.println("Bolivia> recibir librecambista");
        System.out.println("Convirtiendo "+capital+" Dolares a "+bolivia.getMoneda());
        System.out.println("Total: "+df.format(capital*6.86) +" "+bolivia.getMoneda());
    }

    @Override
    public void visitar(SantaCruz santaCruz) {
        System.out.println("Bolivia> recibir librecambista");
        System.out.println("Convirtiendo "+capital+" Dolares a "+bolivia.getMoneda());
        System.out.println("Total: "+df.format(capital*6.86) +" "+bolivia.getMoneda());
    }
}
