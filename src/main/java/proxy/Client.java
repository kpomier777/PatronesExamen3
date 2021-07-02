package proxy;

public class Client {
    public static void main (String [] args){
        // create proxy
        AppWeb web= new AppWeb("kevin","123", 1);
        Servidor1 servidor1=new Servidor1(web);
        Servidor2 servidor2=new Servidor2(web);
        Proxy proxy = new Proxy(web,servidor1,servidor2);
        web.setIdUsuario(1);
        web.setUser("kevin");
        web.setPwd("123");
        proxy.ingresar();
        System.out.println("/////////////////////");

        web.setIdUsuario(5);
        web.setUser("kev");
        web.setPwd("12");
        proxy.ingresar();
        System.out.println("///////////////////////////");
        web.setIdUsuario(5);
        web.setUser("kevin");
        web.setPwd("123");
        proxy.ingresar();

    }
}
