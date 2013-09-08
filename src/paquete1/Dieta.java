package paquete1;

public class Dieta extends Alimento{

    private double cantAgua;
    private double cantAlimentos;
    private String horaDesayuno;
    private String horaAlmuerzo;
    private String horaCena;

    public Dieta(double cantAgua, double cantAlimentos, String horaDesayuno, String horaAlmuerzo, String horaCena, String nom, String tipoAlimento, String undMedida, String valorNutri, String nutrientes, int cantNutrientes, int cantidad, String nombre, String unidMed, String estado) {
        super(nom, tipoAlimento, undMedida, valorNutri, nutrientes, cantNutrientes, cantidad, nombre, unidMed, estado);
        this.cantAgua = cantAgua;
        this.cantAlimentos = cantAlimentos;
        this.horaDesayuno = horaDesayuno;
        this.horaAlmuerzo = horaAlmuerzo;
        this.horaCena = horaCena;
    }

    public String getHoraDesayuno() {
        return horaDesayuno;
    }

    public String getHoraAlmuerzo() {
        return horaAlmuerzo;
    }

    public String getHoraCena() {
        return horaCena;
    }

    public double getCantAgua() {
        return cantAgua;
    }

    public double getCantAlimentos() {
        return cantAlimentos;
    }

    public void setCantAgua(double cantAgua) {
        this.cantAgua = cantAgua;
    }

    public void setCantAlimentos(double cantAlimentos) {
        this.cantAlimentos = cantAlimentos;
    }

    public void setHoraDesayuno(String horaDesayuno) {
        this.horaDesayuno = horaDesayuno;
    }

    public void setHoraAlmuerzo(String horaAlmuerzo) {
        this.horaAlmuerzo = horaAlmuerzo;
    }

    public void setHoraCena(String horaCena) {
        this.horaCena = horaCena;
    }
}
