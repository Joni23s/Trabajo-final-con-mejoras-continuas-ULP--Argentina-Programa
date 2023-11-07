package restorant_v3.Entidades;

/**
 * Argentina Programa 4.0 / ULP
 *
 * @author Jonathan Araujo
 */
public class PedProd {

    private int idPedProd;
    private Pedido pedido;
    private Producto producto;
    private int cantidad;

    public PedProd() {
    }

    public PedProd(int idPedProd, Pedido pedido, Producto producto, int cantidad) {
        this.idPedProd = idPedProd;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public PedProd(Pedido pedido, Producto producto, int cantidad) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    

    public int getIdPedProd() {
        return idPedProd;
    }

    public void setIdPedProd(int idPedProd) {
        this.idPedProd = idPedProd;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
