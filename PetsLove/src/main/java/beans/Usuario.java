
package beans;

public class Usuario {
   private String usuario;
   private String contrasena;
   private String nombres;
   private String apellidos;
   private String celular;
   private String correo;
   private double saldo;
   private boolean premium;

    public Usuario(String usuario, String contrasena, String nombres, String apellidos, String celular, String correo, double saldo, boolean premium) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correo = correo;
        this.saldo = saldo;
        this.premium = premium;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contrasena=" + contrasena + ", nombres=" + nombres + ", apellidos=" + apellidos + ", celular=" + celular + ", correo=" + correo + ", saldo=" + saldo + ", premium=" + premium + '}';
    }
   
}
