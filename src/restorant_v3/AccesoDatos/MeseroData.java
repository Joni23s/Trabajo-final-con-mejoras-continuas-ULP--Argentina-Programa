
package restorant_v3.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restorant_v3.Entidades.Mesero;

/**
 *
 * @author Jonathan Araujo
 */
public class MeseroData {

    private Connection con = null;

    public MeseroData() {
        con = Conexion.getConexion();
    }

    public void agregarMesero(Mesero mesero) {
        try {

            String sql = "INSERT INTO `mesero`( `nombre_mesero`,`estado`) VALUES (?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, mesero.getNombre());
            ps.setBoolean(2, mesero.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                //el numero 1 en la linea a continuación, corresponde a: el numero de la columna en la tabla de la base de datos.
                mesero.setIdMesero(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo mesero");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesero.");

        }
    }

    public void modificarMesero(Mesero mesero) {

        String nombreAnterior = mesero.getNombre();

        try {
            String sql = "UPDATE `mesero` SET `nombre_mesero`= ?,`estado`= ? WHERE id_mesero = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, mesero.getNombre());
            ps.setBoolean(2, mesero.isEstado());
            ps.setInt(3, mesero.getIdMesero());

            int exito = ps.executeUpdate();

            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado el mesero " + nombreAnterior + " con éxito.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar Mesero.");
        }

    }

    public List<Mesero> listarMeserosActivos() {

        String sql = "SELECT `id_mesero`, `nombre_mesero`, `estado` FROM `mesero` WHERE `estado` = 1";

        ArrayList<Mesero> listaMeseros = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesero mesero = new Mesero();

                mesero.setIdMesero(rs.getInt("id_mesero"));
                mesero.setNombre(rs.getString("nombre_mesero"));
                mesero.setEstado(rs.getBoolean("estado"));

                listaMeseros.add(mesero);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar meseros.");
        }

        return listaMeseros;
    }

    public List<Mesero> listarTodosMeseros() {

        String sql = "SELECT `id_mesero`, `nombre_mesero`, `estado` FROM `mesero`";

        ArrayList<Mesero> listaMeseros = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesero mesero = new Mesero();

                mesero.setIdMesero(rs.getInt("id_mesero"));
                mesero.setNombre(rs.getString("nombre_mesero"));
                mesero.setEstado(rs.getBoolean("estado"));

                listaMeseros.add(mesero);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar meseros.");
        }

        return listaMeseros;
    }

    public Mesero mostrarMeseroPorId(int id) {

        String sql = "SELECT `id_mesero`, `nombre_mesero`, `estado` FROM `mesero` WHERE id_mesero = ?";
         
        Mesero mesero = new Mesero();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
           

            if (rs.next()) {
               
                mesero.setIdMesero(rs.getInt("id_mesero"));
                mesero.setNombre(rs.getString("nombre_mesero"));
                mesero.setEstado(rs.getBoolean("estado"));
                
                

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la tabla Mesero(Metodo x ID)");
        }
        if (mesero == null) {
            JOptionPane.showMessageDialog(null, "No se encontro una mesero con id " + id);
        }
        return mesero;

    }
    
     public Mesero mostrarMeseroPorNombre(String nombre) {

        String sql = "SELECT `id_mesero`, `nombre_mesero`, `estado` FROM `mesero` WHERE nombre_mesero = ?";
         
        Mesero mesero = new Mesero();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
           

            if (rs.next()) {
               
                mesero.setIdMesero(rs.getInt("id_mesero"));
                mesero.setNombre(rs.getString("nombre_mesero"));
                mesero.setEstado(rs.getBoolean("estado"));
                
                

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la tabla Mesero(Metodo x ID)");
        }
        if (mesero == null) {
            JOptionPane.showMessageDialog(null, "No se encontro una mesero con nombre " + nombre);
        }
        return mesero;

    }

}
