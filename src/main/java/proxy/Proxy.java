package proxy;

public class Proxy implements ICluster {
    private AppWeb web;
    private Servidor1 servidor1;
    private Servidor2 servidor2;
    private String usuarioguardado="kevin";
    private String passswordGuardado="123";

    public Proxy(AppWeb web, Servidor1 servidor1, Servidor2 servidor2) {
        this.web = web;
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
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

        if (web.getUser()==usuarioguardado && web.getPwd()==passswordGuardado){
            if (esPrimo(web.getIdUsuario())) {
                System.out.println("Usted será redirigido al servidor 1 porque su id usuario "+ web.getIdUsuario() +" es primo");
                servidor1.ingresar();
            }else {
                System.out.println("Usted será redirigido al servidor 2 porque su id usuario "+ web.getIdUsuario() +" no es primo");
                servidor2.ingresar();
            }
        }else{
            System.out.println("Ingrese los datos correctos de login");
        }
    }
}
