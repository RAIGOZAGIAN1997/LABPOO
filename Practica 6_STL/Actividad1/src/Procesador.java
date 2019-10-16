import java.util.Scanner;
import java.util.Arrays;

public class Procesador {

    private String texto;
    private String [] palabras;
    private int numpalabras;
    private int numletras;
    private String remplazarr;
    private String Nueva;
    private String generado;

    public String getGenerado() {
        return generado;
    }

    public void setGenerado(String generado) {
        this.generado = generado;
    }
    public String getTexto() {
        return texto;
    }

    public String getNueva() {
        return Nueva;
    }

    public void setNueva(String Nueva) {
        this.Nueva = Nueva;
    }

    public String getRemplazarr() {
        return remplazarr;
    }

    public void setRemplazarr(String remplazarr) {
        this.remplazarr = remplazarr;
    }


    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

    public int getNumpalabras() {
        int numpalabra = palabras.length;
        return numpalabras;
    }

    public void setNumpalabras(int numpalabras) {
        this.numpalabras = numpalabras;
    }

    public int getNumletras() {
        return numletras;
    }

    public void setNumletras(int numletras) {
        this.numletras = numletras;
    }
    public void introducir() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca las palabras:");
        texto = teclado.nextLine();
    }
    public void remplazarpalabra(){

        Scanner teclado = new Scanner (System.in);
        System.out.print("Ingresa la palabra que deseas sustituir: ");
        remplazarr=teclado.nextLine();
        System.out.print("Ingresa la nueva palabra: ");
        Nueva=teclado.nextLine();
        generado = texto.replace(remplazarr, Nueva);
    }
    public void letras (){
        int longi=texto.length();
        System.out.println("Cantidad de letras: "+longi);
    }


    public void numeropalabras(){
        System.out.println("La cantidad de palabras es: "+ texto.split("\\s+|\n|,").length);
    }

    public void ordenarpalabras(){
     String[] palabras = {"tito","lucas","andres"};
     Arrays.sort(palabras);
        System.out.println("Nombres:");
        for(String x: palabras){
            System.out.println(x);
        }


    }


}
