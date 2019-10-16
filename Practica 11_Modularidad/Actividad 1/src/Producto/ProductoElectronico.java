
package Producto;

public class ProductoElectronico extends paqueteproducto {
    
    protected String marca;
    protected int wats;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getWats() {
        return wats;
    }

    public void setWats(int wats) {
        this.wats = wats;
    }
    
    
        
  public ProductoElectronico (String nombre, double precio, int cantidad,String marca, int wats){
  super(nombre,precio,cantidad);
  this.marca=marca;
  this.wats=wats;
}
     @Override
 public void imprimir(){
     super.imprimir();
     System.out.println("Marca:"+getMarca());
     System.out.println("Wats: "+getWats());
 }
 
}
