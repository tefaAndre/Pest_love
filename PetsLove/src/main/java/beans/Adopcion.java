
package beans;

import java.sql.Date;


public class Adopcion {
    private int id;
    private String usuario;
    private Date fecha;
    //private boolean novedad;
    //private String genero;

    public Adopcion(int id, String usuario, Date fecha) {
        this.id = id;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Adopcion{" + "id=" + id + ", usuario=" + usuario + ", fecha=" + fecha + '}';
    }
    
    
}