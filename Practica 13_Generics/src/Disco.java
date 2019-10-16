import java.util.*;
class Disco <T extends Archivo>{
    private List<T> resources = new ArrayList<>();

    public void aniadirArchivo(T x){
        resources.add(x);
    }
    public void eliminarArchivo(int x){
        resources.remove(x);
    }
    public T leerArchivo(int x){
        return resources.get(x);
    }
    public int obtenerCantidadArchivos(){
        return resources.size();
    }
    public void editarArchivo(int index, T x){
        resources.set(index, x);
    }
}
