public class Empleado extends Entidad {


    private double sueldo;
    private String departamento;
    public String codigoempleado;



    public Empleado  (String tipo, String nombre, double sueldo , String departamento) {
        super(tipo,nombre);
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void imprimir(){

        System.out.println("Tipo: "+getTipo());
        System.out.println("Nombre: " +getNombre());
        System.out.println("Sueldo: " + getSueldo()+ "$");
        System.out.println("Departamento: "+ getDepartamento());
    }
    @Override
     public String codigo( ){
        String texto1=getNombre();
        String texto2 = getDepartamento();
        codigoempleado = texto1.substring(0,4) + " " + texto2.substring(0,4);
        System.out.println("El codigo del empleado es: " + codigoempleado);
        return codigoempleado;
    }
}
