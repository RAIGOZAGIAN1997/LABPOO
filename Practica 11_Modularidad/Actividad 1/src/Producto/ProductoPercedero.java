package Producto;

public class ProductoPercedero extends paqueteproducto{
    protected String FechaCaducidad;
    protected int caducado;

    public String getFechaCaducidad() {
        return FechaCaducidad;
    }

    public void setFechaCaducidad(String FechaCaducidad) {
        this.FechaCaducidad = FechaCaducidad;
    }

    public int getCaducado() {
        return caducado;
    }

    public void setCaducado(int caducado) {
        this.caducado = caducado;
    }
    
    
  public ProductoPercedero (String nombre, double precio, int cantidad,String FechaCaducidad, int caducado){
  super(nombre,precio,cantidad);
  this.FechaCaducidad=FechaCaducidad;
  this.caducado=caducado;
}
  
    @Override
 public void imprimir(){
     super.imprimir();
     System.out.println("Fecha de caducidad:"+getFechaCaducidad());
     System.out.println("Caducado: "+getCaducado());
 }
 
}
