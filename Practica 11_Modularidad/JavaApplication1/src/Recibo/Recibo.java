import Producto.paqueteproducto;

public class  Recibo extends paqueteproducto {
    private paqueteproducto productos [];
    private int cantidadProductos = 1;
    private final int maxproductos =10;

    public Recibo(){

    }

    public Recibo(int cantidadProductos,String nombre, double precio, int cantidad) {
        super(nombre,precio,cantidad);
        this.cantidadProductos = cantidadProductos;
        this.productos = new paqueteproducto[this.cantidadProductos];
    }


    public void imprimir(){
        super.imprimir();
    }

    public void agregarProducto(paqueteproducto p){
        this.productos[this.cantidadProductos]=p;
        while (this.cantidadProductos<maxproductos) {
            this.cantidadProductos++;
        }
    }

    public paqueteproducto[] getProductos() {
        return productos;
    }

    public void setProductos(paqueteproducto[] productos) {
        this.productos = productos;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }





}
