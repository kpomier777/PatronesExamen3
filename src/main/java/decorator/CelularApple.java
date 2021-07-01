package decorator;

public class CelularApple implements IMarca {

    public int ram;
    public int almacenamiento;
    public int cpu;

    public CelularApple(int cpu) {
        this.cpu = cpu;
    }

    public CelularApple(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public int getPorcentajeArmadura() {
        return porcentajeArmadura;
    }

    public void setPorcentajeArmadura(int porcentajeArmadura) {
        this.porcentajeArmadura = porcentajeArmadura;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public int getPuntosRegeneracionVida() {
        return puntosRegeneracionVida;
    }

    public void setPuntosRegeneracionVida(int puntosRegeneracionVida) {
        this.puntosRegeneracionVida = puntosRegeneracionVida;
    }

    public void operation(CelularApple cuentaBasic){
        setArmas("Ninguna");
        setPorcentajeArmadura(1);
        setPuntosAtaque(1);
        setPuntosDefensa(1);
        setPuntosRegeneracionVida(1);
        System.out.println("Personaje creado con: ");
        System.out.println("Nombre: "+getNombre());
        System.out.println("NIvel: "+getNivel());
        System.out.println("Armas: "+getArmas());
        System.out.println("Porcentaje de armadura: "+getPorcentajeArmadura()+"%");
        System.out.println("Puntos de ataque: "+getPuntosAtaque());
        System.out.println("Puntos de defenza: "+getPuntosDefensa());
        System.out.println("Puntos de regenración de vida: "+getPuntosRegeneracionVida());
    }

    @Override
    public void aumentar(CelularApple celularBasico) {

    }
}
