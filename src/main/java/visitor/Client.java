package visitor;



public class Client {

    public static void main(String []sss){

        LaPaz laPaz= new LaPaz();
        Cochabamba cochabamba= new Cochabamba();
        SantaCruz santaCruz= new SantaCruz();


        TuristaAleman turistaAleman = new TuristaAleman(5000);

        laPaz.recibir(turistaAleman);
        TuristaAleman turistaAleman2 = new TuristaAleman(5000);
        cochabamba.recibir(turistaAleman2);
        TuristaAleman turistaAleman3 = new TuristaAleman(5000);
        santaCruz.recibir(turistaAleman3);





    }

}
