import java.util.Scanner;
public class Administrador {

    public static void main(String[] args) {
        Scanner enteros = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String nombreCasa, nombreEdificio, direccionCasa, direccionEdificio;
        int numpisosCasa, numpisosEdificios, banios, numEstacionamiento, numElevadores, habitaciones;
        double precioCasa, precioEdificio;
        int i, j, opcion;
        System.out.println("Bienvenido a mi programa de Construccion");
        System.out.println();
        System.out.println("Descripcion: Este programa se encarga de construir casas y edificios");
        System.out.println();
        Casa arraycasa[] = new Casa[5];
        Edificio arrayedificio[] = new Edificio[5];
        boolean salir = false;
        while (!salir) {
            System.out.println("1.Agregar Casas");
            System.out.println("2.Mostrar Casas");
            System.out.println("3.Agregar Edificios ");
            System.out.println("4.Mostrar Edificios");
            System.out.println("5.Salir");
            System.out.print("Seleccione una opción: ");
            opcion = enteros.nextInt();
            switch (opcion) {

                case 1:
                    for (i = 0; i < arraycasa.length; i++) {
                        System.out.println();
                        System.out.println("Casa Numero: " + (i + 1));
                        System.out.println();
                        System.out.print("Nombre Casa:");
                        nombreCasa = teclado.nextLine();
                        System.out.println();
                        System.out.print("Direccion Casa:");
                        direccionCasa = teclado.nextLine();
                        System.out.println();
                        System.out.print("Numero de pisos de la casa: ");
                        numpisosCasa = enteros.nextInt();
                        System.out.println();
                        System.out.print("Numero de baños: ");
                        banios = enteros.nextInt();
                        System.out.println();
                        System.out.print("Numero habitaciones: ");
                        habitaciones = enteros.nextInt();
                        System.out.println();
                        System.out.print("Precio: ");
                        precioCasa = enteros.nextDouble();
                        arraycasa[i] = new Casa(nombreCasa, precioCasa, direccionCasa, numpisosCasa, habitaciones, banios);
                    }
                    System.out.println();
                    break;
                case 2:
                    for (i = 0; i < arraycasa.length; i++) {
                        arraycasa[i].mostrardatosCasa();
                        System.out.println();
                    }
                    break;
                case 3:
                    for (j = 0; j < arrayedificio.length; j++) {
                        System.out.println();
                        System.out.println("Edificio Numero: " + (j + 1));
                        System.out.println();
                        System.out.print("Nombre Edificio:");
                        nombreEdificio = teclado.nextLine();
                        System.out.println();
                        System.out.print("Direccion Edificio:");
                        direccionEdificio =teclado.nextLine();
                        System.out.println();
                        System.out.print("Numero de pisos del edificio: ");
                        numpisosEdificios = enteros.nextInt();
                        System.out.println();
                        System.out.print("Numero de estacionamientos ");
                        numEstacionamiento = enteros.nextInt();
                        System.out.println();
                        System.out.print("Numero Elevadores: ");
                        numElevadores = enteros.nextInt();
                        System.out.println();
                        System.out.print("Precio: ");
                        precioEdificio = enteros.nextDouble();
                        arrayedificio[j] = new Edificio(nombreEdificio, precioEdificio, direccionEdificio, numpisosEdificios, numEstacionamiento, numElevadores);
                    }
                    System.out.println();
                    break;
                case 4:
                    for (j = 0; j < arrayedificio.length; j++) {
                        arrayedificio[j].mostrardatosEdificio();
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
