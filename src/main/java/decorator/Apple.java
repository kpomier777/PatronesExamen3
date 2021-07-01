package decorator;

public class Apple implements IMarca {
    private String marca= "Apple";
    private int ram;
    private int almacenamiento;
    private int cpu;
    private int precio;

    public Apple(int ram, int almacenamiento, int cpu, int precio) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.cpu = cpu;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void aumentar() {
        System.out.println("Datos del celular: ");
        System.out.println("Marca: " + marca);
        System.out.println("Ram: " + ram);
        System.out.println("Almacenamiento: " + almacenamiento);
        System.out.println("Cpu: " + cpu);
        System.out.println("Precio: " + precio);
    }
}
