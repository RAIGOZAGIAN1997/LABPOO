
package Producto;

public class paqueteproducto {

protected String nombre;
protected double precio;
protected int cantidad;
public paqueteproducto (String nombre, double precio, int cantidad){
   this.nombre=nombre;
   this.precio=precio;
   this.cantidad=cantidad;
}
       
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

public void imprimir(){
    System.out.println("Nombre: "+getNombre());
    System.out.println("Precio: "+getPrecio());
    System.out.println("Cantidad: "+getCantidad());
}
}