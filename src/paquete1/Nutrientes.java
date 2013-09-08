
package paquete1;

public class Nutrientes{
    
    private int cantidad;
    private String nombre;
    private String unidMed;
    private String estado;

    public Nutrientes(int cantidad, String nombre, String unidMed, String estado) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.unidMed = unidMed;
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidMed() {
        return unidMed;
    }

    public String getEstado() {
        return estado;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidMed(String unidMed) {
        this.unidMed = unidMed;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }    
    
}
