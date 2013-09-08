
package paquete1;

public class Animal extends Dieta{
    
    private String codigo;
    private String nombreAnimal;
    private String especie;
    private double pesoKg;
    private String fechNac;
    private String observaciones;

    public Animal(String codigo, String nombreAni, String especie, double pesoKg, String fechNac, String observaciones, double cantAgua, double cantAlimentos, String horaDesayuno, String horaAlmuerzo, String horaCena, String nom, String tipoAlimento, String undMedida, String valorNutri, String nutrientes, int cantNutrientes, int cantidad, String nombre, String unidMed, String estado) {
        super(cantAgua, cantAlimentos, horaDesayuno, horaAlmuerzo, horaCena, nom, tipoAlimento, undMedida, valorNutri, nutrientes, cantNutrientes, cantidad, nombre, unidMed, estado);
        this.codigo = codigo;
        this.nombreAnimal = nombreAni;
        this.especie = especie;
        this.pesoKg = pesoKg;
        this.fechNac = fechNac;
        this.observaciones = observaciones;
    }



    public String getCodigo() {
        return codigo;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public String getFechNac() {
        return fechNac;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setNombre(String nombre) {
        this.nombreAnimal = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public void setFechNac(String fechNac) {
        this.fechNac = fechNac;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
      
}
