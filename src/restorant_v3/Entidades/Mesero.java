
package restorant_v3.Entidades;

/**
 *
 * @author Jonathan Araujo
 */
public class Mesero {
    
    private int idMesero;
    private String nombre;
    private boolean estado;

    public Mesero() {
    }

    public Mesero(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public Mesero(int idMesero, String nombre, boolean estado) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
