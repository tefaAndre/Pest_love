
package beans;


public class Mascota {
   private int id;
   private String nombre;
   private String raza;
   private String genero;
   private int anos;
   private String observaciones;

    public Mascota(int id, String nombre, String raza, String genero, int anos, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.anos = anos;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", genero=" + genero + ", anos=" + anos + ", observaciones=" + observaciones + '}';
    }
   
   
}
