package adapter;

import java.util.Random;

public class TrackElectrico implements ICuadratrackElectrico {

    private int cargado=100;
    private int estadoELectricidad;

    public int getCargado() {
        return cargado;
    }

    public void setCargado(int cargado) {
        this.cargado = cargado;
    }

    public int getEstadoELectricidad() {
        return estadoELectricidad;
    }

    public void setEstadoELectricidad(int estadoELectricidad) {
        this.estadoELectricidad = estadoELectricidad;
    }

    Random rand = new Random();
    int upperbound = 21;
    int int_random = rand.nextInt(upperbound);

    Random rand2 = new Random();
    int upperbound2 = 11;
    int int_random2 = rand2.nextInt(upperbound2);
    @Override
    public void cargar() {
        setCargado(int_random);
    }

    @Override
    public int estadoDeElectricidad() {
        if(int_random2==0){
            int_random2++;
        }
        return int_random2;
    }
}
