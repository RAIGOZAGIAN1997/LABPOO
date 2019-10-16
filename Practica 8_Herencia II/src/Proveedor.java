public class Proveedor extends Entidad{

    private int cantProducto;
    private double precioProducto;
    private String tipoProducto;
    public String codigoProveedor;


    public Proveedor  (String tipo, String nombre, int cantProducto, double precioProducto, String tipoProducto) {
        super(tipo,nombre);
        this.cantProducto = cantProducto;
        this.precioProducto=precioProducto;
        this.tipoProducto=tipoProducto;
    }


    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    @Override
    public void imprimir(){

        System.out.println("Tipo: "+getTipo());
        System.out.println("Nombre: " +getNombre());
        System.out.println("Cantidad de producto: " + getCantProducto());
        System.out.println("Tipo producto: "+ getTipoProducto());
        System.out.println("Precio del Producto: " + getPrecioProducto()+ "$");
    }
    @Override
    public String codigo(){
        String texto1=getNombre();
        String texto2 = getTipoProducto();
        codigoProveedor = texto1.substring(0,4) + " " + texto2.substring(0,4);
        System.out.println("El codigo del proveedor es: " + codigoProveedor);
        return codigoProveedor;
    }

}
