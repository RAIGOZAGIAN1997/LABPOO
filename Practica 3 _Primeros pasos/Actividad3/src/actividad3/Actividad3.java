/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

import java.util.Scanner;

public class Actividad3 {

    public static void main(String[] args) {

        String contra;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una contraseña a validar: ");
        contra = leer.nextLine();
        System.out.println("La contraseña es " + (validar(contra) ? "válida" : "no es válida."));
    }

    public static boolean validar(String contra) {
        return contra.matches("^(?=.*[0-9]{2})(?=.*[a-z]).{6,}$");
    }

}
