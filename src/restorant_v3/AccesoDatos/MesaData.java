package restorant_v3.AccesoDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restorant_v3.Entidades.Mesa;

/**
 * Argentina Programa 4.0 / ULP
 *
 * @author Jonathan Araujo
 */
public class MesaData {

    private Connection con = null;

    public MesaData() {
        con = Conexion.getConexion();
    }

    public void agregarMesa(Mesa mesa) {

        try {

            String sql = "INSERT INTO mesa (`numero`, `estado_mesa`, `capacidad`)"
                    + "VALUES (?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, mesa.getNumero());
            ps.setBoolean(2, mesa.isEstadoM());
            ps.setInt(3, mesa.getCapacidad());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                //el numero 1 en la linea a continuación, corresponde a: el numero de la columna en la tabla de la base de datos.
                mesa.setIdMesa(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Se ha agregado una mesa nueva");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa, metodo: AgregarMesa");

        }
    }

    public void modificarMesa(Mesa mesa) {

        String sql = "UPDATE mesa SET numero = ?, estado_mesa= ?, capacidad = ? WHERE id_mesa = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, mesa.getNumero());
            ps.setBoolean(2, mesa.isEstadoM());
            ps.setInt(3, mesa.getCapacidad());
            ps.setInt(4, mesa.getIdMesa());

            int modi = ps.executeUpdate();

            if (modi == 1) {
                JOptionPane.showMessageDialog(null, "Se modificaron los estados de una mesa");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa, metodo: modificarMesa");
        }

    }

    public List<Mesa> mostrarMesas() {

        String sql = "SELECT `id_mesa`, `numero`, `estado_mesa`, `capacidad` FROM `mesa`";
        ArrayList<Mesa> mesas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoM(rs.getBoolean("estado_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));

                mesas.add(mesa);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la tabla Alumno.");
        }
        return mesas;

    }

    public List<Mesa> mostrarMesasxServicio(boolean boobaloo) {

        String sql = "SELECT `id_mesa`, `numero`, `estado_mesa`, `capacidad` FROM `mesa` WHERE estado_mesa = ?";

        ArrayList<Mesa> mesas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, boobaloo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoM(rs.getBoolean("estado_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));

                mesas.add(mesa);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la tabla Alumno.");
        }
        return mesas;

    }

    public Mesa mostrarMesaSegunNumero(int n) {

        String sql = "SELECT `id_mesa`, `numero`, `estado_mesa`, `capacidad` FROM `mesa` WHERE numero = ?";
        Mesa mesa = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, n);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mesa = new Mesa();

                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoM(rs.getBoolean("estado_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la tabla Alumno.");
        }
        if (mesa == null) {
            JOptionPane.showMessageDialog(null, "No se encontro una mesa con el numero " + n);
        }
        return mesa;

    }

    public Mesa mostrarMesaSegunCapacidad(int n) {

        String sql = "SELECT `id_mesa`, `numero`, `estado_mesa`, `capacidad` FROM `mesa` WHERE capacidad = ?";
        Mesa mesa = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, n);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mesa = new Mesa();

                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoM(rs.getBoolean("estado_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con tabla Mesa : mostrarMesaSegunCapacidad");
        }
        if (mesa == null) {
            JOptionPane.showMessageDialog(null, "No se encontraron mesas con capacidad " + n);
        }
        return mesa;

    }

    public List<Mesa> mostrarMesasxCapacidad(int n) {

        String sql = "SELECT `id_mesa`, `numero`, `estado_mesa`, `capacidad` FROM `mesa` WHERE capacidad = ?";

        ArrayList<Mesa> mesas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, n);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoM(rs.getBoolean("estado_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));

                mesas.add(mesa);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la tabla Alumno.");
        }
        return mesas;

    }

    public boolean buscarNumMesa(int num) {
        boolean vacante = true;
        List<Mesa> mesas = mostrarMesas();

        for (Mesa mesa : mesas) {
            int numero = mesa.getNumero();

            if (numero == num) {
                vacante = false;
                break;
            } else {
                vacante = true;
            }
        }
        return vacante;
    }
    
    public Mesa buscarMesaPorId (int id) {

        String sql = "SELECT `id_mesa`, `numero`, `estado_mesa`, `capacidad` FROM `mesa` WHERE id_mesa = ?";
        Mesa mesa = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mesa = new Mesa();

                mesa.setIdMesa(rs.getInt("id_mesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoM(rs.getBoolean("estado_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la tabla Mesa(Metodo x ID)");
        }
        if (mesa == null) {
            JOptionPane.showMessageDialog(null, "No se encontro una mesa con id " + id);
        }
        return mesa;

    }
}
