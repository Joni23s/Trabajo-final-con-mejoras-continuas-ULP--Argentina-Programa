package restorant_v3.Entidades;

/**
 * Argentina Programa 4.0 / ULP
 *
 * @author Jonathan Araujo
 */
public class Mesa {

    private int idMesa;
    private int numero;
    private boolean estadoM;
    private int capacidad;

    public Mesa() {
    }

    public Mesa(int idMesa, int numero, boolean estadoM, int capacidad) {
        this.idMesa = idMesa;
        this.numero = numero;
        this.estadoM = estadoM;
        this.capacidad = capacidad;
    }

    public Mesa(int numero, boolean estadoM, int capacidad) {
        this.numero = numero;
        this.estadoM = estadoM;
        this.capacidad = capacidad;
    }
    
    

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstadoM() {
        return estadoM;
    }

    public void setEstadoM(boolean estadoM) {
        this.estadoM = estadoM;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Identificador: "+ numero;
    }
    
    

}
