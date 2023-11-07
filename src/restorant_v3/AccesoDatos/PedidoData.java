package restorant_v3.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restorant_v3.Entidades.Pedido;

/**
 * Argentina Programa 4.0 / ULP
 *
 * @author Jonathan Araujo
 */
public class PedidoData {

    private Connection con = null;
    MesaData mesaData = new MesaData();
    PedProdData productoData = new PedProdData();
    MeseroData meseroData = new MeseroData();
    ProductoData pd = new ProductoData();

    public PedidoData() {
        con = Conexion.getConexion();
    }

    public void agregarPedido(Pedido pedi) {
        String sql = "INSERT INTO pedido( id_mesa, id_mesero, fecha_hora, importe, cobrada)"
                + " VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, pedi.getMesa().getIdMesa());
            ps.setInt(2, pedi.getMesero().getIdMesero());

            java.sql.Timestamp sqlTimestamp = java.sql.Timestamp.valueOf(pedi.getFechaHora());
            ps.setTimestamp(3, sqlTimestamp);
            ps.setDouble(4, pedi.getImporte());
            ps.setBoolean(5, pedi.isCobrada());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pedi.setIdPedido(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido correcto.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido. Metodo agregarPedido");
        }
    }

    public void modificarPedido(Pedido pedi) {

        String sql = "UPDATE `pedido` SET `id_mesa`= ?,`id_mesero`= ?, `fecha_hora` = ?, `importe`= ?,`cobrada`= ? WHERE id_pedido = ?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, pedi.getMesa().getIdMesa());
            ps.setInt(2, pedi.getMesero().getIdMesero());

            java.sql.Timestamp sqlTimestamp = java.sql.Timestamp.valueOf(pedi.getFechaHora());
            ps.setTimestamp(3, sqlTimestamp);   
            ps.setDouble(4, pedi.getImporte());
            ps.setBoolean(5, pedi.isCobrada());
            ps.setInt(6, pedi.getIdPedido());

            int cambios = ps.executeUpdate();
            if (cambios == 1) {
                JOptionPane.showMessageDialog(null, "Modificaciones realizadas");
            } else {
                JOptionPane.showMessageDialog(null, "NO se hicieron modificaciones en la tabla");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder Tabla PEDIDO");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No debe haber campos ");
        }
    }

    public List<Pedido> listarPedidos() {

        String sql = "SELECT `id_pedido`, `id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada` FROM `pedido`";
        ArrayList<Pedido> pedidos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mesaData.buscarMesaPorId(rs.getInt("id_mesa")));
                pedido.setMesero(meseroData.mostrarMeseroPorId(rs.getInt("id_mesero")));
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setFechaHora(rs.getTimestamp("fecha_hora").toLocalDateTime());
                pedido.setCobrada(rs.getBoolean("cobrada"));

                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder tabla Pedido. (listarPedidos)");
        }
        return pedidos;
    }


    public List<Pedido> listarPedidoPorFecha(String fecha) {

        ArrayList<Pedido> pedidos = new ArrayList<>();

        String sql = "SELECT `id_pedido`, `id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada` FROM `pedido` WHERE (`fecha_hora` >= ? ) AND (`fecha_hora` <= ? );";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fecha + " 00:00:00");
            ps.setString(2, fecha + " 23:59:59");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mesaData.buscarMesaPorId(rs.getInt("id_mesa")));
                pedido.setMesero(meseroData.mostrarMeseroPorId(rs.getInt("id_mesero")));
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setFechaHora(rs.getTimestamp("fecha_hora").toLocalDateTime());
                pedido.setCobrada(rs.getBoolean("cobrada"));
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla pedido (Listar Por Fecha)");
        }
        return pedidos;
    }

    public List<Pedido> listarPedidosPorCobro(boolean estado) {

        String sql = "SELECT `id_pedido`, `id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada` FROM `pedido` WHERE cobrada = ?";
        ArrayList<Pedido> pedidos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mesaData.buscarMesaPorId(rs.getInt("id_mesa")));
                pedido.setMesero(meseroData.mostrarMeseroPorId(rs.getInt("id_mesero")));
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setFechaHora(rs.getTimestamp("fecha_hora").toLocalDateTime());
                pedido.setCobrada(rs.getBoolean("cobrada"));

                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder tabla Pedido. (listarPedidosPorCobro)");
        }
        return pedidos;
    }

    public List<Pedido> listarPedidosPorIdMesa(int id_mesa) {

        String sql = "SELECT `id_pedido`, `id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada` FROM `pedido` WHERE id_mesa = ?";
        ArrayList<Pedido> pedidos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_mesa);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mesaData.buscarMesaPorId(rs.getInt("id_mesa")));
                pedido.setMesero(meseroData.mostrarMeseroPorId(rs.getInt("id_mesero")));
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setFechaHora(rs.getTimestamp("fecha_hora").toLocalDateTime());
                pedido.setCobrada(rs.getBoolean("cobrada"));

                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder tabla Pedido. (listarPedidosPorCobro)");
        }
        return pedidos;
    }

    public List<Pedido> listarPedidosPorIdMesero(int id_mesero) {

        String sql = "SELECT `id_pedido`, `id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada` FROM `pedido` WHERE id_mesero = ?";
        ArrayList<Pedido> pedidos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_mesero);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mesaData.buscarMesaPorId(rs.getInt("id_mesa")));
                pedido.setMesero(meseroData.mostrarMeseroPorId(rs.getInt("id_mesero")));
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setFechaHora(rs.getTimestamp("fecha_hora").toLocalDateTime());
                pedido.setCobrada(rs.getBoolean("cobrada"));

                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder tabla Pedido. (listarPedidosPorCobro)");
        }
        return pedidos;
    }

    public List<Pedido> listarPedidosPorMeseroYMesa(int id_mesero, int id_mesa) {

        String sql = "SELECT `id_pedido`, `id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada` FROM `pedido` WHERE id_mesero = ? AND id_mesa = ?";
        ArrayList<Pedido> pedidos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_mesero);
            ps.setInt(2, id_mesa);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mesaData.buscarMesaPorId(rs.getInt("id_mesa")));
                pedido.setMesero(meseroData.mostrarMeseroPorId(rs.getInt("id_mesero")));
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setFechaHora(rs.getTimestamp("fecha_hora").toLocalDateTime());
                pedido.setCobrada(rs.getBoolean("cobrada"));

                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder tabla Pedido. (listarPedidosPorCobro)");
        }
        return pedidos;
    }

    public Pedido buscarPedidoPorId(int idPedido) {

        String sql = "SELECT `id_pedido`, `id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada` FROM `pedido` WHERE id_pedido = ?";

        Pedido pedido = new Pedido();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                pedido.setIdPedido(rs.getInt("id_pedido"));
                pedido.setMesa(mesaData.buscarMesaPorId(rs.getInt("id_mesa")));
                pedido.setMesero(meseroData.mostrarMeseroPorId(rs.getInt("id_mesero")));
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setFechaHora(rs.getTimestamp("fecha_hora").toLocalDateTime());
                pedido.setCobrada(rs.getBoolean("cobrada"));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el pedido con el id " + idPedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla pedido (Listar Por Fecha)");
        }
        return pedido;
    }

}
