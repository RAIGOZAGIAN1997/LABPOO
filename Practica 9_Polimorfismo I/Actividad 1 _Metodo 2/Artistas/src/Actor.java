public class Actor extends Artista {

    private String GeneroDramatico;
    private int NumObras;
    public double fin;


    public Actor(String nombre, int edad, double pagoBase, String GeneroDramatico, int Numobras) {
        super(nombre, edad, pagoBase);
        this.GeneroDramatico = GeneroDramatico;
        this.NumObras = Numobras;
    }


    public String getGeneroDramatico() {
        return GeneroDramatico;
    }

    public void setGeneroDramatico(String GeneroDramatico) {
        this.GeneroDramatico = GeneroDramatico;
    }

    public int getNumObras() {
        return NumObras;
    }

    public void setNumObras(int NumObras) {
        this.NumObras = NumObras;
    }


    @Override

    public void imprimir() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Paga: " + getPagoBase());
        System.out.println("Genero: " + getGeneroDramatico());
        System.out.println("Numero de obras: " + getNumObras());
    }

    public double calcularpaga() {
        double pb = getPagoBase();
        int x = getNumObras();
        String y = getGeneroDramatico();
        if (y.equals("drama")) {
            fin = pb + (x * .10);
            System.out.println("Su paga final es de " + fin);

        }           if (y.equals("comedia")) {
            fin = pb + (x * .05);
            System.out.println("Su paga final es de " + fin);
        }
            return fin;

        }
    }



