public class Edificio extends Construccion {
    int numpisos;
    int numPisosEstacionamiento;
    int numElevadores;


    public Edificio (String nombre, double precio, String direccion,int numpisos, int numPisosEstacionamiento, int numElevadores) {
        super(nombre,precio,direccion);
        this.numpisos=numpisos;
        this.numPisosEstacionamiento=numPisosEstacionamiento;
        this.numElevadores=numElevadores;
    }

    public int getNumpisos() {
        return numpisos;
    }

    public void setNumpisos(int numpisos) {
        this.numpisos = numpisos;
    }

    public int getNumPisosEstacionamiento() {
        return numPisosEstacionamiento;
    }

    public void setNumPisosEstacionamiento(int numPisosEstacionamiento) {
        this.numPisosEstacionamiento = numPisosEstacionamiento;
    }

    public int getNumElevadores() {
        return numElevadores;
    }

    public void setNumElevadores(int numElevadores) {
        this.numElevadores = numElevadores;
    }
    public void mostrardatosEdificio() {
        System.out.println("Nombre de edificio: " + getNombre());
        System.out.println("Direccion del edicio: " + getDireccion());
        System.out.println("Numero de pisos Estacionamiento:" + getNumPisosEstacionamiento());
        System.out.println("Numero de pisos: "+getNumpisos());
        System.out.println("Numero de elevadores: " + getNumElevadores());
        System.out.println("Precio:" + getPrecio()+"$");
    }

}
