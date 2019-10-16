import java.util.Scanner;
public class agenciaartistas {

    public static void main(String[] args) {
        Scanner enteros = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String nombre, GeneroMusical, GeneroDramatico;
        int edad, Numobras, NumCanciones;
        double Pagobase;
        Artista a[] = new Artista[100];
        Artista b[] = new Artista[100];
        int i, j, opcion;
        System.out.println("Bienvenido a mi programa de Construccion");
        System.out.println();
        System.out.println("Descripcion: Este programa se encarga de crear Cantantes y Actores");
        System.out.println();
        boolean salir = false;
        while (!salir) {
            System.out.println("1.Agregar Cantante");
            System.out.println("2.Agregar Actor");
            System.out.println("3.Mostrar Artistas");
            System.out.println("4.Mostrar Cantantes");
            System.out.println("5.Mostrar Actores");
            System.out.print("Seleccione una opción: ");
            opcion = enteros.nextInt();
            switch (opcion) {
                case 1:
                    for (i = 0; i <a.length; i++) {
                        System.out.println();
                        System.out.println("Cantante: " + (i + 1));
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
                        System.out.print("Numero de Canciones: ");
                        NumCanciones = enteros.nextInt();
                        System.out.println();
                        System.out.print("Genero Musical: ");
                        GeneroMusical = teclado.nextLine();
                        System.out.println();
                        a[i] = new Cantante(nombre, edad, Pagobase, GeneroMusical, NumCanciones);
                        a[i].calcularpaga();
                    }
                    System.out.println();
                    break;
                case 2:
                    for (i = 0; i < b.length; i++) {
                        System.out.println();
                        System.out.println("Actor: " + (i + 1));
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
                        System.out.print("Numero de Obras: ");
                        Numobras = enteros.nextInt();
                        System.out.println();
                        System.out.print("Genero Dramatico: ");
                        GeneroDramatico = teclado.nextLine();
                        System.out.println();
                        b[i] = new Actor(nombre, edad, Pagobase, GeneroDramatico, Numobras);
                        b[i].calcularpaga();
                    }
                    System.out.println();
                    break;
                case 3:
                    for (i=0; i<a.length;i++) {
                        a[i].imprimir();
                    }
                for (i=0; i<b.length;i++) {
                    b[i].imprimir();
                    }
                    break;
                case 4:
                    for (i = 0; i < a.length; i++) {
                        a[i].imprimir();
                        System.out.println();
                    }
                    break;

                case 5:
                    for (i = 0; i < b.length; i++) {
                        a[i].imprimir();
                    }
                    break;

                case 6:
                    salir = true;
                    System.out.println();
                    System.out.println("Gracias por usar mi programa!");
                    break;
            }
        }
    }
}

