package proxy;

public class Servidor2 implements ICluster {

    AppWeb web;
    private String userGuardado;
    private String pwdGuardado;

    public String getUserGuardado() {
        return userGuardado;
    }

    public void setUserGuardado(String userGuardado) {
        this.userGuardado = userGuardado;
    }

    public String getPwdGuardado() {
        return pwdGuardado;
    }

    public void setPwdGuardado(String pwdGuardado) {
        this.pwdGuardado = pwdGuardado;
    }

    public Servidor2(AppWeb web) {
        this.web = web;

    }


    @Override
    public void ingresar() {
        System.out.println("Atendido por servidor 2");
        System.out.println("Validando... login de usuario "+ this.web.getUser()+" con password "+ this.web.getPwd());
    }
}
