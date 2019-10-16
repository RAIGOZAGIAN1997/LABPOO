import java.util.Scanner;

public class Generico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disco<Media> m = new Disco<>();
        Disco<Texto> t = new Disco<>();
        int opcion;
        int opcion2, opcion3;
        boolean salir = false;
        System.out.println("Bienvenido a mi programa by Gian");
        System.out.println();
        while (!salir) {
            System.out.println("A. Imprimir archivos en discos.");
            System.out.println("B. Añadir archivo al Disco de Media.");
            System.out.println("C. Añadir archivo al Disco de Texto.");
            System.out.println("D. Editar archivo de un Disco.");
            System.out.println("E. Eliminar archivo de un Disco.");
            System.out.println("F. Salir");
            System.out.println();
            System.out.print("Selecciona una opción (Unicamente letras mayusculas): ");
            opcion = sc.next().charAt(0);
            String nombre, extension, tipo;
            int tamanio, numCaracteres;
            switch (opcion) {
                case 'A':
                    System.out.println("----Imprimir archivos en discos----");

                    for (int i = 0; i < m.obtenerCantidadArchivos(); i++) {
                        m.leerArchivo(i).imprimir();
                    }
                    for (int i = 0; i < t.obtenerCantidadArchivos(); i++) {
                        t.leerArchivo(i).imprimir();
                    }
                    break;
                case 'B':
                    System.out.println("----Añadir archivo al Disco de Media----");
                    Media media = new Media();
                    sc.nextLine();
                    System.out.println("\nNombre:");
                    nombre = sc.nextLine();
                    System.out.println("Tamaño:");
                    tamanio = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Extension:");
                    extension = sc.nextLine();
                    System.out.println("Tipo:");
                    tipo = sc.nextLine();
                    media.setNombre(nombre);
                    media.setTamanio(tamanio);
                    media.setExtension(extension);
                    media.setTipo(tipo);
                    m.aniadirArchivo(media);
                    break;
                case 'C':
                    System.out.println("----Añadir archivo al Disco de Texto----");
                    Texto texto = new Texto();
                    sc.nextLine();
                    System.out.println();
                    System.out.println("Ingresa nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingresa tamaño:");
                    tamanio = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingresa extension:");
                    extension = sc.nextLine();
                    System.out.println("Ingresa el numero de Caracteres:");
                    numCaracteres = sc.nextInt();
                    texto.setNombre(nombre);
                    texto.setTamanio(tamanio);
                    texto.setExtension(extension);
                    texto.setNumCaracteres(numCaracteres);
                    t.aniadirArchivo(texto);
                    break;
                case 'D':
                    System.out.println("----Archivos a Editar-----");
                    System.out.println("1.Media");
                    System.out.println("2.Texto");
                    opcion2 =sc.next().charAt(0);
                    switch (opcion2) {
                        case 1:
                            System.out.println("----MEDIA----");
                            Media med = new Media();
                            int posicion;
                            sc.nextLine();
                            System.out.println();
                            System.out.println("Ingresa nombre:");
                            nombre = sc.nextLine();
                            System.out.println("Ingresa tamaño:");
                            tamanio = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ingresa extension:");
                            extension = sc.nextLine();
                            System.out.println("Ingresa tipo:");
                            tipo = sc.nextLine();
                            med.setNombre(nombre);
                            med.setTamanio(tamanio);
                            med.setExtension(extension);
                            med.setTipo(tipo);
                            System.out.println("Ingresa su posicion");
                            posicion = sc.nextInt();
                            m.editarArchivo(posicion, med);
                            break;
                        case 2:
                            System.out.println("----TEXTO----");
                            int posicioon;
                            Texto text = new Texto();
                            sc.nextLine();
                            System.out.println();
                            System.out.println("Ingresa nombre:");
                            nombre = sc.nextLine();
                            System.out.println("Ingresa tamaño:");
                            tamanio =sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ingresa extension:");
                            extension = sc.nextLine();
                            System.out.println("Ingresa la cantidad de numero de caracteres:");
                            numCaracteres = sc.nextInt();
                            text.setNombre(nombre);
                            text.setTamanio(tamanio);
                            text.setExtension(extension);
                            text.setNumCaracteres(numCaracteres);
                            System.out.println("Ingresa su posicion");
                            posicioon = sc.nextInt();
                            t.editarArchivo(posicioon, text);
                            break;
                    }
                    break;
                case 'E':
                    System.out.println("----Eliminar Archivo de un disco----");
                    System.out.println("Elige el archivo desea eliminar");
                    System.out.println("1-Media");
                    System.out.println("2-Texto");
                    opcion3 = sc.nextInt();
                    int x;
                    System.out.println("Ingrese la posicion:");
                    x = sc.nextInt();
                    switch (opcion3) {
                        case 1:
                            System.out.println("----MEDIA----");
                            m.eliminarArchivo(x);
                            break;
                        case 2:
                            System.out.println("----TEXTO----");
                            t.eliminarArchivo(x);
                            break;
                    }
                case 'F':
                    salir = true;
                    System.out.println();
                    System.out.println("Gracias por usar mi programa!");
                    break;
            }
        }
    }
}