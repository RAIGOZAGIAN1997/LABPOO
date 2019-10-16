package actividad.pkg1;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int desde = 3;
     boolean esPrimo;
     int n;
     System.out.print("Introduzca la cantidad de numeros primos que se van a imprimir: ");       
     n = sc.nextInt(); 
    

        for (int i = desde; i <= n; i++) {
            esPrimo = true;

            for (int j = 2; j <= Math.sqrt(i) && esPrimo; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                
                System.out.print(i);
            }
  
    
}
          System.out.println();
}
}

