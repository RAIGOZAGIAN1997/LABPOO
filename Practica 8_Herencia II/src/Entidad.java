public abstract class Entidad {
    private String tipo;
    private String nombre;

    public Entidad (String tipo,String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void imprimir();

    public abstract String codigo();

}
