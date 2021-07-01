package decorator;

public class Client {
    public static void main(String[] args) {
        IMarca samsum= new Samsung(8,16,8,500);
        samsum.aumentar();
        samsum = new CelularConCarcasa(samsum);
        samsum = new CelularConMemoriaExterna(samsum);
        samsum = new CelularConTemplado(samsum);
        samsum.aumentar();

        IMarca apple= new Apple(8,16,8,500);
        apple.aumentar();
        apple = new CelularConCarcasa(apple);
        apple = new CelularConMemoriaExterna(apple);
        apple = new CelularConTemplado(apple);
        apple.aumentar();

        IMarca xiaomi= new Xiaomi(8,16,8,500);
        xiaomi.aumentar();
        xiaomi = new CelularConCarcasa(xiaomi);
        xiaomi = new CelularConMemoriaExterna(xiaomi);
        xiaomi = new CelularConTemplado(xiaomi);
        xiaomi.aumentar();

    }
}
