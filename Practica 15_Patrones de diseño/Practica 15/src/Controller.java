
public class Controller {
    private Model modelo;
    private View Vista;

    public Controller{

    }

    public Controller(Model Modelo , View Vista){
        this.modelo=Modelo;
        this.Vista=Vista;
    }
    public void crearPelicula(String nombre, int anio, String genero){



    }
    public void imprimirPelicula (String nombre,int anio, String genero){
        System.out.println(nombre);
        System.out.println(anio);
        System.out.println(genero);


    }

}
