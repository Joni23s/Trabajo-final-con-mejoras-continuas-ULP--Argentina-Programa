package restorant_v3.AccesoDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restorant_v3.Entidades.Categoria;

/**
 *
 * @author Jonathan Araujo
 */
public class CategoriaData {
    private Connection con = null;
    
    public CategoriaData() {
        con = Conexion.getConexion();
    }
    
    public void agregarCategoria(Categoria cat) {
        try {
            String sql = "INSERT INTO `categoria` (`nombre_categoria`, `estado_categoria`)"
                    + "VALUES (?, ?)";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, cat.getNombre());
            ps.setBoolean(2, cat.isEstadoCat());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                cat.setIdCategoria(1);
                JOptionPane.showMessageDialog(null, "Se ha agregado una Categoria nueva");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Categoria, metodo: AgregarCategoria");
        }
        
    }
    
    
    public List<Categoria> mostrarCategoria() {
        String sql = "SELECT id_categoria, nombre_categoria, estado_categoria FROM categoria";
        ArrayList<Categoria> cat = new ArrayList<>();
        
         try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Categoria categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("id_categoria"));
                categoria.setNombre(rs.getString("nombre_categoria"));
                categoria.setEstadoCat(rs.getBoolean("estado_categoria"));
               
                cat.add(categoria);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la tabla Categoria: mostrarCategoria()");
        }
        return cat;
        
    }
    
    public void agregarCategoriaxNombre(String s){
        Categoria cat = new Categoria(); 
        try {
            String sql = "INSERT INTO `categoria` (`nombre_categoria`, `estado_categoria`) VALUES (?, '1')";
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        ps.setString(1, s);
        
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        
          if (rs.next()) {
                //el numero 1 en la linea a continuación, corresponde a: el numero de la columna en la tabla de la base de datos.
                cat.setIdCategoria(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Se ha agregado una nueva categoria");
            }
            ps.close();
        
        } catch (SQLException ex) {
        }
        
    }
    
    public int devolverIdCat(String s) {
        String sql = "SELECT `id_categoria` FROM `categoria` WHERE nombre_categoria = ?";
        Categoria cat= new Categoria();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                cat.setIdCategoria(rs.getInt("id_categoria"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con la tabla Categoria: devolverIdCat.");
        }
        return cat.getIdCategoria();
        
    }
    
    
            
}
