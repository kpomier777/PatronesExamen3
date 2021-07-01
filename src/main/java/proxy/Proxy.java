package proxy;

public class Proxy implements ICluster {
    private AppWeb web;
    private Cluster cluster;

    public Proxy(AppWeb web, Cluster cluster) {
        this.web = web;
        this.cluster = cluster;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        int contador = 0;
        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador < 1;
    }

    @Override
    public void ingresar() {
        cluster.ingresar();
        if (web.getUser()==cluster.getUserGuardado() && web.getPwd()==cluster.getPwdGuardado()){
            if (esPrimo(web.getIdUsuario())) {
                System.out.println("Usted será guardado para el servidor 1 porque su id usuario "+ web.getIdUsuario() +" es primo");
            }else {
                System.out.println("Usted será redirigido al servidor 2 porque su id usuario "+ web.getIdUsuario() +" no es primo");
            }
        }else{
            System.out.println("Ingrese los datos correctos de login");
        }
    }
}
