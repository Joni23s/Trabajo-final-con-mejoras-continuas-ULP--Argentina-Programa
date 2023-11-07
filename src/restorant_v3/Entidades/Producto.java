package restorant_v3.Entidades;

/**
 * Argentina Programa 4.0 / ULP
 *
 * @author Jonathan Araujo
 */
public class Producto {

    private int idProd;
    private String nombreProd;
    private double precio;
    private int stock;
    private boolean estado;
    private Categoria rubro;

    public Producto() {
    }

    public Producto(String nombreProd, double precio, int stock, boolean estado, Categoria rubro) {
        this.nombreProd = nombreProd;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
        this.rubro = rubro;
    }

    public Producto(int idProd, String nombreProd, double precio, int stock, boolean estado, Categoria rubro) {
        this.idProd = idProd;
        this.nombreProd = nombreProd;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
        this.rubro = rubro;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return nombreProd;
    }
    
}
