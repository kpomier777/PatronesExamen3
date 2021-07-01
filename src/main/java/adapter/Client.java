package adapter;

public class Client {

    public static void main(String[]args){
        // Empresa B
        TrackElectrico trackElectrico= new TrackElectrico();


        // Empresa A

        Diesel cuadradiesel= new Diesel();



        Gasolina cuadragasolina= new Gasolina();

        GasolinaEspecial cuadraespecial= new GasolinaEspecial();



        cuadradiesel.llenarGasolina();
        cuadradiesel.estadoDelCombustible();
        cuadragasolina.llenarGasolina();
        cuadragasolina.estadoDelCombustible();
        cuadraespecial.llenarGasolina();
        cuadraespecial.estadoDelCombustible();

        TrackElectricoAdaptado trackElectricoAdaptado = new TrackElectricoAdaptado(trackElectrico);
        trackElectricoAdaptado.llenarGasolina();
        trackElectricoAdaptado.estadoDelCombustible();


    }
}
