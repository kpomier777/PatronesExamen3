package bridge;

public class SistemaColegio implements IEmpresas {

    private IMetodo metodo;
    String nombre;
    int capacidad;
    String[] estudiantes;
    String requisitos;

    public SistemaColegio(IMetodo metodo) {
        this.metodo = metodo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    @Override
    public void precioDeInstalaicon(String nombreCLiente, String direccion ,int precio) {
        setNombreCliente(nombreCLiente);
        setDireccion(direccion);
        setPrecio(precio);
        System.out.print("El cliente: "+nombreCLiente+ " con la direccion de: "+direccion+" por el servicio de electricidad");
        metodo.descontar(precio);
    }
}
