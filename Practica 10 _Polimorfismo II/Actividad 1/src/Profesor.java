public class Profesor extends Entidad {

    private String tipo;
    private String idiomas[];
    private final int maxIdiomas = 5;
    private String nombre;
    private double pagoSalarioBase;

    public Alumno(String nombre, double pagosalariobase, String tipo) {
        super(nombre, pagosalariobase);
        this.tipo = tipo;

    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }





}



