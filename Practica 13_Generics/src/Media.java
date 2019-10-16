public class Media extends Archivo{
    private String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public void imprimir(){
        System.out.println("Nombre:"+this.getNombre()+"");
        System.out.println("Tamaño:"+this.getTamanio()+"");
        System.out.println("Extension:"+this.getExtension()+"");
        System.out.println("Tipo:"+this.getTipo()+"");

    }
}