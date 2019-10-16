import java.util.Scanner;
public class Administrador {
    public static void main(String args[]) {
        Scanner cadenas = new Scanner(System.in);
        Scanner enteros = new Scanner(System.in);
        String nombre, tipo, departamento;
        double sueldo;
        String nombreprovedor, tipoprovedor, tipoproducto,CodigoProveedor,CodigoEmpleado;
        int cantidadproducto, i, j, opcion;
        double preciodelproducto;
        boolean salir = false;

        Empleado empleados[] = new Empleado[5];
        Proveedor proveedor[] = new Proveedor[5];
        System.out.println("Bienvenido a mi programa by Gian");
        while (!salir) {
            System.out.println("1.Agregar Empleado");
            System.out.println("2.Agregar Proveedor");
            System.out.println("3.Mostrar Empleado");
            System.out.println("4.Mostrar Proveedor");
            System.out.println("5.Salir");
            System.out.print("Seleccione una opción: ");
            opcion = enteros.nextInt();
            switch (opcion) {
                case 1:
                    for (i = 0; i < empleados.length; i++) {
                        System.out.print("Cual es el tipo de empleado? ");
                        tipo = cadenas.nextLine();
                        System.out.println();
                        System.out.print("Cual es el nombre del empleado? ");
                        nombre = cadenas.nextLine();
                        System.out.println();
                        System.out.print("Cual es el sueldo del empleado? ");
                        sueldo = enteros.nextDouble();
                        System.out.println();
                        System.out.print("Cual es el departamento del empleado? ");
                        departamento = cadenas.nextLine();
                        System.out.println();
                        empleados[i] = new Empleado(tipo, nombre, sueldo, departamento);
                        empleados[i].codigo();
                    }
                    break;
                case 2:
                    for (j = 0; j < proveedor.length; j++) {
                        System.out.print("Cual es el tipo de proveedor? ");
                        tipoprovedor = cadenas.nextLine();
                        System.out.println();
                        System.out.print("Cual es el nombre del proveedor?");
                        nombreprovedor = cadenas.nextLine();
                        System.out.println();
                        System.out.print("Cual es el tipo de producto del proveedor? ");
                        tipoproducto = cadenas.nextLine();
                        System.out.println();
                        System.out.print("Cual es la cantidad de producto? ");
                        cantidadproducto = enteros.nextInt();
                        System.out.println();
                        System.out.print("Cual es el precio del producto? ");
                        preciodelproducto = enteros.nextDouble();
                        System.out.println();
                        proveedor[j] = new Proveedor(tipoprovedor, nombreprovedor, cantidadproducto, preciodelproducto, tipoproducto);
                        proveedor[j].codigo();
                    }
                    break;

                case 3:
                    System.out.print("Cual es el codigo del empleado que desea buscar? ");
                    CodigoEmpleado=cadenas.nextLine();
                    System.out.println();
                    for (i = 0; i < empleados.length; i++) {
                        if (CodigoEmpleado.equals(empleados[i].codigoempleado)) {
                            empleados[i].imprimir();
                        }
                        else {

                        }
                    }
                    break;
                case 4:
                    System.out.print("Cual es el codigo del Proveedor que desea buscar? ");
                    CodigoProveedor=cadenas.nextLine();
                    System.out.println();
                    for (j = 0; j < proveedor.length; j++) {
                        if (CodigoProveedor.equals(proveedor[j].codigoProveedor)) {
                            proveedor[j].imprimir();
                        }
                        else{
                        }
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println();
                    System.out.println("Gracias por usar mi programa!");
                    break;
            }
        }
    }
}


