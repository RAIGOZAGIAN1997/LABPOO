public class Texto extends Archivo {
    private int numCaracteres;
    public int getNumCaracteres() {
        return numCaracteres;
    }
    public void setNumCaracteres(int numCaracteres) {
        this.numCaracteres = numCaracteres;
    }
    @Override
    public void imprimir(){
        System.out.println("Nombre:"+this.getNombre()+"");
        System.out.println("Tamaño:"+this.getTamanio()+"");
        System.out.println("Extension:"+this.getExtension()+"");
        System.out.println("Numero de Caracteres:"+this.getNumCaracteres()+"");
    }
}
