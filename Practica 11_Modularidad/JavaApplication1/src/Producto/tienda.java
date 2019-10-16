/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;


import java.util.Scanner;
public class tienda {
    
    
    public static void main(String args[]){
        boolean salir=false;
        ProductoPercedero a= crearClase();
        ProductoElectronico b = crearClases();
        Recibo recibo= new Recibo();


        int opcion;
        Scanner enteros= new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        while (!salir) {
            System.out.println("1.Agregar Producto");
            System.out.println("2.Imprimir Recibo");
            System.out.println("3.Salir");
            System.out.print("Seleccione una opción: ");
            opcion = enteros.nextInt();
            switch (opcion) {
                case 1:
                    ProductoPercedero c=crearClase();
                    ((Recibo) recibo).agregarProducto( ProductoPercedero c);
                    ProductoElectronico d = crearClases();
                    ((Recibo) recibo).agregarProducto(ProductoElectronico d);
                    break;
                case 2:
                    a.imprimir();
                    b.imprimir();
                    break;      
                  
                case 3:
                    salir = true;
                    System.out.println();
                    System.out.println("Gracias por usar mi programa!");
                    break;
            }
        }
    }
    private static ProductoPercedero crearClase(){
        Scanner sc = new Scanner(System.in);
        Scanner enteros= new Scanner(System.in);
      String nombre,fecha;
      double precio;
      int cantidad,caducado;
        System.out.println("Ingrese el nombre del producto: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        precio=enteros.nextDouble();
        System.out.println("Ingrese la cantidad del producto: ");
        cantidad = enteros.nextInt();
        System.out.println("Ingrese la fecha del producto: ");
        fecha=sc.nextLine();
        System.out.println("Ingrese el producto caducado: ");
        caducado=sc.nextInt();
        
        return new ProductoPercedero(nombre,precio,cantidad,fecha,caducado);
     }
    private static ProductoElectronico crearClases(){
        Scanner sc = new Scanner(System.in);
        Scanner enteros= new Scanner(System.in);
      String nombrez,marca;
      double precioz;
      int cantidadz,wats;
        System.out.println("Ingrese el nombre del producto: ");
        nombrez=sc.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        precioz=enteros.nextDouble();
        System.out.println("Ingrese la cantidad del producto: ");
        cantidadz = enteros.nextInt();
        System.out.println("Ingrese la marca del producto: ");
        marca=sc.nextLine();
        System.out.println("Ingrese el watage del producto: ");
        wats=sc.nextInt();
        
        return new ProductoElectronico(nombrez,precioz,cantidadz,marca,wats);
     }

}

