public class Casa extends Construccion {
    private int numpisos;
    private int habitaciones;
    private int banos;


    public Casa (String nombre, double precio, String direccion,int numpisos, int habitaciones, int banos) {
        super(nombre,precio,direccion);
        this.numpisos = numpisos;
        this.habitaciones = habitaciones;
        this.banos=banos;
    }

    public int getNumpisos() {
        return numpisos;
    }

    public void setNumpisos(int numpisos) {
        this.numpisos = numpisos;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banios) {
        this.banos = banios;
    }

//Metodo de casa que no devuelve nada, se utiliza para llamar a los metodos gets del constructor de cada variable//
    public void mostrardatosCasa() {
        System.out.println("Nombre de casa: " + getNombre());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Baños:" + getBanos());
        System.out.println("Numero de pisos: "+getNumpisos());
        System.out.println("Habitaciones: " + getHabitaciones());
        System.out.println("Precio:" + getPrecio()+ "$");
    }
}
