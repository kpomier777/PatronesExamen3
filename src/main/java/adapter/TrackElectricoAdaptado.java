package adapter;

public class TrackElectricoAdaptado implements ICuadratracks {

    private TrackElectrico trackElectrico;

    public TrackElectricoAdaptado(TrackElectrico trackElectrico){
        System.out.println("Adaptando CuadratrackElectrico a la familia de Cuadratracks normales");
        this.trackElectrico=trackElectrico;
    }



    @Override
    public void llenarGasolina() {
        trackElectrico.cargar();
    }

    @Override
    public int estadoDelCombustible() {

        return trackElectrico.estadoDeElectricidad();
    }
}
