package proxy;

public class Cluster implements ICluster {

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

    public Cluster(AppWeb web, String userGuardado, String pwdGuardado) {
        this.web = web;
        this.userGuardado = userGuardado;
        this.pwdGuardado= pwdGuardado;
    }


    @Override
    public void ingresar() {
        System.out.println("Validando... login de usuario "+ this.web.getUser()+" con password "+ this.web.getPwd());
    }
}
