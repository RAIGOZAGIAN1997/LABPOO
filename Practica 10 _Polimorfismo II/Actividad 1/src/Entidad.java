
import java.util.Scanner;
public class Entidad {
    private String nombre;
    private double pagosalariobase;
    private int numClases;
    private final int numClasesMax = 5;
    private int Clases[];
    public int cantidadclases;
    Scanner sc = new Scanner (System.in);

    public int[] getClases() {
        return Clases;
    }

    public void setClases(int[] clases) {
        Clases = clases;
    }

    public Entidad(String nombre, double pagosalariobase, int[] clase) {

        this.nombre = nombre;
        this.pagosalariobase = pagosalariobase;
    }

    public void setPagosalariobase(double pagosalariobase) {

        this.pagosalariobase = pagosalariobase;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int[] getNumClases()
    {
        return numClases;
    }

    public void setNumClases(int[] numClases) {
        this.numClases = numClases;
    }

    public int getNumClasesMax() {
        return numClasesMax;
    }

    public double getPagosalariobase() {
        return pagosalariobase;
    }



    private void aniadirClase(Clase c)
    {

    }



    public double calcularPagoSalario()
    {

        return cantidadclases * pagosalariobase;
    }
    public void printEntidad()
    {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Pago Salarial: "+getPagosalariobase();
        System.out.println("Clases: " +getClases();
    }


}
