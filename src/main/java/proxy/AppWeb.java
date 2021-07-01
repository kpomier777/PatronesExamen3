package proxy;

public class AppWeb {

    private String user;
    private String pwd;
    private int idUsuario;


    public AppWeb(String user, String pwd,int idUsuario) {
        this.user = user;
        this.pwd = pwd;
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
