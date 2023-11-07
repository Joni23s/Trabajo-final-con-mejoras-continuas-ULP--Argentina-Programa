
package restorant_v3.Entidades;

/**
 *
 * @author Jonathan Araujo
 */
public class Categoria {
    private int idCategoria;
    private String nombre;
    private boolean estadoCat;

    public Categoria() {
    }

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public Categoria(int idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }

    
    
    public Categoria(String nombre, boolean estadoCat) {
        this.nombre = nombre;
        this.estadoCat = estadoCat;
    }

    public Categoria(int idCategoria, String nombre, boolean estadoCat) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.estadoCat = estadoCat;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoCat() {
        return estadoCat;
    }

    public void setEstadoCat(boolean estadoCat) {
        this.estadoCat = estadoCat;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
