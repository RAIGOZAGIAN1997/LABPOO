
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String nombredelproducto;
        char opcion;
        boolean salir=false;
        List<Producto> lista;
        lista = new LinkedList<>();
        System.out.println();
        System.out.println("Bienvenido a mi programa sobre lista de compras de productos by Gian");
        System.out.println();
        while (!salir) {
            System.out.println("A- Agregar un producto");
            System.out.println("B- Remover producto");
            System.out.println("C- Buscar producto");
            System.out.println("D- Modificar la cantidad del producto");
            System.out.println("E- Imprimir lista de los productos");
            System.out.println("F- Salir del programa");
            System.out.println();
            System.out.print("Selecciona una opción (Unicamente letras mayusculas): ");
            opcion = lectura.next().charAt(0);
            System.out.println();
            switch (opcion) {
                case 'A':
                    System.out.println();
                    System.out.println("----Agregar Producto----");
                    lectura.nextLine();
                    Producto producto = new Producto();
                    System.out.print("Cual es el nombre que tendra el producto? ");
                    producto.setNombre(lectura.nextLine());
                    System.out.println();
                    System.out.print("Cual es el precio del producoto $ ? ");
                    producto.setPrecio(lectura.nextDouble());
                    System.out.println();
                    System.out.print("Cuanta cantidad tendra el producto? ");
                    producto.setCantidad(lectura.nextInt());
                    System.out.println();
                    System.out.println();
                    lista.add(producto);
                    break;
                case 'B':
                    System.out.println();
                    System.out.println("----Remover Producto-----");
                    System.out.println();
                    lectura.nextLine();
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    nombredelproducto = lectura.nextLine();

                    for (int i = 0; i < lista.size(); i++) {
                        if (nombredelproducto.equals(lista.get(i).getNombre())) {
                            lista.remove(i);
                            System.out.println();
                            System.out.print("Se ha eliminado el producto con exito");
                        }
                    }
                    System.out.println();
                    System.out.println();
                    break;
                case 'C':
                    System.out.println();
                    System.out.println("----Buscar producto-----");
                    lectura.nextLine();
                    System.out.print("Cual es el nombre del producto que desea buscar? ");
                    nombredelproducto = lectura.nextLine();

                    for (int i = 0; i < lista.size(); i++) {
                        if (nombredelproducto.equals(lista.get(i).getNombre())) {
                            System.out.println();
                            System.out.println();
                            System.out.print("Nombre del producto: " + lista.get(i).getNombre());
                            System.out.println();
                            System.out.print("Precio del producto: " + lista.get(i).getPrecio());
                            System.out.println();
                            System.out.print(" Cantidad del producto: " + lista.get(i).getCantidad());
                        }
                    }
                    System.out.println();
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("----Modificar la cantidad del Producto-----");
                    System.out.println();
                    lectura.nextLine();
                    System.out.print("Cual es el nombre del producto que desea modificar? ");
                    nombredelproducto = lectura.nextLine();
                    for (int i = 0; i < lista.size(); i++) {
                        if (nombredelproducto.equals(lista.get(i).getNombre())) {
                            System.out.println();
                            System.out.print("Introduzca una nueva cantidad: ");
                            lista.get(i).setCantidad(lectura.nextInt());
                            System.out.print("Ha modificado el producto con exito");
                        }
                    }
                    System.out.println();
                    System.out.println();
                    break;
                case 'E':
                    System.out.println();
                    System.out.println("----Imprimir lista de los productos-----");
                    lectura.nextLine();
                    System.out.println();
                    System.out.print("Lista de los productos:");
                    System.out.println();
                    for(Producto prodcuts : lista){
                        System.out.print("\n\n Nombre del producto: " + prodcuts.getNombre());
                        System.out.print("\n Precio del producto: $" + prodcuts.getPrecio());
                        System.out.print("\n Cantidad del producto: " + prodcuts.getCantidad());
                        System.out.println();
                        System.out.println();
                        System.out.println();
                    }
                    break;
                case 'F':
                    salir = true;
                    System.out.println();
                    System.out.println("Gracias por usar mi programa de la lista de los productos :)!");
                    break;
            }
        }
    }
}
