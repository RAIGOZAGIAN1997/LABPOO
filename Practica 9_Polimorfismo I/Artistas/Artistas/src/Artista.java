public class Artista {
    private String nombre;
    private int edad;
    private double pagoBase;


    public Artista(String nombre, int edad, double pagoBase) {

        this.nombre = nombre;
        this.edad = edad;
        this.pagoBase = pagoBase ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPagoBase() {
        return pagoBase;
    }

    public void setPagoBase(double pagoBase) {
        this.pagoBase = pagoBase;
    }



    public void imprimir() {
        System.out.println("Nombre: " +getNombre());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Paga: "+getPagoBase());
    }
    public double calcularpaga(){
        double pb= getPagoBase();
        double fin = pb + (pb*.10);
        return pb;
    }
}