package proxy;

public class Client {
    public static void main (String[] args){
        proxy.basic.Proxy proxy= new proxy.basic.Proxy();
        proxy.setAttribute1(60);
        proxy.request();

        proxy.setAttribute1(40);
        proxy.request();



    }
}
