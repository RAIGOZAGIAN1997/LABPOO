public class Cantante extends Artista {

    private String GeneroMusical;
    private int NumCanciones;
    public double pb;


    public Cantante(String nombre,int edad, double pagoBase, String GeneroMusical, int NumCanciones){
        super(nombre,edad,pagoBase);
        this.GeneroMusical=GeneroMusical;
        this.NumCanciones = NumCanciones;
    }

    public String getGeneroMusical() {
        return GeneroMusical;
    }

    public void setGeneroMusical(String GeneroMusical) {
        this.GeneroMusical = GeneroMusical;
    }

    public int getNumCanciones() {
        return NumCanciones;
    }

    public void setNumCanciones(int NumCanciones) {
        this.NumCanciones = NumCanciones;
    }
    @Override
    public void imprimir() {
        System.out.println("Nombre: " +getNombre());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Paga: "+getPagoBase());
        System.out.println("Genero Musical: "+getGeneroMusical());
        System.out.println("Numero de canciones: " +getNumCanciones());
    }
    @Override
    public double calcularpaga(){
        pb= getPagoBase();
        int x=getNumCanciones();
        pb = pb + (x*.10);
        System.out.println("Su paga final es de "+ pb);
        return pb;
    }


}


