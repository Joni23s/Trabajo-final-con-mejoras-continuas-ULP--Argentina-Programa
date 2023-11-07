package restorant_v3.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import restorant_v3.Entidades.PedProd;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Argentina Programa 4.0 / ULP
 *
 * @author Jonathan Araujo
 */
public class PedProdData {

    private Connection con = null;

    public PedProdData() {
        con = Conexion.getConexion();
    }

    public void guardarPedidoProducto(PedProd pedProd) {

        try {

            String sql = "INSERT INTO `pedidoproducto`( `id_pedido`, `id_prod`, `cantidad`)"
                    + " VALUES (?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, pedProd.getPedido().getIdPedido());
            ps.setInt(2, pedProd.getProducto().getIdProd());
            ps.setInt(3, pedProd.getCantidad());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            int cont = 0;
            if (rs.next()) {
                pedProd.setIdPedProd(rs.getInt(1));
                cont ++;
            } else {
                JOptionPane.showMessageDialog(null, "No se agregó ningun Pedido/Producto ");
            }
//            JOptionPane.showMessageDialog(null, "Se ha agregado exitosamente: "+ cont+ " Productos al pedido");
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Pedido/Producto.(Metodo guardar).");
        }

    }

}
