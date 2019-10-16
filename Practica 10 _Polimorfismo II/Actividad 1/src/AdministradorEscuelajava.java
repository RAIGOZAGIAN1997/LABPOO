import java.util.Scanner;

public class AdministradorEscuelajava {

    public static void main(String[] args) {
        Scanner enteros = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;
        double Pagobase;
        int i, j, opcion;
        System.out.println("Bienvenido a mi programa de Entidad de Escuela");
        System.out.println();
        System.out.println("Descripcion: Este programa se encarga de crear Alumnos y profesores");
        System.out.println();
        boolean salir = false;
        while (!salir) {
            System.out.println("1.Añadir clase a Alumno");
            System.out.println("2.Añadir clase a Profesor");
            System.out.println("3.Imprimir Alumno");
            System.out.println("4.Imprimir Profesor");
            System.out.println("5.Añadir idioma a profesor");
            System.out.println("Salir");
            System.out.print("Seleccione una opción: ");
            opcion = enteros.nextInt();
            switch (opcion) {
                case 1:
                    for (i = 0; i < a.length; i++) {
                        System.out.println();
                        System.out.println("Alumno: " + (i + 1));
                        System.out.println();
                        System.out.print("Nombre:");
                        nombre = teclado.nextLine();
                        System.out.println();
                        System.out.print("Edad:");
                        edad = enteros.nextInt();
                        System.out.println();
                        System.out.print("Pago base: ");
                        Pagobase = enteros.nextDouble();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        a[i] = new Alumno(nombre, edad, Pagobase);
                    }
                    System.out.println();
                    break;
                case 2:
                    for (i = 0; i < a.length; i++) {
                        a[i].imprimir();
                        System.out.println();
                    }
                    break;
                case 3:
                    for (j = 0; j < a.length; j++) {
                        System.out.println();
                        System.out.println("Profesor: " + (j + 1));
                        System.out.println();
                        System.out.print("Nombre:");
                        nombre = teclado.nextLine();
                        System.out.println();
                        System.out.print("Edad:");
                        edad = enteros.nextInt();
                        System.out.println();
                        System.out.print("Pago base: ");
                        Pagobase = enteros.nextDouble();
                        System.out.println();
                        System.out.print("idiomas: ");
                        idiomas = enteros.nextInt();
                        System.out.println();
                        System.out.println();
                        a[j] = new Profesor(nombre, edad, Pagobase,idiomas);
                    }
                    System.out.println();
                    break;
                case 4:
                    for (j = 0; j < a.length; j++) {
                        a[j].imprimir();
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

}
