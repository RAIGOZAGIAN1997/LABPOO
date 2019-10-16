import java.util.Scanner;
import java.io.*;

public class main {


    public static void main (String args [])throws FileNotFoundException, IOException{
        Scanner sc=new Scanner(System.in);
        String nombre = "palabras.txt";
        int numeropalabras;
        boolean salir = false;
        String palabrafinal;
        int opc;

        Procesador a= new Procesador();
        a.introducir();
        System.out.println("Seleccione una opción");

        while(!salir){

        System.out.println("1.Cambiar palabra");
        System.out.println("2.Remplazar Palabra");
        System.out.println("3.Contar palabras");
        System.out.println("4.Contar letras de palabras");
        System.out.println("5.Ordenar palabras");
        System.out.println("6.Escribir palabras en un archivo");
        System.out.println("7.Salir");
        System.out.println();
        System.out.print("Selecciona una opción: ");
        opc=sc.nextInt();

        switch(opc){

        case 1:
            a.introducir();
        break;

        case 2:
            a.remplazarpalabra();
            palabrafinal=a.getGenerado();
            System.out.println("La nueva palabra es: " + palabrafinal);

        break;

        case 3:
            a.numeropalabras();
        break;
        case 4:
            a.letras();
        break;
            case 5:
              a.ordenarpalabras();
                break;

            case 6:
                try{
                FileWriter fichero = new FileWriter("c:"+nombre);
                fichero.write(a.getTexto()+"\r\n");
                fichero.close();
                }catch(Exception ex){
                ex.printStackTrace();
                }
                break;
            case 7:
                salir= true;
                break;

        }
        }
        }


        }
