
package paquete1;

public class Alimento extends Nutrientes{
    
    
    private String nombreNutri;
    private String tipoAlimento;
    private String undMedida;
    private String valorNutri;
    private String nutrientes;
    private int cantNutrientes;

    public Alimento(String nom, String tipoAlimento, String undMedida, String valorNutri, String nutrientes, int cantNutrientes, int cantidad, String nombre, String unidMed, String estado) {
        super(cantidad, nombre, unidMed, estado);
        this.nombreNutri = nom;
        this.tipoAlimento = tipoAlimento;
        this.undMedida = undMedida;
        this.valorNutri = valorNutri;
        this.nutrientes = nutrientes;
        this.cantNutrientes = cantNutrientes;
    }

    public String getNombreNutri() {
        return nombreNutri;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public String getUndMedida() {
        return undMedida;
    }

    public String getValorNutri() {
        return valorNutri;
    }

    public String getNutrientes() {
        return nutrientes;
    }

    public int getCantNutrientes() {
        return cantNutrientes;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public void setUndMedida(String undMedida) {
        this.undMedida = undMedida;
    }

    public void setValorNutri(String valorNutri) {
        this.valorNutri = valorNutri;
    }

    public void setNutrientes(String nutrientes) {
        this.nutrientes = nutrientes;
    }

    public void setCantNutrientes(int cantNutrientes) {
        this.cantNutrientes = cantNutrientes;
    }
    
    
    
}
