package adapter;

import java.util.Random;

public class Gasolina implements ICuadratracks {

    private int capacidad=100;
    private int cantidadDeCarga;
    private int tiempoEnMarcha;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidadDeCarga() {
        return cantidadDeCarga;
    }

    public void setCantidadDeCarga(int cantidadDeCarga) {
        this.cantidadDeCarga = cantidadDeCarga;
    }

    public int getTiempoEnMarcha() {
        return tiempoEnMarcha;
    }

    public void setTiempoEnMarcha(int tiempoEnMarcha) {
        this.tiempoEnMarcha = tiempoEnMarcha;
    }

    Random rand = new Random();
    int upperbound = 51;
    int int_random = rand.nextInt(upperbound);

    Random rand2 = new Random();
    int upperbound2 = 51;
    int int_random2 = rand2.nextInt(upperbound2);

    @Override
    public void llenarGasolina() {
        setCapacidad(int_random);
    }

    @Override
    public int estadoDelCombustible() {
        if(int_random2==0){
            int_random2++;
        }
        return int_random2;
    }
}
