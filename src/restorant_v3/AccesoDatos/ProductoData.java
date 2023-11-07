
package restorant_v3.AccesoDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restorant_v3.Entidades.Categoria;
import restorant_v3.Entidades.Producto;

/**
 *Argentina Programa 4.0 / ULP
 * @author Jonathan Araujo
 */
public class ProductoData {

    private java.sql.Connection con = null;


    public ProductoData() {
        con = Conexion.getConexion();
    }
 public void AgregarProductos(Producto producto) {

    String sql="INSERT INTO `producto` (`nombre_producto`, `precio`, `stock`, `categoria`, `estado`) "
            + "VALUES ( ?, ?, ?, ?, ?);";

        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombreProd());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setString(4, producto.getRubro().toString());
            ps.setBoolean(5, producto.isEstado());
     
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProd(1);
                JOptionPane.showMessageDialog(null, "Producto Ingresado");
            }

            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO se accede a la tabla producto"+ ex.getMessage());
        }
    }

        public void ModificarProdu(Producto produ) {

        String sql = "UPDATE `producto` SET `nombre_producto`=?,`precio`=?,`stock`=?,`categoria`=?,`estado`=? WHERE `id_producto`=?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, produ.getNombreProd());
            ps.setDouble(2, produ.getPrecio());
            ps.setInt(3, produ.getStock());
            ps.setString(4, produ.getRubro().toString());
            ps.setBoolean(5, produ.isEstado());
            ps.setInt(6, produ.getIdProd());
            int cambios = ps.executeUpdate();
            if (cambios == 1) {
                JOptionPane.showMessageDialog(null, "Modificaciones realizadas");

            }else{
            
            JOptionPane.showMessageDialog(null,"NO se hicieron modificaciones en la tabla" );
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder Tabla Producto");
        }
    }

    public void BajaProducto(int codigo) {
        String sql = "UPDATE `producto` SET `estado`= 0 WHERE `id_producto`=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            int baja = ps.executeUpdate();
            if (baja == 1) {
                JOptionPane.showMessageDialog(null, " Baja realizada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la tabla Producto");
        }
    }
    
   
    public List<Producto> ListaProducto(){
        Categoria cat;
        ArrayList<Producto> MenuDeProductos = new ArrayList<>();

        String sql = "SELECT * FROM `producto` WHERE `estado`= 1";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Producto produ = new Producto();

                produ.setIdProd(rs.getInt("id_producto"));
                produ.setNombreProd(rs.getString("nombre_producto"));
                produ.setPrecio(rs.getDouble("precio"));
                produ.setStock(rs.getInt("stock"));
                
                  cat = new Categoria(rs.getString("categoria"));
                
                produ.setRubro(cat);
                
                produ.setEstado(rs.getBoolean("estado"));
                MenuDeProductos.add(produ);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la tabla Productos metodo listaProducto");
        }

        return MenuDeProductos;
    }

    public Producto buscarProduxnombre(String nombre) {
        String sql = "SELECT `id_producto`,`nombre_producto`, `precio`, `stock`, `categoria`, `estado` FROM `producto` WHERE `nombre_producto`=?";
        Producto buscoProducto = null;
        Categoria cat = new Categoria();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                buscoProducto = new Producto();
                
                buscoProducto.setIdProd(rs.getInt("id_producto"));
                buscoProducto.setNombreProd(rs.getString("nombre_producto"));
                buscoProducto.setPrecio(rs.getDouble("precio"));
                buscoProducto.setStock(rs.getInt("stock"));
                
                cat.setNombre(rs.getString("categoria"));                 
                buscoProducto.setRubro(cat);
                
                buscoProducto.setEstado(rs.getBoolean("estado"));
            
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en buscar producto en tabla Producto");
        }
       
        return buscoProducto;
    }
    
   
    
}
