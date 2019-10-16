public class Alumno extends Entidad{

    private String nombre;
    private double pagoSalarioBase;
    private int anio;

    public Alumno(String nombre, double pagosalariobase, int anio) {
        super(nombre,pagosalariobase);
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    @Override
    public double calcularPagoSalario(){
        if(this.anio > 2){
            return(this.cantidadclases* +getPagosalariobase() - (anio*(getPagosalariobase() * 0.05)));

        }else{
            return super.calcularPagoSalario();
        }


    }

    @Override
    public void printEntidad(){
        super.printEntidad();
        System.out.println("Anios" + this.toString());
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
@Override
    private void aniadirClase(Clase c)
    {

    }
}

