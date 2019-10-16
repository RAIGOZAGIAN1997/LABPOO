import java.util.*;
import java.util.List;
public class Maquina {
    List<Empleado> empleados = new ArrayList<Empleado>();
    Empleado listaempleados = new Empleado();
    Maquina(){


    }
    private String nombre;
    private double precioUnitario;
    private int unidadesProducidas;
    private double CostoEmpleado;


    public Maquina(String nombre, double precioUnitario, double costoEmpleado){
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.CostoEmpleado=costoEmpleado;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getUnidadesProducidas() {
        return unidadesProducidas;
    }

    public void setUnidadesProducidas(int unidadesProducidad) {
        this.unidadesProducidas = unidadesProducidad;
    }

    public double getCostoEmpleado() {
        return CostoEmpleado;
    }

    public void setCostoEmpleado(double CostoEmpleado) {
        this.CostoEmpleado = CostoEmpleado;
    }



    @Deprecated
    public int calcularCantidadEmpleados() {
        int aux=0;
        for (int i = 0; i < 10; i++) {

            aux++;

        }
        return aux;  /**@return: Retorna la cantidad de empleados aumentados mediante la variable aux*/
    }

    public int calcularCantidadEmpleadosMaquina(){
        return empleados.size();  /**@return: Retorna la cantidad de empleados */
    }


    public double CalcularGanancia(){
        return (precioUnitario*unidadesProducidas)-empleados.size()*CostoEmpleado; /**@return: Retorna la ganancia al realizar dicha operacion */
    }
    /** @param e El parámetro e define los objetos de elementos que se van a agregar a lista de empleados*/
    public void agregarempleado(Empleado e){
        empleados.add(e);
    }

    public void imprimir(){
        System.out.println("\n<<<DATOS DE LA MAQUINA>>>\n");
        System.out.println("NOMBRE MAQUINA: "+ getNombre());
        System.out.println("COSTO EMPLEADO: "+ getCostoEmpleado());
        System.out.println("PRECIO POR UNIDAD: "+ getPrecioUnitario());
        System.out.println("CANTIDAD DE UNIDADES PRODUCIDAS: "+ getUnidadesProducidas());

        System.out.println("\n<<<DATOS DE LOS EMPLEADOS>>>\n");
        for (Empleado listaempleados: empleados){
            System.out.println("NOMBRE EMPLEADO: " + listaempleados.getNombre());
            System.out.println("SUELDO: " + listaempleados.getSueldo());
        }


    }


}