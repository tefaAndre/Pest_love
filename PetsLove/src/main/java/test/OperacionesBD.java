
package test;
import beans.Mascota;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;


public class OperacionesBD {
    public static void main(String[]args){
    actualizarMascota(1, "Masculino");
    listarMascota();
    }
    public static void actualizarMascota(int id, String genero) {
        DBConnection con = new DBConnection();
        String sql="UPDATE mascota SET genero ='"+genero+"'WHERE id="+id;
        try {
            Statement st=con.getConnection().createStatement();
            st.executeUpdate(sql);
                    
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
        finally{
        con.desconectar();
        }
    }
     public static void listarMascota() {
        DBConnection con = new DBConnection();
        String sql="SELECT * FROM mascota";
        try {
            Statement st=con.getConnection().createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                int id =rs.getInt("id");
                String nombre= rs.getString("nombre");
                String raza= rs.getString("raza");
                String genero= rs.getString("genero");
                int anos = rs.getInt("anos");
                String observaciones= rs.getString("observaciones");
                
                
                Mascota mascotas=new Mascota(id,nombre,raza,genero,anos,observaciones);
                System.out.println(mascotas.toString());
        }
                    
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
        finally{
        con.desconectar();
        }
    }
}
