
import java.util.*;
public class Alumno {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList();
        double cal;
        System.out.println();
        System.out.println("Bienvenido a mi programa el cual consiste en crear un grupo de calificaciones de alumnos");
        System.out.println();
        System.out.println("Instrucciones:");
        System.out.println();
        System.out.println("1-Introduce las calificaciones de los Alumnos ");
        System.out.println("2-Presiona 0 para dejar de agregar calificaciones de alumnos");
        System.out.println("3-El programa mostrara el promedio del grupo, la minima y maxima calificacion");
        System.out.println("4-Finaliza el programa");
        System.out.println();
        do {
            System.out.print("Introduzca la calificación del alumno: ");
            cal = lectura.nextDouble();
            while(cal<0){
                System.out.println("No introducir numeros negativos");
                System.out.print("Introduzca la calificación del alumno: ");
                cal= lectura.nextDouble(); }
            if (cal != 0)
               notas.add(cal); }
        while (cal != 0);
        double promediogrupo = 0;
        for(Double i: notas){
            promediogrupo = promediogrupo + i/notas.size();
        }
        double maximacal = 0;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > maximacal) {
                maximacal = notas.get(i); } }
        double minimacal = maximacal;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) < minimacal) {
                minimacal = notas.get(i); } }
        System.out.println();
        System.out.println("Los resultados son los siguientes: ");
        System.out.println();
        System.out.println("Promedio final del grupo: " + promediogrupo);
        System.out.println("Mínima calificacion obtenida del grupo: " + minimacal);
        System.out.println("Máxima calificacion obtenida del grupo: " + maximacal);
        System.out.println();
        System.out.println("Gracias por utilizar mi programa :) ");
    }
}