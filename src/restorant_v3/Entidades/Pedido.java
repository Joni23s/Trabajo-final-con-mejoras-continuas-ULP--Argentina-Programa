package restorant_v3.Entidades;

import java.time.LocalDateTime;

/**
 * Argentina Programa 4.0 / ULP
 *
 * @author Jonathan Araujo
 */
public class Pedido {

    private int idPedido;
    private Mesa mesa;
    private Mesero mesero;
    private LocalDateTime fechaHora;
    private double importe;
    private boolean cobrada;

    public Pedido() {
    }

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, LocalDateTime fechaHora, double importe, boolean cobrada) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.cobrada = cobrada;
    }

    public Pedido(Mesa mesa, Mesero mesero, LocalDateTime fechaHora, double importe, boolean cobrada) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.cobrada = cobrada;
    }
    
    

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isCobrada() {
        return cobrada;
    }

    public void setCobrada(boolean cobrada) {
        this.cobrada = cobrada;
    }
}
