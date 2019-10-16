import java.util.Scanner;
public class Alumnos {
        private Scanner teclado;
        private String  nombre [];
        private String  apellidomaterno [];
        private String  apellidopaterno[];
        private int  matricula[];
        private double  promedio[];
        public Alumnos(){
            teclado= new Scanner (System.in);
            nombre = new String[10];
            apellidomaterno = new String[10];
            apellidopaterno = new String [10];
            matricula = new int[10];
            promedio = new double [10];
            for(int i=0; i<5; i++){
            System.out.print("Dame el nombre: ");
            nombre [i] = teclado.next();
            System.out.print("Dame el apellido paterno: ");
            apellidopaterno [i] = teclado.next();
            System.out.print("Dame el apellido materno: ");
            apellidomaterno [i] = teclado.next();
            System.out.print("Dame la matricula: ");
            matricula [i] = teclado.nextInt();
            System.out.print("Dame el promedio: ");
            promedio [i] = teclado.nextDouble();
        }
    }
    public void imprimir() {
        for(int i=0;i<5;i++) {
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Apellido paterno: " + apellidopaterno[i]);
            System.out.println("Apeliido materno: " + apellidomaterno[i]);
            System.out.println("Matricula: " + matricula[i]);
            System.out.println("Promedio: " + promedio[i]);
        }
    }
    public static void main(String[] args) {
        Alumnos al=new Alumnos();
        al.imprimir();
    }
}

