import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int i,opc,t;

        Cuenta cuenta1 = new Cuenta();


        while(!salir){
            System.out.println("1.Agregar Cuenta");
            System.out.println("2.Restar Dinero a cuenta");
            System.out.println("3.Salir");
            System.out.println();
            System.out.print("Selecciona una opción: ");
            opc=sc.nextInt();
            Cuenta a[] = new Cuenta[5];

            switch(opc){

                case 1:

                    for(i=0;i<a.length; i++) {
                        a[i] = new Cuenta();
                        System.out.print("Nombre : ");
                        a[i].setNombre(sc.next());
                        System.out.print("Número de cuenta : ");
                        a[i].setNumeroCuenta(sc.nextInt());
                        System.out.print("Saldo: ");
                        a[i].setSaldo(sc.nextInt());
                        System.out.println("Ingresa Credito");
                        a[i].setCredito(sc.nextInt());
                        System.out.println("\n");

                    }
                    for( i=0; i<a.length;i++) {

                        System.out.println("Cuentas agregadas: \n\n ");
                        System.out.println("Nombre del titular: " + a[i].getNombre());
                        System.out.println("Número de cuenta: " + a[i].getNumeroCuenta());
                        System.out.println("Saldo: " + a[i].getSaldo());
                        System.out.println("Credito: " + a[i].getCredito());
                        System.out.println();
                    }
                    break;

                case 2:

                    break;

                case 3:

                    salir = true;
                    break;

            }
        }
    }


}





