import java.util.*;
public class Anotaciones {

    /**
     @author: GIAN MOLINA RAIGOZA

     @version: 14/05/2019/
     */

    public static void main(String[] ARGS) {

        Scanner cadenas = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        boolean SALIRDELPROGRAMA=false;
        int OPCION;
        Empleado empleados = new Empleado();
        Maquina maquinas = new Maquina();
        System.out.println("\n<<<<<BIENVENIDO A MAQUINAS>>>>>>\n");
        System.out.print("INTRODUCE EL NOMBRE DE LA MAQUINA:");
        maquinas.setNombre(cadenas.nextLine());
        System.out.print("INTRODUCE EL PRECIO POR UNIDAD: ");
        maquinas.setPrecioUnitario(numeros.nextDouble());
        System.out.print("INTRODUCE EL COSTO DEL EMPLEADO: ");
        maquinas.setCostoEmpleado(numeros.nextDouble());
        System.out.print("INTRODUCE LA CANTIDAD DE UNIDADES PRODUCIDAS: ");
        maquinas.setUnidadesProducidas(numeros.nextInt());


while (!SALIRDELPROGRAMA){

    System.out.println("1-AGREGAR EMPLEADO A MAQUINA");
    System.out.println("2-IMPRIMIR MAQUINA");
    System.out.println("3-SALIR");
    System.out.print("SELECCIONA UNA OPCION: ");
    OPCION = numeros.nextInt();

    switch (OPCION){

        case 1:
            System.out.println("<<<AGREGAR EMPLEADO>>>\n");
            System.out.print("INTRODUCE EL NOMBRE DEL EMPLEADO:");
            empleados.setNombre(cadenas.nextLine());
            System.out.print("INTRODUCE EL SALARIO DEL EMPLEADO:");
            empleados.setSueldo(numeros.nextDouble());
            maquinas.agregarempleado(empleados);
            break;
        case 2:
            System.out.println("\n<<<INFORMACION>>>\n");
            System.out.println("CANTIDAD DE DATOS DE EMPLEADOS MEDIANTE EL METODO SIZE: "+maquinas.calcularCantidadEmpleados());
            System.out.println("CANTIDAD DE EMPLEADOS: "+maquinas.calcularCantidadEmpleadosMaquina());
            System.out.println("GANANCIA DE LAS MAQUINAS: "+maquinas.CalcularGanancia());
            System.out.println();
            maquinas.imprimir();
        break;
        case 3:
            SALIRDELPROGRAMA=true;
            System.out.println("\nGRACIAS POR USAR MI PROGRAMA");
            break;
    }
}
    }
}
